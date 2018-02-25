package mvnTest.mvnTest;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserBooksXml {

   public static void main(String[] args) {

      try {
         File inputFile = new File("C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\mvnTest\\mvnTest\\books.xml");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         UserHandler userhandler = new UserHandler();
         saxParser.parse(inputFile, userhandler);     
      } catch (Exception e) {
         e.printStackTrace();
      }
   }   
}

class UserHandler extends DefaultHandler {

   boolean bTitle = false;
   boolean bAuthor = false;
   boolean bCountry = false;
   boolean bYear = false;

   @Override
   public void startElement(
      String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
      
      if (qName.equalsIgnoreCase("department")) {
         String name = attributes.getValue("name");
         System.out.println("Department : " + name);
      } else if (qName.equalsIgnoreCase("title")) {
         bTitle = true;
      } else if (qName.equalsIgnoreCase("author")) {
         bAuthor = true;
      } else if (qName.equalsIgnoreCase("country")) {
         bCountry = true;
      }
      else if (qName.equalsIgnoreCase("year")) {
         bYear = true;
      }
   }

   @Override
   public void endElement(String uri, 
      String localName, String qName) throws SAXException {
      
      if (qName.equalsIgnoreCase("department")) {
         System.out.println("End Element :" + qName);
      }
   }

   @Override
   public void characters(char ch[], int start, int length) throws SAXException {

      if (bTitle) {
         System.out.println("Title: " + new String(ch, start, length));
         bTitle = false;
      } else if (bAuthor) {
         System.out.println("Author: " + new String(ch, start, length));
         bAuthor = false;
      } else if (bCountry) {
         System.out.println("Publication Country: " + new String(ch, start, length));
         bCountry = false;
      } else if (bYear) {
         System.out.println("Publication Year: " + new String(ch, start, length));
         bYear = false;
      }
   }
}
