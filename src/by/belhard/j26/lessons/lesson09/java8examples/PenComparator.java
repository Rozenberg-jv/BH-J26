package by.belhard.j26.lessons.lesson09.java8examples;

import java.util.Comparator;

public class PenComparator implements Comparator<Pen> {

    @Override
    public int compare(Pen o1, Pen o2) {

        int colorDiff = o1.getColor().compareTo(o2.getColor());

        if (colorDiff == 0)
            return o2.getDiameter() - o1.getDiameter();

        return colorDiff;
    }
}
