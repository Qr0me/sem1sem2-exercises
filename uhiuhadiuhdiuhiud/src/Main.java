public class Main {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(50,50);
//        Triangle tri = new Triangle(20, 10);
//        System.out.println(rect.getArea());
//        System.out.println(tri.getArea());

        MovablePoint mp = new MovablePoint(50,50);
        System.out.println(mp.toString());
        mp.moveUp();
        mp.moveLeft();
        System.out.println(mp.toString());
    }
}