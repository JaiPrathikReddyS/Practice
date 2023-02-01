package Collections1;
import java.util.*;

public class TreeSetEmployee implements Comparable<TreeSetEmployee> {
    private String name;
    private int age;
    private double salary;

    public TreeSetEmployee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(TreeSetEmployee employee) {
        return this.name.compareTo(employee.name);
    }
}