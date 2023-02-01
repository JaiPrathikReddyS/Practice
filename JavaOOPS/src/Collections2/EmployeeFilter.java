package Collections2;
import java.util.*;

public class EmployeeFilter {

	private List<Employee> employeeList;
	public EmployeeFilter(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
	
	public void HighestPaidEmployee()
    {
    	Employee highestPaid = employeeList.get(0);
    	for (Employee employee : employeeList) {
    	    if (employee.getSalary() > highestPaid.getSalary()) {
    	        highestPaid = employee;
    	    }
    	}
    	System.out.println("********************************************");
    	System.out.println("Highest Paid Employee: " + highestPaid.getName() + ", Salary: " + highestPaid.getSalary());
    }
	
	public void MostExperiencedEmployee()
    {
    	Employee mostExperience = null;
    	int maxExperience = Integer.MIN_VALUE;
    	int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    	for(Employee employee : employeeList){
    	    int yearsExperience = currentYear - employee.getYearOfJoining();
    	    if(yearsExperience > maxExperience){
    	        mostExperience = employee;
    	        maxExperience = yearsExperience;
    	    }
    	}
    	System.out.println("********************************************");
    System.out.println("Employee with most experience: " + mostExperience.getName() + ", Year Of Joining: " + mostExperience.getYearOfJoining());
    }
	
	 public void OldestEmployee()
	    {
	    	Employee oldestEmployee = null;
	    	int oldestAge = 0;
	    	String oldestDepartment = "";
	    	for(Employee employee : employeeList){
	    	if(employee.getAge() > oldestAge){
	    	oldestAge = employee.getAge();
	    	oldestEmployee = employee;
	    	oldestDepartment = employee.getDepartment();
	    	}
	    	}
	    	System.out.println("********************************************");
	    	System.out.println("Oldest Employee: " + oldestEmployee.getName() + ", Age: " + oldestAge +", Department: " + oldestDepartment);
	    }
	 
	
}
