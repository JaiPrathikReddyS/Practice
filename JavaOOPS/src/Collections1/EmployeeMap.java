package Collections1;
import java.util.Comparator;
import java.util.TreeMap;

class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
}

public class EmployeeMap {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> map = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.name.compareTo(e1.name);
            }
        });
        map.put(new Employee("Jiya Brein"), 1);
        map.put(new Employee("Paul Niksui"), 2);
        map.put(new Employee("Martin Theron"), 3);
        map.put(new Employee("Nima Roy"), 4);
      
        for (Employee e : map.keySet()) {
            System.out.println(e.name );
            
        }
    }
}