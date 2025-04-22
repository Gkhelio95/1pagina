package TareaPOO;

public class pooJava {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020, 4);
        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "MT-07", 2021, "sport");

        car1.accelerate(50);
        motorcycle1.accelerate(30);
        car1.brake(10);

        car1.details();
        motorcycle1.details();
    }
}

// Base class
class Vehicle {
    String brand;
    String model;
    int year;
    int speed;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        speed += amount;
    }

    public void brake(int amount) {
        speed = Math.max(0, speed - amount);
    }

    public void details() {
        System.out.println(brand + " " + model + " (" + year + ") - Speed: " + speed + " km/h");
    }
}

// Car class that inherits from Vehicle
class Car extends Vehicle {
    int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Doors: " + doors);
    }
}

// Motorcycle class that inherits from Vehicle
class Motorcycle extends Vehicle {
    String handlebarType;

    public Motorcycle(String brand, String model, int year, String handlebarType) {
        super(brand, model, year);
        this.handlebarType = handlebarType;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Handlebar: " + handlebarType);
    }
}
