public class Triangle {

    private double base;
    private double height;
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
