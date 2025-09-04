package HW23.Parsers.SAX;

import HW23.Model.Sonnet;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainSax {
    public static Sonnet parse() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();

        SaxHandler saxHandler = new SaxHandler();
        saxParser.parse(new File("file.xml"), saxHandler);

        Sonnet sonnet = saxHandler.getSonnet();

        String fileName = sonnet.getAuthor().getFirstName() + "_"
                + sonnet.getAuthor().getLastName() + "_"
                + sonnet.getTitle();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : sonnet.getLines()) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        System.out.println("Файл создан.");
        return sonnet;
    }
}
