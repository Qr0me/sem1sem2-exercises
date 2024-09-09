public class Efficiency {
    public static void main(String[] args) {

        // 1 - Constant
        int a = 1;
        a++;
        System.out.println("Number = "+a); // 1x

        // n - Linear
        int n = 5;
        for(int b = 1; b<=n; b++){
            System.out.println("Iteration "+ b); //5x
        }

        // n^2 - Quadratic
        int counter = 1;
        for(int c = 1; c<=n;c++){
            for(int d=1; d<=n; d++){
                System.out.print(counter++ +""); // if n = 100, 10.000x
            }
            System.out.println(""); // if n = 100, 100x
        }

        // log(n) - Logarithmic
        n = 10;
        counter = 1;
        while(n > 1){ // f(n) = 2 log(n); 0(log(n))
            n = n/2; // 3x
            System.out.println(counter++ +""); // 3x
        }
    }
}
