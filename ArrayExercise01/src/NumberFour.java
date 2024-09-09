import java. util.*;

public class NumberFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        int total = 0;
        int[] arr = new int[numOfStudents];

        for(int i = 0; i < numOfStudents; i++){
            System.out.print("Enter the grade for student "+i+": ");
            int grade = scanner.nextInt();
            total += grade;
            arr[i] = grade;
        }

        int max = arr[0]; 
        int min = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] > max) {
                max = arr[i];
            }
            
            else if (arr[i] < min) {
                min = arr[i];
            }
        }

        double avg = total / (double) numOfStudents;
        String formattedAvg = String.format("%.2f", avg);
        System.out.println("The average is: "+formattedAvg);
        System.out.println("The minimum is: "+min);
        System.out.println("The maximum is: "+max);
    }
}
