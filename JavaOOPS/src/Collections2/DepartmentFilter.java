package Collections2;
import java.util.*;

public class DepartmentFilter {
	private List<Employee> employeeList;
	public DepartmentFilter(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
	
	public void YoungestMaleEmployeeInPDDepartment()
    {
    	Employee youngestMalePD = null;
    	int minAge = Integer.MAX_VALUE;
    	for(Employee employee : employeeList){
    	    if(employee.getDepartment().equals("Product Development") && employee.getGender().equals("Male")){
    	        if(employee.getAge() < minAge){
    	            youngestMalePD = employee;
    	            minAge = employee.getAge();
    	        }
    	    }
    	}
    	System.out.println("********************************************");
    	System.out.println("Youngest Male Employee in Product Development Department: " + youngestMalePD);
    }
	
	public void MaleFemaleInSalesMarketingTeam()
	    {
	    	int maleCount = 0;
	    	int femaleCount = 0;
	    	for(Employee employee : employeeList){
	    	    if(employee.getDepartment().equals("Sales And Marketing")){
	    	        if(employee.getGender().equals("Male")){
	    	            maleCount++;
	    	        } else {
	    	            femaleCount++;
	    	        }
	    	    }
	    	}
	    	System.out.println("********************************************");
	    	System.out.println("Number of Male Employees is " + maleCount + " and Female Employees is " + femaleCount + " in Sales and Marketing Department");
	    }
}
