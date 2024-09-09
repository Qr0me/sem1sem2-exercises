import java. util.*;

public class NumberTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numOfItems = scanner.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");
        scanner.nextLine();
        String values = scanner.nextLine();
        String[] nums = values.split(" ");

        int length = nums.length;

        while(length != numOfItems){
            System.out.print("Enter the value of all items (separated by space): ");
            values = scanner.nextLine();
            nums = values.split(" ");
            length = nums.length;
        }

        System.out.println(Arrays.toString(nums));
    }
}
