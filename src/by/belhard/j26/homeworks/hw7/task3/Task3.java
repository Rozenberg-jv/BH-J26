package by.belhard.j26.homeworks.hw7.task3;

import by.belhard.j26.homeworks.hw7.task3.shapes.*;

public class Task3 {

	public static void main(String[] args) {

		Figure circle = new Circle(10);
		Figure rectangle = new Rectangle(5, 10);
		Figure square = new Square(10);

		System.out.println("Circle:");
		System.out.println("Area: " + CalculationUtils.calcSquare(circle));
		System.out.println("Perimeter: " + CalculationUtils.calcPerimeter(circle));
		System.out.println();

		System.out.println("Rectangle:");
		System.out.println("Area: " + CalculationUtils.calcSquare(rectangle));
		System.out.println("Perimeter: " + CalculationUtils.calcPerimeter(rectangle));
		System.out.println();

		System.out.println("Square:");
		System.out.println("Area: " + CalculationUtils.calcSquare(square));
		System.out.println("Perimeter: " + CalculationUtils.calcPerimeter(square));
		System.out.println();

	}

}
