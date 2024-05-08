package Throwable.Exception;

import java.io.PrintStream;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XPathException {
   public static void main(String[] args) {
      try {
         XPathFactory xPathFactory = XPathFactory.newInstance();
         XPath xPath = xPathFactory.newXPath();
         XPathExpression expression = xPath.compile("//book[author='J.K. Rowling']");
         String xmlDocument = "<library><book><author>J.K. Rowling</author><title>Harry Potter</title></book></library>";
         Object result = expression.evaluate(xmlDocument, XPathConstants.NODESET);
         NodeList nodes = (NodeList)result;

         for(int i = 0; i < nodes.getLength(); ++i) {
            Node node = nodes.item(i);
            PrintStream var10000 = System.out;
            NodeList var10001 = node.getChildNodes();
            var10000.println("Titulo del libro: " + var10001.item(1).getTextContent());
         }
      } catch (XPathExpressionException var9) {
         System.err.println("Error al evaluar la expresion XPath: " + var9.getMessage());
      }

   }
}
