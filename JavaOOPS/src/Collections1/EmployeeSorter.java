package Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorter {
	
	public static void main(String[] args)
	{
		List<EmployeeStructure> employees = new ArrayList<>();
		employees.add(new EmployeeStructure("Jiya Brein", 32, 25000.0));
	    employees.add(new EmployeeStructure("Paul Niksui", 25, 13500.0));
	    employees.add(new EmployeeStructure("Martin Theron", 29, 18000.0));
	    employees.add(new EmployeeStructure("Murali Gowda", 28, 32500.0));
	    employees.add(new EmployeeStructure("Nima Roy", 27, 22700.0));
	    
	    Collections.sort(employees, new Comparator<EmployeeStructure>(){
	    	 @Override
	    	 public int compare(EmployeeStructure employee1, EmployeeStructure employee2) {
	    	        return employee1.getName().compareTo(employee2.getName());
	    	    }
	    });
	    System.out.println("Employees in Alphabetical Order: ");
	    for(EmployeeStructure employee : employees)
	    {
	    	System.out.println(employee);
	    }
   
}
}