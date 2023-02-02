package generics;

public class Customer implements Comparable<Customer> {

    private String customerName;
    private double customerSalary;

    public Customer(String customerName, double customerSalary) {
        super();
        this.customerName = customerName;
        this.customerSalary = customerSalary;
    }
   public String getCustomerName() {
        return customerName;
    }
    public double getCustomerSalary() {
        return customerSalary;
    }
    public double hashcode()
    {
    	return this.customerSalary;
    }
    public String toString()
    {
    	return this.customerName;
    }
    public int compareTo(Customer other) {
        return Double.compare(this.customerSalary, other.customerSalary);
    }

}