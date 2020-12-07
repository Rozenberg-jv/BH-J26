package by.belhard.j26.homeworks.hw7.task1;

import java.util.Objects;

public class Author {

	private static final String DEFAULT_FIRSTNAME = "Vasily";
	private static final String DEFAULT_LASTNAME = "Pupkin";
	private static final int DEFAULT_AGE = 40;

	private String firstname;
	private String lastname;
	private int age;

	public Author(String firstname, String lastname, int age) {

		if (firstname == null || firstname.isEmpty())
			firstname = DEFAULT_FIRSTNAME;
		if (lastname == null || lastname.isEmpty())
			lastname = DEFAULT_LASTNAME;
		if (age < 14)
			age = DEFAULT_AGE;

		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public String getFirstname() {

		return firstname;
	}

	public String getLastname() {

		return lastname;
	}

	public int getAge() {

		return age;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Author))
			return false;
		Author author = (Author) o;
		return Objects.equals(firstname, author.firstname) &&
				Objects.equals(lastname, author.lastname);
	}

	@Override
	public int hashCode() {

		return Objects.hash(firstname, lastname);
	}

	@Override
	public String toString() {

		return "Author{" +
				"firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", age=" + age +
				'}';
	}
}
