class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.display();
    }
}
