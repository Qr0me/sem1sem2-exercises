import java.util.*;

public class App {
    static void pushStack(Stack<Integer> stack){
        for(int i = 3; i<=7; i++){
            stack.push(i);
        }
    }

    static void popStack(Stack<Integer> stack){
        for(int i = 0; i<5; i++){
            stack.pop();
        }
    }

    static void searchStack(Stack<Integer> stack, int element){
        Integer pos= (Integer) stack.search(element);
        if(pos == -1) System.out.println("ELEMENT NOT FOUND");
        else System.out.println(pos);
    }
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        pushStack(stack);
        searchStack(stack, 7);

        System.out.println(stack);
        System.out.println(stack.peek());
        popStack(stack);
        System.out.println(stack);
    }
}
