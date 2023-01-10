import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BuildXML {

        public static void buildXML() throws XMLStreamException, FileNotFoundException {
            File file = new File("temp.xml");
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileOutputStream(file));

            writer.writeStartDocument("UTF-8","1.0");

            writer.writeStartElement("addresses_list");
            writer.writeStartElement("address");
            writer.writeStartElement("city");
            writer.writeAttribute("size", "big");
            writer.writeCharacters("Kyiv");
            writer.writeEndElement();
            writer.writeStartElement("street");
            writer.writeCharacters("Khreshchatyk");
            writer.writeEndElement();
            writer.writeStartElement("house");
            writer.writeCharacters("19");
            writer.writeEndElement();
            writer.writeEndElement();


            writer.writeStartElement("address2");
            writer.writeStartElement("city");
            writer.writeAttribute("size", "big");
            writer.writeCharacters("Lviv");
            writer.writeEndElement();
            writer.writeStartElement("street");
            writer.writeCharacters("Sichovykh Striltsiv");
            writer.writeEndElement();
            writer.writeStartElement("house");
            writer.writeCharacters("5");
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndDocument();

            writer.flush();
            writer.close();
        }
    }

