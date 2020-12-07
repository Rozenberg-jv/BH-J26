package by.belhard.j26.homeworks.hw7.task2;

import by.belhard.j26.homeworks.hw7.task2.pets.Pet;

public class Master {

	private String name;
	private Pet pet;

	public Master(String name, Pet pet) {

		this.name = name;
		this.pet = pet;
	}

	public Master(String name) {

		this(name, null);
	}

	public void play() {

		play(this.pet);
	}

	public void play(Pet pet) {

		System.out.println(name + " is playing with " + (pet != null ? pet : "nothing"));
	}

	public Pet getPet() {

		return pet;
	}

	@Override
	public String toString() {

		return String.format("%s has %s", name, pet != null ? "pet " + pet : "no pet");
	}
}
