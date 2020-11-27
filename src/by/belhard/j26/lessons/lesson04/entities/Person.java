package by.belhard.j26.lessons.lesson04.entities;

public class Person {

    private static int counter;

    static {
        counter = 0;
    }

    private String name;
    private int age;
    private Country country;
    private Sex sex;

    private final String phone;
    /*private String[] roles;
    {
        roles = new String[5];
        roles[0] = "USER";
    }*/

    public Person() {
        this("NONAME", 18, null, Sex.MALE);
    }

    /*public Person(String name) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
        counter++;
    }*/

    // Alt + Insert
    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
        counter++;
        this.phone = "123456";
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void walk(int minutes, String place) {
        System.out.println(name + " is walking for " + minutes + " minutes in " + place);
    }

    public void walk(String place, int hours) {
        System.out.println(name + " is walking in " + place + " for " + hours + " hours");
    }

    public void eat(String dish) {
        System.out.println(name + " is eating " + dish);
    }

    public int growOld() {

 /*       if (age < 18)
            return 18;*/

        return ++age;
    }

    public String getPhone() {
        return phone;
    }

    /*public void setPhone(String phone) {
        this.phone = phone;
    }*/

    public static int getCounter() {

//        System.out.println(name);
        /*this.getName();*/

        return counter;
    }

    public String getName() {

        /*if (name == null)
            return "";

        return name;*/

        return name == null ? "" : name;
    }

    public void setName(String name) {

        if (name == null || name.equals(""))
            this.name = "NONAME";

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", sex=" + sex +
                '}';
    }
}
