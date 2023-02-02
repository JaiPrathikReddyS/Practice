package generics;

public class Main {
	public static void main(String[] args) {
		GenericUtility.receiveLeastValue(10, 12); // Least is 10 - it will be printed in console
		
		System.out.println(GenericUtility.receiveLeastValue(10.9, 45.8)); // Output must be 10.9
		GenericUtility.receiveLeastValue(28.9f, 12.8f); // Output must be  12.8
		System.out.println(GenericUtility.receiveLeastValue(new Customer("Adam John", 65000.90),
				new Customer("Steve Rolca", 40000.0)));
 //Output must be Customer [customerName=Steve Rolca, customerSalary=40000.0]
	}
}
