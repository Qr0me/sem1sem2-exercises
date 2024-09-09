import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the locker number (1-24): ");
        int lockerNumber = scanner.nextInt();

        String color;
        switch ((lockerNumber - 1) % 4) {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "White";
                break;
            case 2:
                color = "Yellow";
                break;
            case 3:
                color = "Blue";
                break;
            default:
                color = "Invalid locker number";
        }

        // Output the color of the locker
        System.out.println("Locker " + lockerNumber + " should be painted " + color + ".");

    }
}
