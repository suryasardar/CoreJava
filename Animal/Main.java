package Animal;
import Vehicle.*;
import Animals.*;

public class Main {
    public static void main(String[] args) {
        // Animal examples
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        dog.makeSound();
        cat.makeSound();

        // Vehicle examples
        Car car = new Car("Toyota", 180, 4);
        Bike bike = new Bike("Hero", 100, true);

        car.displayInfo();
        bike.displayInfo();
    }
}
