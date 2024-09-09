import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // SETS
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{1,6,2}));

        System.out.println("A = " + a);

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{7,5,1,3}));

        System.out.println("B = " + b);

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);

        System.out.println("Union = "+union);

        Set<Integer> intersection= new HashSet<Integer>(a);
        intersection.retainAll(b);

        System.out.println("Intersection = " + intersection);

        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        
        System.out.println("Difference = " + difference);

        // MAPS
    }
}
