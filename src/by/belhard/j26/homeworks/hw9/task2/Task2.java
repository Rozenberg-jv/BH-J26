package by.belhard.j26.homeworks.hw9.task2;

import java.util.Map;

public class Task2 {

    public static void main(String[] args) {

        ListOfOrders listOfOrders = new ListOfOrders();

        listOfOrders.addOrder("Vasily", "bread", "milk", "bread", "beer");
        listOfOrders.addOrder("Tatyana", "milk");
        listOfOrders.addOrder("Igor", "milk", "beer", "pelmeni");

        System.out.println(listOfOrders.toString());

        Map<String, Integer> ordersQuantity = listOfOrders.getOrdersQuantity();

        System.out.println();
        ordersQuantity.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
