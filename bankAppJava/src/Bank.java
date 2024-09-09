import java.util.*;

public class Bank {
    private ArrayList<Customer> customers;
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bName){
        this.bankName = bName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String f, String l){
        Customer newCustomer = new Customer(f, l);
        customers.add(newCustomer);
    }

    public String getName(){
        return bankName;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomers(int index) {
        return customers.get(index);
    }
}
