package mvnTest.mvnTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleReadExample {

	public static void main(String[] args) {

		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("C:\\Users\\Inna\\eclipse-workspace\\mvnTest\\color.json"));

			// create main json object
			JSONObject jsonObject = (JSONObject) obj;

			// main array "colors"
			JSONArray colorsList = (JSONArray) jsonObject.get("colors");
			Iterator<String> it = colorsList.iterator();
			while (it.hasNext()) {
				Object slide = it.next();
				JSONObject jsonObject2 = (JSONObject) slide;

				String color = (String) jsonObject2.get("color");
				System.out.println("Color is: " + color);

				String category = (String) jsonObject2.get("category");
				System.out.println("Category is: " + category);

				String type = (String) jsonObject2.get("type");
				System.out.println("Type is: " + type);

				// create object for nested block
				JSONObject codesList = (JSONObject) jsonObject2.get("code");
				JSONArray rgba = (JSONArray) codesList.get("rgba");
				System.out.println("RGBA code is: " + rgba);
				String hex = (String) codesList.get("hex");
				System.out.println("HEX code is: " + hex);
				System.out.println();
			}
		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
