package by.belhard.j26.lessons.lesson09.java8examples;

import java.util.Objects;

public class User implements Comparable<User> {

    private String name;
    private int cash;

    public User(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public int compareTo(User o) {

        int cashDiff = o.getCash() - this.cash;

        if (cashDiff == 0) {
            return this.name.compareTo(o.getName());
        }

        return cashDiff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return cash == user.cash &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cash);
    }

    @Override
    public String toString() {
        return name + " : " + cash;
    }
}
