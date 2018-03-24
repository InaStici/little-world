package mvnTest.mvnTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeBook {

	public static void main(String[] args) {

		Book book = new Book();

		book.name = "Inspector of The Dead";
		book.author = "David Morrell";
		book.publishingHouse = "Morrell Enterprises, Inc.";
		book.isbn = "978-5-389-10940-7";
		book.characters.add("Thomas DeQuincy");
		book.characters.add("Emily DeQuincy");
		book.characters.add("Inspector Ryan");
		book.characters.add("Sergeant Becker");

		try {
			FileOutputStream fileOut = new FileOutputStream("book1.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(book);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in book1.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
