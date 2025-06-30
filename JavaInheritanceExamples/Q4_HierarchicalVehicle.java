class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving the car");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Riding the motorcycle");
    }
}

public class Q4_HierarchicalVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        car.startEngine();
        car.drive();
        car.stopEngine();

        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}