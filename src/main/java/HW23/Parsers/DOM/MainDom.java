package HW23.Parsers.DOM;

import HW23.Model.Author;
import HW23.Model.Sonnet;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainDom {
    public static Sonnet parse() throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Sonnet sonnet = new Sonnet();

        Document document = builder.parse(new File("file.xml"));

        Author author = new Author();
        author.setFirstName(document.getElementsByTagName("firstName").item(0).getTextContent());
        author.setLastName(document.getElementsByTagName("lastName").item(0).getTextContent());
        sonnet.setAuthor(author);

        sonnet.setTitle(document.getElementsByTagName("title").item(0).getTextContent());

        NodeList nodeList = document.getElementsByTagName("line");
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            lines.add(nodeList.item(i).getTextContent());
        }
        sonnet.setLines(lines);

        return sonnet;
    }
}