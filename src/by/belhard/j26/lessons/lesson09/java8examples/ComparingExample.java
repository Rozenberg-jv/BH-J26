package by.belhard.j26.lessons.lesson09.java8examples;

import java.util.*;

@SuppressWarnings("all")
public class ComparingExample {

    private List<String> exampleList = new ArrayList<>() {
        {
            this.add("123");
            this.add("124");
            this.add("125");
        }
    };

    public static void main(String[] args) {

        User user1 = new User("Vasily", 500);
        User user2 = new User("Tatyana", 400);
        User user3 = new User("Igor", 500);
        User user4 = new User("Ivan", 500);
        User user5 = new User("Vlas", 1000);
        User user6 = new User("Irina", 400);

        System.out.println(user6.compareTo(user1));
        System.out.println(user3.compareTo(user4));

        TreeSet<User> set = new TreeSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);
        set.add(user6);

        for (User user : set) {
            System.out.println(user);
        }

        System.out.println();

        List<Pen> pens = Arrays.asList(
                new Pen("Red", 5),
                new Pen("White", 5),
                new Pen("Black", 15),
                new Pen("Black", 5),
                new Pen("Red", 15)
        );

//        pens.sort(new PenComparator());
        pens.sort(new Comparator<Pen>() { // создается анонимный объект анонимного класса,
            @Override                     // реализующего интрефейс Comparator<Pen>,
            public int compare(Pen o1, Pen o2) { // и у этого анонимного класса описывается метод compare
                int colorDiff = o1.getColor().compareTo(o2.getColor());

                if (colorDiff == 0)
                    return o2.getDiameter() - o1.getDiameter();

                return colorDiff;
            }
        });

        pens.forEach(System.out::println);
    }
}
