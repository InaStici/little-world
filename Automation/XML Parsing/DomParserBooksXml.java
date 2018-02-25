import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserBooksXml {

   public static void main(String[] args) {

     try {
			File inputFile = new File("C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\mvnTest\\mvnTest\\books.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("department");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Department name : " + eElement.getAttribute("name"));
					System.out.println("Book title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("Author name : " + eElement.getElementsByTagName("author").item(0).getTextContent());
					System.out.println("Publication country : " + eElement.getElementsByTagName("country").item(0).getTextContent());
					System.out.println("Publication year : " + eElement.getElementsByTagName("year").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
   }
}
