import java. util.*;

public class NumberOne {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<10; i++){
            int n = scanner.nextInt();
            arr[i] = n;
        }

        System.out.println("Array: " + Arrays.toString(arr));
        int total = 0;

        for(int i=0; i<10; i++){
            total += arr[i];
        }

        double mean = total/10;
        System.out.println("Mean: "+mean);

        int totalSquared = 0;

        for(int i=0; i<10; i++){
            totalSquared += Math.pow(arr[i], 2);
        }

        double var = (totalSquared/10) - Math.pow(mean, 2);
        double sd = Math.sqrt(var);

        System.out.println("Standard deviation: "+sd);
    }
    
}
