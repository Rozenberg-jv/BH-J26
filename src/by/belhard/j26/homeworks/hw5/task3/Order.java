package by.belhard.j26.homeworks.hw5.task3;

public class Order {

    private static final int DISCOUNT_BORDER_1 = 10;
    private static final int DISCOUNT_BORDER_2 = 50;
    private static final int DISCOUNT_PERCENT_1 = 10;
    private static final int DISCOUNT_PERCENT_2 = 20;

    private String title;
    private int quantity;
    private double price;

    public Order(String title, int quantity, double price) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {

        double price = this.price;

        if (quantity >= DISCOUNT_BORDER_2)
            price = price * (100 - DISCOUNT_PERCENT_2) / 100.0;
        else if (quantity >= DISCOUNT_BORDER_1)
            price = price * (100 - DISCOUNT_PERCENT_1) / 100.0;

        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "title='" + title + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
