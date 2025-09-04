package HW23.Parsers.SAX;

import HW23.Model.Author;
import HW23.Model.Sonnet;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    public Sonnet sonnet;
    public List<String> lines;
    public Author author;

    private boolean isFirstName = false;
    private boolean isLastName = false;
    private boolean isTitle = false;
    private boolean isLine = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("sonnet")) {
            sonnet = new Sonnet();
            sonnet.setType(attributes.getValue("type"));
        }
        if (qName.equals("author")) {
            author = new Author();
        }
        if (qName.equals("lines")) {
            lines = new ArrayList<>();
        }
        if (qName.equals("firstName")){
            isFirstName = true;
        }
        if (qName.equals("lastName")){
            isLastName = true;
        }
        if (qName.equals("title")){
            isTitle = true;
        }
        if (qName.equals("line")){
            isLine = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if (value.isEmpty()){
            return;
        }
        if (isFirstName){
            author.setFirstName(value);
            isFirstName = false;
        }
        if (isLastName){
            author.setLastName(value);
            isLastName = false;
        }
        if (isTitle){
            sonnet.setTitle(value);
            isTitle = false;
        }
        if (isLine){
            lines.add(value);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("author")){
            sonnet.setAuthor(author);
        }
        if (qName.equals("lines")){
            sonnet.setLines(lines);
        }
        if (qName.equals("line")){
            isLine = false;
        }
    }

    public Sonnet getSonnet(){
        return sonnet;
    }
}
