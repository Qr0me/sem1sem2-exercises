import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) throws Exception {

        int[] arr = {5,4,7,6,2,9,10,8};
        int[] arrSorted = MergeSort(arr);
        System.out.println(Arrays.toString(arrSorted));
    }

    public static int[] MergeSort(int[] arr){
        int n = arr.length;

        if(n%2 == 0){
            if(n/2 > 2){
                int[] newArr1 = Arrays.copyOfRange(arr, 0, n/2);
                int[] newArr2 = Arrays.copyOfRange(arr, (n/2)+1, n);

                newArr1 = MergeSort(newArr1);
                newArr2 = MergeSort(newArr2);

                arr = newArr1;
            }
            
            else{
                if(arr[1] < arr[0]){
                    int temp = arr[1];
                    arr[1] = arr[0];
                    arr[0] = temp;
                }
            }
        } 
        
        else{
            if((n-1)/2 > 1){

            }
        }

        return arr;
    }
}
