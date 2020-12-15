package by.belhard.j26.homeworks.hw10.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	private static final String EXIT_STRING = "exit";

	public static void main(String[] args) {

		try {
			BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

			String input = "";

			while (true) {

				input = rdr.readLine();
				if (EXIT_STRING.equals(input))
					break;

				int operand1, operand2;
				String operationMark;

				try {
					String stringWithoutSpaces = input.replaceAll("(\\s)*", "");

					operationMark = stringWithoutSpaces.replaceAll("(\\d)*", "");

					String[] operands = stringWithoutSpaces.split(String.format("[\\%s]", operationMark));

					if (operationMark.isEmpty() || operands.length != 2)
						throw new RuntimeException();

					operand1 = Integer.parseInt(operands[0]);
					operand2 = Integer.parseInt(operands[1]);

				} catch (RuntimeException e) {
					System.err.println("Wrong input");
					continue;
				}

				try {
					double result = calcExpression(operationMark, operand1, operand2);
					System.out.println(result);
				} catch (UnsupportedOperationException e) {
					System.err.println("No such math operation: " + e.getMessage());
				}
			}

			rdr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static double calcExpression(String operationMark, int operand1, int operand2) throws UnsupportedOperationException {

		double result;

		switch (operationMark) {
		case "+":
			result = operand1 + operand2;
			break;
		case "-":
			result = operand1 - operand2;
			break;
		case "*":
			result = operand1 * operand2;
			break;
		case "/":
			result = (double) operand1 / operand2;
			break;
		default:
			throw new UnsupportedOperationException(operationMark);
		}

		return result;
	}

}
