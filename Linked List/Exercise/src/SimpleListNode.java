public class SimpleListNode{
    static class Node{
        String data;
        Node next;

        // constructor

        Node(String newData){
            data = newData;
            next = null;
        }
    }

    Node head;

    public static void main(String[] args) {

        // Empty Linked List
        SimpleListNode list = new SimpleListNode();

        // Inserting 4 nodes with data (without link)
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sam = new Node("Sam");

        // Direct pointer head to tom
        list.head = tom;

        // Connecting nodes
        tom.next = dick;
        dick.next = harry;
        harry.next = sam;
        
        // Manual printing
        System.out.println(tom.data);
        System.out.println(tom.next.data);
        System.out.println(tom.next.next.data);
        System.out.println(tom.next.next.next.data); 

        System.out.println("\n---Other Way----------------------------------------------------------------------------\n");

        // Other way to print
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);

        System.out.println("\n---Exercise a----------------------------------------------------------------------------\n");

        Node bill = new Node("Bill");

        list.head = bill;
        bill.next = tom;

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);

        System.out.println("\n---Exercise b----------------------------------------------------------------------------\n");

        Node sue = new Node("Sue");

        harry.next = sue;
        sue.next = sam;

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);
        System.out.println(list.head.next.next.next.next.next.data);

        System.out.println("\n---Exercise c----------------------------------------------------------------------------\n");

        list.head = tom;
        tom.next = dick;

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);

        System.out.println("\n---Exercise d----------------------------------------------------------------------------\n");

        sue.next = null;
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);

        System.out.println("\n---Exercise e----------------------------------------------------------------------------\n");

        dick.next = sue;

        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);


    }
}