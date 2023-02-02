package oops;
import java.util.*;

public class Employee {
	    private int empId;
	    private String empName;
	    private double empSalary;
	    private Address address;
	    private String empRole;
	    public Employee(int empId, String empName, double empSalary,Address address, String empRole) 
	 {
	        this.empId = empId;
	        this.empName = empName;
	        this.empSalary = empSalary;
	        this.address = address;
	        this.empRole = empRole;
	    }
	    public int getEmpId() {
	        return empId;
	    }
	    public String getEmpName() {
	        return empName;
	    }
	    public double getEmpSalary() {
	        return empSalary;
	    }
	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }
	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }
	    public void setEmpSalary(double empSalary) {
	        this.empSalary = empSalary;
	    }
	    public void setAddress(Address address) {
	        this.address = address;
	    }
	    public Address getAddress() {
	        return address;
	    }
	    public void setempRole(String empRole) {
	        this.empRole = empRole;
	    }
	    public String getempRole() {
	        return empRole;
	    }
		public void printDetails() {
			System.out.println("EmpId: "+getEmpId()+", EmpName: " + getEmpName()+
					", EmpSalary: "+getEmpSalary());
		}
}
