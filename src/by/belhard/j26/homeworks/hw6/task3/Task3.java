package by.belhard.j26.homeworks.hw6.task3;

public class Task3 {

	public static void main(String[] args) {

		StringStorage storage = new StringStorage("ld", "wor", "llo", "he");

		System.out.println(storage);

		storage.swapElements(0, 4); // wrong input
		storage.swapElements(0, 3);
		storage.swapElements(1, 2);

		System.out.println(storage);
	}

}
