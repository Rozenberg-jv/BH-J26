package by.belhard.j26.homeworks.hw7.task2;

import by.belhard.j26.homeworks.hw7.task2.pets.*;

public class Task2 {

	public static void main(String[] args) {

		Pet dog = new Dog("Sharik");
		Pet cat = new Cat("Murka");
		Pet fish = new Fish("Blob");

		Master master1 = new Master("Vasily", dog);
		Master master2 = new Master("Tatyana", cat);
		Master master3 = new Master("Igor");

		System.out.println(master1);
		System.out.println(master2);
		System.out.println(master3);
		System.out.println();

		master1.play();
		master2.play();
		master3.play();
		System.out.println();

		master1.play(master2.getPet());
		master3.play(fish);
	}

}
