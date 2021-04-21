package xml;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestXml {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("temp.xml"));
        writer.writeStartDocument();
        writer.writeStartElement("root");
        writer.writeStartElement("font");
        writer.writeAttribute("size", "20");
        writer.writeCharacters("TimesNewRoman");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();
    }
}
