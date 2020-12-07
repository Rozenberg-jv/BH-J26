package by.belhard.j26.homeworks.hw7.task2.pets;

public abstract class AbstractPet implements Pet {

	private final String name;

	public AbstractPet(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

}
