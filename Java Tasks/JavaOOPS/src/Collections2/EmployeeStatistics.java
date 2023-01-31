package Collections2;

import java.util.*;

public class EmployeeStatistics {
    
	private List<Employee> employeeList;
	public EmployeeStatistics(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
	 int maleCount = 0;
	 int femaleCount = 0;
     public void MaleFemaleEmployeesCount()
     {
    	 for (Employee employee : employeeList) {
    	     if (employee.getGender().equals("Male")) {
    	         maleCount++;
    	     } else {
    	         femaleCount++;
    	     }
    	 }
    	 System.out.println("Number of Male employees: " + maleCount);
    	 System.out.println("Number of female employees: " + femaleCount);
     }
     
     public void AverageAgeOfEmployees()
     {
     	int maleAgeSum = 0;
        int femaleAgeSum = 0;
     	for (Employee employee : employeeList) {
     	    if (employee.getGender().equals("Male")) {
     	        maleAgeSum += employee.getAge();
     	    } else {
     	        femaleAgeSum += employee.getAge();
     	    }
     	}
     	int maleAverageAge =  maleAgeSum / maleCount;
     	int femaleAverageAge =  femaleAgeSum / femaleCount;
     	System.out.println("********************************************");
     	System.out.println("Average age of Male employees: " + maleAverageAge);
     	System.out.println("Average age of Female employees: " + femaleAverageAge);
     }
     
     public void MaleFemaleAverageSalary()
     {
     	double maleTotalSalary = 0;
     	double femaleTotalSalary = 0;
     	for(Employee employee : employeeList){
     	if(employee.getGender().equals("Male")){
     	maleTotalSalary += employee.getSalary();
     	} else {
     	femaleTotalSalary += employee.getSalary();
     	}
     	}
     	double maleAverageSalary = maleTotalSalary / maleCount;
     	double femaleAverageSalary = femaleTotalSalary / femaleCount;
     	System.out.println("********************************************");
     	System.out.println("Average salary of male employees: " + maleAverageSalary);
     	System.out.println("Average salary of female employees: " + femaleAverageSalary);
     }
     
     public void AverageAndTotalSalaryOfEmployees()
	    {
	    	double totalSalary = 0;
	    	for(Employee employee : employeeList){
	    	totalSalary += employee.getSalary();
	    	}
	    	double averageSalary = totalSalary / employeeList.size();
	    	System.out.println("********************************************");
	    	System.out.println("Average salary of Employees: " + averageSalary);
	    	System.out.println("Total salary of Employees: " + totalSalary);
	    }
    
}