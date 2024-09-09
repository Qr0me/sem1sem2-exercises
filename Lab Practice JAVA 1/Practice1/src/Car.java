public class Car {
    int maxSpeed;
    String name;
    int year;
    boolean isEngineRunning;

    public Car(int maxSpeed, String name, int year){
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.year = year;
        this.isEngineRunning = false;
    }

    public void startEngine() {
        isEngineRunning = true;
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        isEngineRunning = false;
        System.out.println("Engine stopped.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }

    public static void main(String[] args){
        Car newCar = new Car(300, "Lamborghini", 2024);
        newCar.startEngine();
        newCar.stopEngine();
        newCar.displayInfo();
    }
}
