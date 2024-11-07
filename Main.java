class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is cycling");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.move();

        v = new Bike();
        v.move();
    }
}