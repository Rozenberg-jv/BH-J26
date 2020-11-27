package by.belhard.j26.lessons.lesson05;

import by.belhard.j26.lessons.lesson04.entities.Country;
import by.belhard.j26.lessons.lesson04.entities.Person;
import by.belhard.j26.lessons.lesson04.entities.Sex;

public class Lesson05Example {

    public static void main(String[] args) {

        Person person1 = new Person("Vasily", 30, new Country("Belarus", 220113), Sex.MALE);

        System.out.println(person1);

        // 30 + 30.1
        System.out.println();

        /*System.out.println(30 + 20 + "0"); // "50" + "0"

        System.out.println("30" + 20 + 10); // "302010"
*/
        /*person1.sex = Sex.FEMALE;
        System.out.println(person1);

        System.out.println(person1.name); // доступ на чтение
        person1.name = "Vasilysa"; // доступ на запись
*/

//        System.out.println(person1.age);

        System.out.println(person1.getName());
        person1.setName(null);

        System.out.println(person1.getName().toUpperCase());
    }

}
