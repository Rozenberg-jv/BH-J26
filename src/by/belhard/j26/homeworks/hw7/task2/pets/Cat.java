package by.belhard.j26.homeworks.hw7.task2.pets;

public class Cat extends AbstractPet {

    public Cat(String name) {

        super(name);
    }

    @Override
    public void play() {

        System.out.println(this.getName() + " says 'Meow-meow'");
    }

    @Override
    public String toString() {

        return String.format("Cat '%s'", getName());
    }
}
