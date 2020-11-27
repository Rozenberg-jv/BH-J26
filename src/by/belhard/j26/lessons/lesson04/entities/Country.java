package by.belhard.j26.lessons.lesson04.entities;

public class Country {

    public String title;
    public int zipCode;

    /*public Country() {

    }*/

    public Country(String title, int zipCode) {

        this.title = title;
        this.zipCode = zipCode;
    }

    // Alt + Insert -> toString()
    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", zipCode=" + zipCode;
    }
}
