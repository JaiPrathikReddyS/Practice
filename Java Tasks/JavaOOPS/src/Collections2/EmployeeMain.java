package Collections2;

import java.util.*;

public class EmployeeMain {
	public static void main(String[] args) {

	    EmployeeData employeeData = new EmployeeData();
	    List<Employee> employeeList = employeeData.getEmployeeList();
	    
	    EmployeeStatistics employeeStatistics = new EmployeeStatistics(employeeList);
	    EmployeeFilter employeeFilter = new EmployeeFilter(employeeList);
	    EmployeeSeparation employeeSeparation = new EmployeeSeparation(employeeList);
	    DepartmentStatistics departmentStatistics = new DepartmentStatistics(employeeList);
	    DepartmentFilter departmentFilter = new DepartmentFilter(employeeList);
	    
	    
	    System.out.println("Output for Queries: " + '\n');
	    
	    employeeStatistics.MaleFemaleEmployeesCount();
	    employeeStatistics.AverageAgeOfEmployees();
	    employeeStatistics.MaleFemaleAverageSalary();
	    employeeStatistics.AverageAndTotalSalaryOfEmployees();
	    
	    employeeFilter.HighestPaidEmployee();
	    employeeFilter.MostExperiencedEmployee();
	    employeeFilter.OldestEmployee();
	    
	    employeeSeparation.EmployeesJoinedAfter2015();
	    employeeSeparation.EmployeesAboveBelow25Years();
	    
	    departmentStatistics.AllDepartments();
	    departmentStatistics.EmployeesInEachDepartment();
	    departmentStatistics.EmployeeNamesInEachDepartment();
	    departmentStatistics.AverageSalaryInEachDepartment();
	    
	    departmentFilter.YoungestMaleEmployeeInPDDepartment();
	    departmentFilter.MaleFemaleInSalesMarketingTeam();
	}
}
