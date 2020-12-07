package by.belhard.j26.homeworks.hw7.task3;

import by.belhard.j26.homeworks.hw7.task3.shapes.*;

import java.util.Arrays;
import java.util.List;

public class Task3a {

	public static void main(String[] args) {

		List<Figure> figures = Arrays.asList(
				new Circle(10),
				new Rectangle(5, 10),
				new Square(10)
		);

		for (Figure figure : figures) {
			System.out.println(figure.getClass().getSimpleName() + ":");
			System.out.println("Area: " + CalculationUtils.calcSquare(figure));
			System.out.println("Perimeter: " + CalculationUtils.calcPerimeter(figure));
			System.out.println();
		}
	}

}
