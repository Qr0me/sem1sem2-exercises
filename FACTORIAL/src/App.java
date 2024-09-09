public class App {
    public static void main(String[] args) throws Exception {
        double startTime;
        double endTime;
        double elapsedTime;
        int n = 5;

        startTime = System.nanoTime();
        int ITERATIVE = iterative_factorial(n);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;

        System.out.println("RESULT: "+ITERATIVE);
        System.out.println("ITERATIVE TIME: "+(elapsedTime/1000000)+"ms");

        startTime = System.nanoTime();
        int RECURSIVE = recursive_factorial(n);
        endTime = System.nanoTime();
        elapsedTime = endTime-startTime;

        System.out.println("RESULT: "+RECURSIVE);
        System.out.println("RECURSIVE TIME: "+(elapsedTime/1000000)+"ms");
    }

    static int iterative_factorial(int n){
        int i = 1;
        for(int j = 1;j<=n;j++){
            i = i*j;
        }

        return i;
    }

    static int recursive_factorial(int n){
        if (n == 1){
            return n;
        }

        else {
            return n * recursive_factorial(n-1);
        }
    }
}
