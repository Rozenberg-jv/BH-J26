package by.belhard.j26.lessons.lesson12.jdbcExample;

import java.util.Date;

public class Employee {

    private final int id;
    private final String name;
    private final Date date;
    private final Department department;

    public Employee(int id, String name, Date date, Department department) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", department=[" + department +
                ']';
    }
}
