package by.belhard.j26.homeworks.hw5.task3;

public class Task3 {

    public static void main(String[] args) {

        staticMethodExample();

        Task3 task = new Task3();

//        int[] ints = {1, 2, 3};

        Order[] orders = {
                new Order("milk", 1, 1000),
                new Order("bread", 10, 1000),
                new Order("pelmeni", 50, 1000)
        };

        for (Order o : orders)
            System.out.println(o);

        double sum = task.calcSum(orders);

        System.out.println("Total cost: " + sum);
    }

    private double calcSum(Order[] orders) {

        double sum = 0;

        for (Order o : orders) {
            sum += o.getPrice() * o.getQuantity();
        }

        return sum;
    }

    private static void staticMethodExample() {
        System.out.println("example");
    }
}
