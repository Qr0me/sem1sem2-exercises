import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Integer> integerSet1 = new HashSet<>();
        integerSet1.add(1);
        integerSet1.add(2);
        integerSet1.add(3);
        System.out.println("SET 1: "+integerSet1);

        HashSet<Integer> integerSet2 = new HashSet<>();
        integerSet2.add(4);
        integerSet2.add(5);
        integerSet2.add(6);
        System.out.println("SET 2: "+integerSet2);

        HashSet<Integer> integerSet3 = new HashSet<>();
        integerSet3.add(7);
        integerSet3.add(8);
        integerSet3.add(9);
        System.out.println("SET 3: "+integerSet3+"\n");
        
        // UNION
        HashSet<Integer> unionSet = new HashSet<>();
        unionSet.addAll(integerSet1);
        unionSet.addAll(integerSet2);
        unionSet.addAll(integerSet3);

        System.out.println("UNION: "+unionSet);

        //INTERSECTION
        HashSet<Integer> intersectionSet = new HashSet<>(integerSet1);
        intersectionSet.retainAll(integerSet2);
        intersectionSet.retainAll(integerSet3);

        System.out.println("INTERSECTION: "+intersectionSet);

        //DIFFERENCE
        HashSet<Integer> differenceSet = new HashSet<>(integerSet1);
        differenceSet.removeAll(integerSet2);

        System.out.println("DIFF. BETWEEN SET 1 and 2: "+differenceSet);
    }
}
