import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int x = binarySearch(array, 5);
        System.out.println(x);
    }

    public static int binarySearch(int array[], int target){
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int middle = low + (high-low)/2;
            if(target == middle) return array[middle];
            else if(target > middle) low = middle + 1;
            else if(target < middle) high = middle - 1;
        }

        return -1;
    }
}
