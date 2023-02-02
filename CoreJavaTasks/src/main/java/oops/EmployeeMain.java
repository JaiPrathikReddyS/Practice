package oops;

public class EmployeeMain {

    public static void main(String[] args) {
        Address address1 = new Address(5, "HimayathNagar ", "Hyderabad", "Telangana", "India");
        Address address2 = new Address(7, "Kengeri", "Bangalore", "Karnataka", "India");
        Address address3 = new Address(9,"AnnaNagar","Chennai","Tamil Nadu","India");
       
        String[] skills = {"Java", "Python", "C++"};
        String[] certifications = {"OCP", "AWS"}; 
        
        Employee emp1 = new JuniorEngineer(1, "Jai", 10000, address1,88.8,"Positive");
        Employee emp2 = new SoftwareEngineer(2, "Manoj", 60000,address2,"Java, Project");
        Employee emp3 = new Trainer(3, "Prathik", 70000, address3,skills,certifications);
        
        JuniorEngineer je = new JuniorEngineer(1, "Rohith", 50000, address1, 80, "Good");
        SoftwareEngineer se = new SoftwareEngineer(2, "Suresh", 60000, address2, "Project A");
   

        Course course1 = new Course(1, "Java Programming", 30);
        Course course2 = new Course(2, "Web Development", 40);


        emp1.printDetails();
        emp2.printDetails();
        emp3.printDetails();
    }
}

