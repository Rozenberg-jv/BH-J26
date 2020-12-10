package by.belhard.j26.lessons.lesson09.java8examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Examples {

    public static void main(String[] args) {

        List<User> list = Arrays.asList(
                new User("Vasily", 500),
                new User("Tatyana", 400),
                new User("Igor", 500),
                new User("Ivan", 500),
                new User("Vlas", 1000),
                new User("Irina", 400)
        );

        /*
        new Comparator<User>() {
                    public int compare(User u1, User u2) {
                        return u1.getCash() - u2.getCash();
                    }
                  }
         */


        List<String> listAfterStream = list.stream()
                .filter(u -> !u.getName().equals("Igor"))
                .sorted((u1, u2) -> u1.getCash() - u2.getCash())
                .map(u -> {
                    u.setName(u.getName().toUpperCase());
                    return u.getName();
                })
                .collect(Collectors.toList());


        list.forEach(System.out::println);
        System.out.println();
        listAfterStream.forEach(System.out::println);
        System.out.println();
    }
}

