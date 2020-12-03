package by.belhard.j26.lessons.lesson07;

public class InheritanceExample {

    public static void main(String[] args) {

//        Person person1 = new Person("Noname", 100);
        Worker worker1 = new Worker("Vasily", 22, "pick-axe");
        Manager manager1 = new Manager("Tatyana", 19, 123456);

        worker1.growOld();

//        person1.doWork();
        worker1.doWork();
        manager1.doWork();

//        System.out.println(person1.toString());
        System.out.println(worker1);
        System.out.println(manager1);

        System.out.println(5 == 1);

        Worker worker2 = new Worker("Vasily", 23, "pick-axe");

        System.out.println();
        System.out.println(worker1 == worker2);
        System.out.println(worker1.equals(worker2));

        System.out.println();

//        System.out.println(manager1 instanceof Object);

        Workable manager2 = new Manager("Igor", 44, 12345);
//        manager2 = worker2;

        System.out.println(manager2.getName());
        manager2.doWork();
        if (manager2 instanceof Manager)
            System.out.println(((Manager) manager2).getPhoneNumber());
//        System.out.println(manager2.getPhoneNumber());

        Person[] persons = {
                new Worker("w1", 44, "pp"),
                new Worker("w2", 44, "pp"),
                new Manager("m1", 44, 123),
                new Manager("m2", 44, 123)
        };

        for (Person p : persons)
            p.doWork();

        System.out.println();

//        new Workable();

        Workable.staticMethod();
        manager2.defaultMethod();

    }
}
