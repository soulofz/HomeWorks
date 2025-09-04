package HW23.Parsers.DOM;

import HW23.Model.Author;
import HW23.Model.Sonnet;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainDom {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder domBuilder = domFactory.newDocumentBuilder();
        List<String> lines = new ArrayList<>();

        Document document = domBuilder.parse(new File("file.xml"));
        document.getDocumentElement().normalize();

        String firstName = document.getElementsByTagName("firstName").item(0).getTextContent();
        String lastName = document.getElementsByTagName("lastName").item(0).getTextContent();
        String title = document.getElementsByTagName("title").item(0).getTextContent();
        String type = document.getDocumentElement().getAttribute("type");

        NodeList nodeList = document.getElementsByTagName("line");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            lines.add(node.getTextContent());
        }

        Author author = new Author(firstName, lastName);
        Sonnet sonnet = new Sonnet(type, author, title, lines);

        String fileName = sonnet.getAuthor().getFirstName() + "_"
                + sonnet.getAuthor().getLastName() + "_"
                + sonnet.getTitle();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : sonnet.getLines()){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        System.out.println("Файл создан.");
    }
}
