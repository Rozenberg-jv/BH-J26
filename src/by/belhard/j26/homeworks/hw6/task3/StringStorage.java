package by.belhard.j26.homeworks.hw6.task3;

import java.util.Arrays;

public class StringStorage {

	private final String[] strings;

	public StringStorage(String... strings) {

		this.strings = strings;
	}

	public void swapElements(int a, int b) {

		if (a < 0 || a >= strings.length || b < 0 || b >= strings.length || a == b) {
			System.out.println("Not valid input data!");
			return;
		}

		String temp = strings[a];
		strings[a] = strings[b];
		strings[b] = temp;
	}

	public String[] getStrings() {

		return strings;
	}

	@Override
	public String toString() {

		return Arrays.toString(strings);
	}
}
