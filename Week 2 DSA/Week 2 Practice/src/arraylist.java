import java.util.ArrayList;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};  //MEthod 1 of Creating array

        /* int[] arr = new int[5];  MEthod 2 of creating array
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5; */

        for(int i = 0; i<5; i++){
            System.out.println(arr[i]);
        }

        // ---------------------------------------------------------------------------------------------------------

        ArrayList al = new ArrayList();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        System.out.println("Printing ArrayList al: "+al);
        System.out.println("al size: " + al.size());
        al.remove(1);
        System.out.println("After removing index 1: "+al);
        System.out.println("Index 3: "+al.get(3));

        // Conversion of array to arrayList

        List<Integer> list = new ArrayList<Integer>();

        for(Integer myNumber:arr){
            list.add(myNumber);
        }
        System.out.println("Printing list from arr: "+list);
    }
}
