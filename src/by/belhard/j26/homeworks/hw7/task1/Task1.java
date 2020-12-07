package by.belhard.j26.homeworks.hw7.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {

		Author author1 = new Author("Vasily", "Ivanov", 54);
		Author author2 = new Author("Igor", "Petrov", 23);
		Author author3 = new Author("Tatyana", "Vasilieva", 31);

		Book book1 = new Book("Belye krilya", 321, Collections.singletonList(author1), BookFormat.A5);
		Book book2 = new Book("Sinie paltsi", 40, Collections.singletonList(author2), BookFormat.A3);
		Book book3 = new Book("Rozovie zamki", 15, Arrays.asList(author1, author3), BookFormat.A5);
		Book book4 = new Book("Chernye kliushki", 128, Arrays.asList(author2, author3), BookFormat.A4);

		List<Book> books = Arrays.asList(book1, book2, book3, book4);

		//		System.out.println(book1);
		//		System.out.println(book3);

		List<Book> booksByAuthor = Cartoteka.getBooksByAuthor(books, "Vasily", "Ivanov");
		System.out.println(booksByAuthor);

		/*Cartoteka cartoteka = new Cartoteka();
		List<Book> booksByAuthorNonStatic = cartoteka.getBooksByAuthorNonStatic(books, "Vasily", "Ivanov");*/
	}

}
