package by.belhard.j26.lessons.lesson09.java8examples;

import java.util.Objects;

public class Pen {

    private String color;
    private int diameter;

    public Pen(String color, int diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return diameter == pen.diameter &&
                Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, diameter);
    }

    @Override
    public String toString() {
        return color + " : " + diameter;
    }
}
