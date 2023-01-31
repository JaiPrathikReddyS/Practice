package Collections2;
import java.util.*;

public class EmployeeSeparation {
	private List<Employee> employeeList;
	public EmployeeSeparation(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
	
	 public void EmployeesJoinedAfter2015()
	    {
	    	List<String> employeeNames = new ArrayList<>();
	    	for (Employee employee : employeeList) {
	    	    if (employee.getYearOfJoining() > 2015) {
	    	        employeeNames.add(employee.getName());
	    	    }
	    	}
	    	System.out.println("********************************************");
	    	System.out.println("Employees who Joined after 2015: " + employeeNames);
	    }
	 
	 public void EmployeesAboveBelow25Years()
	    {
	    	List<Employee> youngerEmployees = new ArrayList<>();
	    	List<Employee> olderEmployees = new ArrayList<>();
	    	for(Employee employee : employeeList){
	    	if(employee.getAge() <= 25){
	    	youngerEmployees.add(employee);
	    	} else {
	    	olderEmployees.add(employee);
	    	}
	    	}
	    	System.out.println("Younger employees: " + youngerEmployees);
	    	System.out.println("Older employees: " + olderEmployees);
	    }
}
