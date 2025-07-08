// Animal base class
class Animals {
    String name;

    Animals(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Dog subclass
class Dog extends Animals {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// Cat subclass
class Cat extends Animals {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
