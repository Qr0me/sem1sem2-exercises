import java.util.*;
public class NumberThreeBC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[][] Student_Name = {
            {"John", "Smith"}, {"Emily", "Johnson"}, {"Michael", "Williams"}, {"Emma", "Jones"}, {"Daniel", "Brown"},
            {"Olivia", "Davis"}, {"Matthew", "Wilson"}, {"Sophia", "Taylor"}, {"Jacob", "Anderson"}, {"Isabella", "Martinez"},
            {"William", "Jackson"}, {"Charlotte", "Garcia"}, {"James", "Thomas"}, {"Amelia", "Hernandez"}, {"Benjamin", "Moore"},
            {"Evelyn", "Nelson"}, {"Ethan", "Walker"}, {"Ava", "King"}, {"Alexander", "Perez"}, {"Mia", "Scott"},
            {"Daniel", "Lopez"}, {"Harper", "Adams"}, {"David", "Green"}, {"Madison", "Baker"}
        };
        int[] Locker_No = {
            101, 102, 103, 104, 105,
            106, 107, 108, 109, 110,
            111, 112, 113, 114, 115,
            116, 117, 118, 119, 120,
            121, 122, 123, 124
        };

        boolean[] Painted = {
            true, false, false, true, false,
            true, true, true, false, true,
            false, false, true, false, true,
            false, true, true, true, false,
            false, true, false, true, false,
            true, true, true, false
        };

        int numPainted = paintedChecker(Painted);
        System.out.println(numPainted);

        System.out.print("Input Name: ");
        String inputName = scan.nextLine();

        infoFinder(Locker_No, Painted, Student_Name, inputName);
    }

    // Create a program/method that counts and outputs the number of lockers that have been painted so far.
    public static int paintedChecker(boolean[] arr){
        int count = 0;
        for(boolean i : arr){
            if(i){
                count++;
            }
        }
        return count;
    }

    // Create a program/method, which accepts a student’s name as input, and outputs the corresponding locker number and whether or not it has been painted.
    
    public static void infoFinder(int[] LN, boolean[] P, String[][] SN, String inputName){
        for(int i = 0; i<SN.length; i++){

            String fullName = SN[i][0] + " " + SN[i][1];
            if(SN[i][0].toUpperCase().equals(inputName.toUpperCase()) || SN[i][1].toUpperCase().equals(inputName.toUpperCase()) || fullName.toUpperCase().equals(inputName.toUpperCase())){
                System.out.println("Name: "+SN[i][0]+" "+SN[i][1]);
                System.out.println("Locker Number: "+LN[i]);
                System.out.println("Painted: "+P[i]);
            }
        }
    }

}
