public class Vehicle {
    public void start() {
        System.out.println("Starting vehicle...");
    }
}

public class Car extends Vehicle {
    public void start() {
        System.out.println("Starting car...");
    }
}

public class Driver {
    public void startVehicle(Vehicle vehicle) {
        vehicle.start();
    }
}

// Example usage
Driver driver = new Driver();
Vehicle car = new Car();
driver.startVehicle(car); // prints "Starting car..."