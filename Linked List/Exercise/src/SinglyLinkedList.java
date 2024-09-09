
public class SinglyLinkedList {
    class Node{
        String data;
        Node next;

        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to the list

    public void addNode(String data){
        // Creating new node
        Node newNode = new Node(data);

        // Check if the list is empty

        if(head == null){
            // If list is empty, both head and tail will point to a new node
            head = newNode;
            tail = newNode;
        }else{
            // New node will be added after tail
            tail.next = newNode;
            // Move tail to the new nodeb
            tail = newNode;
        }
    }

    // Removing  nodes

    public void deleteNode(String data){
        Node current = head;
        // Delete data if node on the head
        if(current.data == data){
            head = current.next;

        }else{
            Node temp = null;
            // Check data is on the linked list
            while (current != null && current.data != data){
                temp = current;
                current = current.next;
            }
            // if data exists
            if(current != null){
                temp.next = current.next;
            }else{
                System.out.println("Data not found");
            }
        }
    }

    // Printing nodes

    public void printLinkedList(){
        Node current = head;

        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        System.out.print("Singly-linked list = ");
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
    
    public static void main(String[] args) throws Exception {
        SinglyLinkedList singlyLL = new SinglyLinkedList();

        // Adding nodes

        singlyLL.addNode("A");
        singlyLL.addNode("B");
        singlyLL.addNode("C");
        singlyLL.addNode("D");
        singlyLL.addNode("E");
        
        // Priting linked list
        singlyLL.printLinkedList();

        // Delete A
        System.out.println("Delete A: ");
        singlyLL.deleteNode("A");
        singlyLL.printLinkedList();

        // Delete d
        System.out.println("Delete d: ");
        singlyLL.deleteNode("d");
        singlyLL.printLinkedList();

        // Delete E
        System.out.println("Delete E: ");
        singlyLL.deleteNode("E");
        singlyLL.printLinkedList();


    }
}