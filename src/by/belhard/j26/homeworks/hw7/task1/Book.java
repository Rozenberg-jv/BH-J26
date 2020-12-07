package by.belhard.j26.homeworks.hw7.task1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static by.belhard.j26.homeworks.hw7.task1.BookFormat.A3;

public class Book {

	private static final String DEFAULT_TITLE = "default title";
	private static final int DEFAULT_PAGES = 15;
	private static final List<Author> DEFAULT_AUTHORS = Arrays.asList(new Author("Vasily", "Vasiliev", 55));
	private static final BookFormat DEFAULT_FORMAT = A3;

	private String title;
	private int pages;
	private List<Author> authors;
	private BookFormat format;

	public Book(String title, int pages, List<Author> authors, BookFormat format) {

		if (title == null || title.isEmpty())
			title = DEFAULT_TITLE;
		if (pages <= 2)
			pages = DEFAULT_PAGES;
		if (authors == null)
			authors = DEFAULT_AUTHORS;
		if (format == null)
			format = DEFAULT_FORMAT;

		this.title = title;
		this.pages = pages;
		this.authors = authors;
		this.format = format;
	}

	public String getTitle() {

		return title;
	}

	public int getPages() {

		return pages;
	}

	public List<Author> getAuthors() {

		return authors;
	}

	public BookFormat getFormat() {

		return format;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Book))
			return false;
		Book book = (Book) o;
		return Objects.equals(title, book.title) &&
				Objects.equals(authors, book.authors);
	}

	@Override
	public int hashCode() {

		return Objects.hash(title, authors);
	}

	@Override
	public String toString() {

		return "Book{" +
				"title='" + title + '\'' +
				", pages=" + pages +
				", authors=" + authors +
				", format=" + format +
				'}';
	}
}
