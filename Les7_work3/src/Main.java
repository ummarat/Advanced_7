import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws XMLStreamException, IOException, ParserConfigurationException, SAXException {
        BuildXML.buildXML();
        SAXParsers.saxParser(new File("temp.xml"));
    }
}
