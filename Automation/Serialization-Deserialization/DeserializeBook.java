package mvnTest.mvnTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeBook {

	public static void main(String[] args) {
		Book book = null;
		try {
			FileInputStream fileIn = new FileInputStream("book1.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			book = (Book) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}

		System.out.println("Deserialized Book...");
		System.out.println("Name: " + book.name);
		System.out.println("Author: " + book.author);
		System.out.println("ISBN: " + book.isbn);
		System.out.println("Publishing House: " + book.publishingHouse);
		System.out.println("Main characters: " + book.characters);
	}

}
