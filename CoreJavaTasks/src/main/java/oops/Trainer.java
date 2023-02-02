package oops;

public class Trainer extends Employee {
			private String[] skills;
			private String[] certifications;
			public Trainer(int empId, String empName, double empSalary,Address address, String[] skills,
					String[] certifications) {
				super(empId, empName, empSalary, address,"Trainer");
				this.skills = skills;
				this.certifications = certifications;
			}
			public void setSkills(String[] skills) {
				this.skills = skills;
			}
			public String[] getSkills() {
				return skills;
			}
			public void setCertifications(String[] certifications) {
				this.certifications = certifications;
			}
			public String[] getCertifications() {
				return certifications;
			}
			public void printDetails() {
				System.out.printf("EmpId: ",+getEmpId()+", EmpName: "+getEmpName());
				System.out.print("Skills: ");
				for (String skill : skills) {
					System.out.print(skill + ", ");
				}
				System.out.println();
				System.out.print("Certifications: ");
				for (String certification : certifications) {
					System.out.print(certification + ", ");
				}
			}
}