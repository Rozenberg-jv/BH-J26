package by.belhard.j26.homeworks.hw9.task2;

import java.util.*;

public class ListOfOrders {

    private Map<String, List<String>> mapOfOrders = new HashMap<>();

    public void addOrder(String name, String product, String... products) {

        List<String> listOfProducts = new ArrayList<>(Arrays.asList(products));
        listOfProducts.add(product);

        mapOfOrders.put(name, listOfProducts);
    }

    public Map<String, Integer> getOrdersQuantity() {

        Map<String, Integer> result = new HashMap<>();

        for (List<String> list : mapOfOrders.values()) {
            for (String product : list) {
                if (result.containsKey(product)) {
                    result.put(product, result.get(product) + 1);
                } else {
                    result.put(product, 1);
                }
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return mapOfOrders.toString();
    }
}
