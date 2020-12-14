package by.belhard.j26.lessons.lesson10.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FruitStorage {

    private static final String STORAGE_PATH = "resources/storage.table";
    private static final String INVOICES_PATH = "resources/";

    private final Map<String, Fruit> storage = new HashMap<>();


    public void processInvoice(String invoicePath) {

        // read data from storage
        readStorageData();

        // read data from invoice
        Map<String, Fruit> invoice = readInvoiceData(INVOICES_PATH + invoicePath);

        // process data
        for (Fruit fruitFromInvoice : invoice.values()) {
            if (storage.containsKey(fruitFromInvoice.getTitle())) {
                Fruit fruit = storage.get(fruitFromInvoice.getTitle());
                fruit.setCount(fruit.getCount() + fruitFromInvoice.getCount());
            } else {
                storage.put(fruitFromInvoice.getTitle(), fruitFromInvoice);
            }
        } // TODO: 14.12.2020 add check for lack of fruits

        // write data to storage
        writeToStorage();
    }

    private void writeToStorage() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(STORAGE_PATH));

            for (Fruit fruit : storage.values()) {
                writer.write(fruit.toString());
                writer.newLine();
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, Fruit> readInvoiceData(String invoicePath) {

        return readFruitTable(invoicePath);
    }

    private void readStorageData() {

        storage.putAll(readFruitTable(STORAGE_PATH));
    }

    private Map<String, Fruit> readFruitTable(String path) {

        Map<String, Fruit> result = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String line;
            while (reader.ready()) {
                line = reader.readLine();
                String[] splitted = line.split(" ");

                String title = splitted[0];
                int count = Integer.parseInt(splitted[1]);
                result.put(title, new Fruit(title, count));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
