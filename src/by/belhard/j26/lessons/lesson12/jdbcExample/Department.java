package by.belhard.j26.lessons.lesson12.jdbcExample;

import java.util.ArrayList;
import java.util.Objects;

public class Department {

    private final int id;
    private final String department;
    private final int salary;
//    private final ArrayList<Employee> employeeList = new ArrayList<>();

    public Department(int id, String department, int salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", department=" + department +
                ", salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
