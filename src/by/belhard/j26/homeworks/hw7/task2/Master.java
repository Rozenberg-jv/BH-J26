package by.belhard.j26.homeworks.hw7.task2;

import by.belhard.j26.homeworks.hw7.task2.pets.Pet;

public class Master {

    private String name;
    private Pet pet;

    public Master(String name, Pet pet) {

        this.name = name;
        this.pet = pet;
    }

    public Master(String name) {

        this(name, null);
    }

    // метод для игры со своим питомцем
    public void play() {

        play(this.pet);
    }

    // метод для игры с любым питомцем
    public void play(Pet pet) {

        System.out.println(this.name + " is playing with " + (pet != null ? pet : "nothing"));
        if (pet != null) pet.play();
    }

    public Pet getPet() {

        return pet;
    }

    @Override
    public String toString() {

        return String.format("%s has %s", name, pet != null ? "pet " + pet : "no pet");
    }
}
