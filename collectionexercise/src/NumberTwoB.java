import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberTwoB {
    public static void main(String[] args){
        String[] One = {"Toothpaste", "Shampoo", "Soap", "Toilet Paper", "Tissues", "Deodorant", "Razors", "Shaving Cream", "Mouthwash", "Dental Floss",
                           "Hand Sanitizer", "Cotton Swabs", "Sunscreen", "Fabric Softener", "Dish Soap"};
        String[] Two = {"Toothpaste", "Shampoo", "Soap", "Paper Towels", "Garbage Bags", "Aluminum Foil", "Plastic Wrap", "Bleach", "Glass Cleaner", "All-Purpose Cleaner"};
    
        // Create the function that will place all product IDs common to both warehouses in Intersection

        Set<String> s1 = new HashSet<String>(Arrays.asList(One));
        Set<String> s2 = new HashSet<String>(Arrays.asList(Two));
        s1.retainAll(s2);
        
        System.out.println(s1);

        // Create a function that will place all product IDs not common to both warehouses in Difference.
        Set<String> s3 = new HashSet<String>(Arrays.asList(One));
        HashSet<String> differenceSet = new HashSet<String>(s3);
        differenceSet.removeAll(s2);

        System.out.println(differenceSet);

    }
}
