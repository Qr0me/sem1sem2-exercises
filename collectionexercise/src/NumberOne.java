public class NumberOne {
    public static void main(String[] args) {
        double[] NUMBERS = {3.12, 43.20, 12.45, 78.43, 13.50, 43.67};

        System.out.println(avgCalculator(NUMBERS));

        /*Consider  the following algorithm fragment.
        S=NUMBERS.minPos()
        L=NUMBERS.maxPos()
        T=NUMBERS[S]
        NUMBERS[S]=NUMBERS[L]
        NUMBERS[L]=T
        (b) 
        
        (i) Show the contents of the array NUMBERS after the algorithm is applied.
        ANSWER --> {78.43, 43.20, 12.45, 3.12, 13.50, 43.67}

        (ii) Deduce the purpose of the algorithm. 
        ANSWER --> Swapping the positions of the largest and smallest value
        
        */
        double x = minPos(NUMBERS);
        System.out.println(x);

    }

    // Create and test a method that will output the average of all values in the array
    public static int avgCalculator(double[] arr){

        int total = 0;
        for(int i = 0; i<arr.length; i++){
            total += arr[i];
        }
        return(total/arr.length);
    }

    public static double maxPos(double[] arr){
        double max=0;
        for(double i:arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }

    public static double minPos(double[] arr){
        double min=10000000;
        for(double i:arr){
            if(i<min){
                min = i;
            }
        }
        return min;
    }
}
