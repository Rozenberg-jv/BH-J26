package by.belhard.j26.lessons.lesson05;

import by.belhard.j26.lessons.lesson04.entities.Person;

public class StaticExample {

    public static void main(String[] args) {

        System.out.println(Person.getCounter());

        final Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Vasily");
        person2.setName("Tatyana");

        /*person1.counter = 5;

        System.out.println(person2.counter);
        System.out.println(Person.counter);*/

        System.out.println(Person.getCounter());

        System.out.println(person1.getPhone());

        final int a;
        System.out.println();
        a = 10;

        System.out.println(a);
//        a = 15;
        System.out.println();

//        person1 = person2;

        person1.setName("Mahmud");
        System.out.println(person1);
    }
}
