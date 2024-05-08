package Throwable.Exception;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLParseException {
   public static void main(String[] args) {
      try {
         String invalidXML = "<rootElement><childElement></child";
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = factory.newDocumentBuilder();
         builder.parse(new InputSource(new StringReader(invalidXML)));
      } catch (SAXException | ParserConfigurationException var5) {
         System.err.println("Error: XML parsing error.");
         System.err.println("  Message: " + var5.getMessage());
      } catch (Exception var6) {
         System.err.println("Error: Unexpected exception during parsing.");
         var6.printStackTrace();
      }

   }
}
