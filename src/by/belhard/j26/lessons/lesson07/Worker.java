package by.belhard.j26.lessons.lesson07;

import java.util.Objects;

public class Worker extends Person {

    private String tool;

    public Worker(String name, int age, String tool) {
        super(name, age);
        this.tool = tool;
    }

    @Override
    public void doWork() {
        System.out.println(this.getName() + " works hard");
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                ", tool='" + tool + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return Objects.equals(tool, worker.tool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tool);
    }
}
