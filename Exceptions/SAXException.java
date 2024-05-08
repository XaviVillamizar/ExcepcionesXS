package Throwable.Exception;

import Throwable.Exception.SAXException.1;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

public class SAXException {
   public static void main(String[] args) {
      try {
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser parser = factory.newSAXParser();
         DefaultHandler handler = new 1();
         String invalidXml = "<data>This is some data";
         parser.parse(invalidXml, handler);
      } catch (Exception var5) {
         System.err.println("Error: Parsing failed due to invalid XML.");
         System.err.println("  Reason: " + var5.getMessage());
      }

   }
}
