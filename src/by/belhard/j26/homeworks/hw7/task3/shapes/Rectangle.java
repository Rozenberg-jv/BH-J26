package by.belhard.j26.homeworks.hw7.task3.shapes;

public class Rectangle implements Figure {

	private final double sideB;
	private final double sideA;

	public Rectangle(double sideA, double sideB) {

		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double calcSquare() {

		return sideA * sideB;
	}

	@Override
	public double calcPerimeter() {

		return 2 * (sideA + sideB);
	}

	double getSideA() {

		return sideA;
	}

	@Override
	public String toString() {

		return "Rectangle{"
				+ "sideA=" + sideA
				+ ", sideB=" + sideB + "}";
	}
}
