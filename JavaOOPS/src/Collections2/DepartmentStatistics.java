package Collections2;
import java.util.*;

public class DepartmentStatistics {
	
	private List<Employee> employeeList;
	public DepartmentStatistics(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
	
	 public void AllDepartments() {
	    	List<String> departments = new ArrayList<>();
	    	for (Employee employee : employeeList) {
	    	    if (!departments.contains(employee.getDepartment())) {
	    	        departments.add(employee.getDepartment());
	    	    }
	    	}
	    	System.out.println("********************************************");
	    	System.out.println("Departments List: " + departments);
	    }
	 
	 public void EmployeesInEachDepartment()
	    {
	    	Map<String, Integer> departmentCount = new HashMap<>();
	    	for (Employee employee : employeeList) {
	    	    if (departmentCount.containsKey(employee.getDepartment())) {
	    	        departmentCount.put(employee.getDepartment(), departmentCount.get(employee.getDepartment()) + 1);
	    	    } else {
	    	        departmentCount.put(employee.getDepartment(), 1);
	    	    }
	    	}
	    	System.out.println("********************************************");
	    	System.out.println("Number of employees in each Department: " + departmentCount);
	    }
	 
	 public void EmployeeNamesInEachDepartment()
	    {
	    	Map<String, List<String>> departmentEmployees = new HashMap<>();
	    	for(Employee employee : employeeList){
	    	if(departmentEmployees.containsKey(employee.getDepartment())){
	    	departmentEmployees.get(employee.getDepartment()).add(employee.getName());
	    	} else {
	    	List<String> empList = new ArrayList<>();
	    	empList.add(employee.getName());
	    	departmentEmployees.put(employee.getDepartment(), empList);
	    	}
	    	}
	    	System.out.println("********************************************");
	    	for(Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()){
	    		System.out.println("Employees in " + entry.getKey() + " Department are: " + entry.getValue());
	    	}
	    }
	 
	 public void AverageSalaryInEachDepartment()
	    {
	    	Map<String, Double> avgSalaryByDept = new HashMap<>();
	    	for(Employee employee : employeeList){
	    	    String dept = employee.getDepartment();
	    	    Double currentSalary = employee.getSalary();
	    	    if(avgSalaryByDept.containsKey(dept)){
	    	        Double currentAvg = avgSalaryByDept.get(dept);
	    	        currentAvg = (currentAvg + currentSalary) / 2;
	    	        avgSalaryByDept.put(dept, currentAvg);
	    	    } else {
	    	        avgSalaryByDept.put(dept, currentSalary);
	    	    }
	    	}
	    	System.out.println("********************************************");
	    	System.out.println("Average salary in each Department: " + avgSalaryByDept);
	    }
	 
}
