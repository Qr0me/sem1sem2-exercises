import java.util.*;

public class Driver {
    public static void main(String[] args){
        Bank bca = new Bank("BCA");
        
        bca.addCustomer("First", "Last");
        System.out.println("First customer: "+bca.getCustomers(0).getFirstName()+" "+bca.getCustomers(0).getLastName());



     /*    Customer c1 = new Customer("A", "B");
        System.out.println(c1.getFirstName()+" "+c1.getLastName());

        c1.setAccount(new Account(15000));

        System.out.println(c1.getAccount().getBalance()); */
    }
}
