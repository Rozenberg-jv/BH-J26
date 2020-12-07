package by.belhard.j26.homeworks.hw7.task2.pets;

public class Rhino extends AbstractPet {

    public Rhino(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("NONONO! NO any games with rhino");
    }
}
