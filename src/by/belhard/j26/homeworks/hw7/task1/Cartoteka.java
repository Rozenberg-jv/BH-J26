package by.belhard.j26.homeworks.hw7.task1;

import java.util.ArrayList;
import java.util.List;

public class Cartoteka {

	public static List<Book> getBooksByAuthor(List<Book> books, String fname, String lname) {

		List<Book> result = new ArrayList<>();

		Author searchAuthor = new Author(fname, lname, 100);

		for (Book book : books) {
			for (Author author: book.getAuthors()) {
				if (searchAuthor.equals(author)) {
					result.add(book);
					break;
				}
			}
		}

		return result;
	}
}
