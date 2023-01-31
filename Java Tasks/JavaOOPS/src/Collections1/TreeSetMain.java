package Collections1;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<TreeSetEmployee> employees = new TreeSet<TreeSetEmployee>();

        employees.add(new TreeSetEmployee("Jiya Brein", 32, 25000.0));
        employees.add(new TreeSetEmployee("Paul Niksui", 25, 13500.0));
        employees.add(new TreeSetEmployee("Martin Theron", 29, 18000.0));
        employees.add(new TreeSetEmployee("Murali Gowda", 28, 32500.0));
        employees.add(new TreeSetEmployee("Nima Roy", 27, 22700.0));
        System.out.println("Employees in Alphabetical Order: ");
        for (TreeSetEmployee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}