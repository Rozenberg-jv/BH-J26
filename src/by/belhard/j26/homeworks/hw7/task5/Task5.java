package by.belhard.j26.homeworks.hw7.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList(
				"maxim", "vasily", "igor", "muka", "impichment", "otniud"
		);

		List<String> result1 = getStringsContainChar(strings, 'a');
		System.out.println(result1);

		System.out.println();

		List<String> result2 = getStringsContainChar(strings, 'm');
		System.out.println(result2);

	}

	private static List<String> getStringsContainChar(List<String> strings, char c) {

		List<String> result = new ArrayList<>();

		for (String s : strings) {
			if (s.contains("" + c))
				result.add(s);
		}

		return result;
	}

}
