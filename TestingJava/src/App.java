class Superclass {
    void display() {
        System.out.println("This is the superclass.");
    }
}

class Subclass extends Superclass {
    void display(){
        super.display();
        System.out.println("This is the subclass");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Subclass obj = new Subclass();
        obj.display();
    }
}