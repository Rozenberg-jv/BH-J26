package by.belhard.j26.homeworks.hw7.task1;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class Cartoteka {

    public static List<Book> getBooksByAuthor(List<Book> books, String fname, String lname) {

        List<Book> result = new ArrayList<>();

        Author searchAuthor = new Author(fname, lname, 100);

        for (Book book : books) {

            List<Author> authors = book.getAuthors();
            boolean hasAuthor = authors.contains(searchAuthor);
            if (hasAuthor)
                result.add(book);

            /*for (Author author : book.getAuthors()) {
                if (searchAuthor.equals(author)) {
                    result.add(book);
                    break;
                }
            }*/
        }

        return result;
    }

    /*public List<Book> getBooksByAuthorNonStatic(List<Book> books, String fname, String lname) {

        List<Book> result = new ArrayList<>();

        Author searchAuthor = new Author(fname, lname, 100);

        for (Book book : books) {

            List<Author> authors = book.getAuthors();
            boolean hasAuthor = authors.contains(searchAuthor);
            if (hasAuthor)
                result.add(book);
        }

        return result;
    }*/
}
