import java.util.*;
public class LinkedListAPI {
    public static void main(String[] args){
        LinkedList<String> LL = new LinkedList<String>();
        LL.add("A");
        LL.add("b");
        LL.add("c");
        LL.add("d");
        LL.add("e");
        System.out.println(LL);

        // print by using for loop
        System.out.println("*Print linked list using for = ");
        for(String s: LL)
        {
        System.out.println(s + " ");
        }

        // add at a particular position
        System.out.println("* Add at index 2 =");
        LL.add(2, "Hello World");
        System.out.println(LL);
        // delete
        System.out.println("* Delete b = ");
        LL.remove("b");
        System.out.println(LL);
    }    
}
