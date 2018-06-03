package parsingPractice;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Students_DOM_XML_Parsing {

	public static void main(String[] args) {

		int temp;
		Node nNode;
		Element element;
		String value = null;
		String number = null;
		String firstName = null;
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new File(
					"C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\src\\main\\java\\parsingPractice\\students.xml"));

			// normalize text representation
			doc.getDocumentElement().normalize();
			System.out.println("Root element of the doc is: " + doc.getDocumentElement().getNodeName());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			NodeList nList = doc.getElementsByTagName("student");

			for (temp = 0; temp < nList.getLength(); temp++) {
				nNode = nList.item(temp);
				// System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					element = (Element) nNode;
					number = element.getAttribute("no");
					firstName = element.getElementsByTagName("firstname").item(0).getTextContent();
					System.out.println("\nStudent number: " + number);
					System.out
							.println("Last name: " + element.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("First name: " + firstName);
					map.put(number, firstName);
					// value = map.get(number);
					System.out.println(
							"Birth year: " + element.getElementsByTagName("birthyear").item(0).getTextContent());
					System.out.println(
							"Average mark: " + element.getElementsByTagName("averagemark").item(0).getTextContent());
					// if (element.getNodeName().equalsIgnoreCase("educprogramm")) {
					System.out.println("Education programm: "
							+ element.getElementsByTagName("educprogramm").item(0).getTextContent());
					System.out.println("Education programm: "
							+ element.getElementsByTagName("studprogramm").item(0).getTextContent());

					System.out.println("Country: " + element.getElementsByTagName("country").item(0).getTextContent());
					System.out.println("City: " + element.getElementsByTagName("city").item(0).getTextContent());
					System.out.println(
							"Mobile phone: " + element.getElementsByTagName("mobilephone").item(0).getTextContent());
					System.out.println(
							"Desk phone: " + element.getElementsByTagName("deskphone").item(0).getTextContent());

					System.out.println();

				}

			}
			if (number.equals("101")) {
				System.out.println("Students of group: " + map.get(number));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
