package by.belhard.j26.homeworks.hw6.task2;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == 1 && j == 1) {
					System.out.printf("%4s", "");
					continue;
				}

				System.out.printf("%-4d", i * j);
			}
			System.out.println();
		}

	}

}
