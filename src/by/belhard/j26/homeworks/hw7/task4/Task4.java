package by.belhard.j26.homeworks.hw7.task4;

import java.util.Arrays;
import java.util.List;

public class Task4 {

	private static List<Person> persons = Arrays.asList(
			new Person("Vasily"),
			new Person("Tatyana"),
			new Person("Igor"),
			new Person("Nikolay"),
			new Person("Pahom"),
			new Person("Vasily")
	);

	public static void main(String[] args) {

		Person person = getPersonByName("Nikolay");
		System.out.println(person == null ? "null" : person.toString());
		System.out.println();

		person = getPersonByName("Ibragim");
		System.out.println(person == null ? "null" : person.toString());
		//		System.out.println(person.toString());
		System.out.println();

		person = getPersonByName("Vasily");
		System.out.println(person == null ? "null" : person.toString());
		System.out.println();

		System.out.println(person);
		persons.forEach(p -> System.out.printf("%s : %s\n", p.getName(), p));
	}

	private static Person getPersonByName(String name) {

		for (Person person : persons)
			if (person.getName().equals(name))
				return person;

		return null;
	}
}
