// Vehicle base class
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

// Car subclass
class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Car has " + numberOfDoors + " doors.");
    }
}

// Bike subclass
class Bike extends Vehicle {
    boolean hasCarrier;

    Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Bike has carrier: " + hasCarrier);
    }
}
