package by.belhard.j26.homeworks.hw7.task2.pets;

public class Fish extends AbstractPet {

	public Fish(String name) {

		super(name);
	}

	@Override
	public void play() {

		System.out.println(this.getName() + " is swimming around");
	}

	@Override
	public String toString() {

		return String.format("Fish '%s'", getName());
	}
}
