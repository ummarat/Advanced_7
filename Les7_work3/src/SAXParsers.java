import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SAXParsers {
    public static void saxParser(File file) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        DefaultHandler handler = new DefaultHandler() {

            boolean city = false;
            boolean street = false;
            boolean house = false;

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                if (qName.equalsIgnoreCase("city")) {
                    city = true;
                }
                if (qName.equalsIgnoreCase("street")) {
                    street = true;
                }
                if (qName.equalsIgnoreCase("house")) {
                    house = true;
                }
            }
            @Override
            public void characters(char ch[], int start, int length) throws SAXException {
                // Если перед этим мы отметили, что имя тэга name - значит нам надо текст использовать.
                if (city) {
                    System.out.println("City: " + new String(ch, start, length));
                    city = false;
                }
                if (street) {
                    System.out.println("Street: " + new String(ch, start, length));
                    street = false;
                }
                if (house) {
                    System.out.println("House: " + new String(ch, start, length));
                    house = false;
                }
            }
        };
        saxParser.parse(file, handler);
    }
}
