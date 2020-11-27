package by.belhard.j26.lessons.lesson04;

import by.belhard.j26.lessons.lesson04.entities.Country;
import by.belhard.j26.lessons.lesson04.entities.Person;
import by.belhard.j26.lessons.lesson04.entities.Sex;

public class PersonExample {

    public static void main(String[] args) {

        /*Person person1 = new Person();

        System.out.println(person1.name);
        System.out.println(person1);

        person1.name = "Vasily";
        person1.age = 30;
        person1.country = new Country("Belarus", 220113);
*//*        person1.country.title = "Belarus";
        person1.country.zipCode = 220113;*//*
        person1.sex = Sex.MALE;

        // --
        Person person2 = new Person();
        person2.name = "Tatyana";
        person2.age = 18;
        person2.country = new Country("Belarus", 220113);
//        person2.country.title = "Belarus";
//        person2.country.zipCode = 220113;
        person2.sex = Sex.FEMALE;

        System.out.println(person1.country);
        System.out.println(person2.country);

        System.out.println();
        person2.country = person1.country;
        System.out.println(person1.country);
        System.out.println(person2.country);

        person1.country.zipCode = 220056;
        System.out.println(person2.country.zipCode);

        System.out.println();

        person1.walk();
        person2.walk();

        String q = "beer";

        person1.eat("fish");
        person2.eat("bread");
        person2.eat(q);

        System.out.println();
        *//*System.out.println(person1.age);
        person1.growOld();
        System.out.println(person1.age);*//*

//        System.out.println(person1.age);
        System.out.println(1 + 2);
        System.out.println(person1.growOld());
        int agePerson = person1.growOld();
        person1.growOld();
        person1.growOld();
        person1.growOld();
        System.out.println(agePerson);
//        System.out.println(person2.age);

        System.out.println();

        Person person3
                = new Person("Igor", 55, new Country("Ukraine", 123), Sex.MALE);

        person3.walk();
        person3.walk(5, "field");
        person3.walk("forest", 1);

        System.out.println(person3.toString());*/
    }
}
