package by.belhard.j26.homeworks.hw7.task2.pets;

public class Dog extends AbstractPet {

	public Dog(String name) {

		super(name);
	}

	@Override
	public void play() {

		System.out.println(this.getName() + " says 'Woof-woof'");
	}

	@Override
	public String toString() {

		return String.format("Dog '%s'", getName());
	}
}
