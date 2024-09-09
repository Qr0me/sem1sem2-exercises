class Node{
    String key;
    Node left, right;

    public Node(String item){
        key = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;
    BinaryTree(){root = null;}

    void printInorder(Node node){
        if(node == null){
            return;
        }

        printInorder(node.left); // left child
        System.out.print(node.key +  " "); // print the data of the node
        
        printInorder(node.right); //right child
    }

    void printInorder(){printInorder(root);}

    void printPreorder(Node node){
        if(node == null){
            return;
        }

        
        System.out.print(node.key +  " ");

        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPreorder(){printPreorder(root);}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node("*");
        tree.root.left = new Node("+");
        tree.root.right = new Node("/");
        tree.root.left.left = new Node("x");
        tree.root.left.right = new Node("y");
        tree.root.right.left = new Node("a");
        tree.root.right.right = new Node("b");

        // Function call
        System.out.println("Inorder traversal");
        tree.printInorder();
        System.out.println();
        tree.printPreorder();
    }
}
