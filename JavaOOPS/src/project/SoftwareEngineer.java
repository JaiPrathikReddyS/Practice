package project;

public class SoftwareEngineer extends Employee{
	private String projectName;
	    public SoftwareEngineer(int empId, String empName, double empSalary, Address address,
	    		String projectName) {
	        super(empId, empName, empSalary, address,"Software Engineer");
	        this.projectName = projectName;
	    }
	    public String getProjectName() {
	        return projectName;
	    }
	    public void setProjectName(String projectName) {
	        this.projectName = projectName;
	    }
	    public void printDetails() {
	        System.out.println("EmpID: " + getEmpId() +", Name: " + getEmpName() +", Project Name: "+getProjectName() );
	    }
}