package by.belhard.j26.homeworks.hw5.task1;

public class TempCounter {

    public double[] calcTemp(double startTemp, double tempDiff, int days) {

        double[] result = new double[days];

        result[0] = startTemp;

        for (int i = 1; i < result.length; i++) {
            int module = Math.random() < 0.5 ? -1 : 1;
            double diff = Math.random() * tempDiff * module;
            result[i] = result[i - 1] + diff;
        }

        return result;
    }
}
