import java. util.*;

public class NumberThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numOfItems = scanner.nextInt();
        int[] items = new int[numOfItems];
        System.out.print("Enter the value of all items (separated by space): ");
        for(int i = 0; i < items.length; i++){
            items[i] = scanner.nextInt();
        }

        String star = "*";

        for(int i = 0; i < items.length; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < items[i]; j++) {
                sb.append(star);
            }

            String result = sb.toString();
            System.out.println(i+": "+result+"("+items[i]+")");
        }
    }
}
