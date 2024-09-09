import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        iterativeFibonacci(10);
    }

    static void iterativeFibonacci(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);

        if(n>1){
            for(int i = 2; i<n; i++){
                arr.add(arr.get(i-1)+arr.get(i-2));
            }
        }

        System.out.println(arr);
    }

    static void recursiveFibonacci(int n){
        
    }
}
