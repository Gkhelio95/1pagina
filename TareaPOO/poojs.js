class Vehicle {
    constructor(brand, model, year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    accelerate(amount) {
        this.speed += amount;
    }

    brake(amount) {
        this.speed = Math.max(0, this.speed - amount);
    }

    details() {
        return `${this.brand} ${this.model} (${this.year}) - Speed: ${this.speed} km/h`;
    }
}

// Car class that inherits from Vehicle
class Car extends Vehicle {
    constructor(brand, model, year, doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    details() {
        return `${super.details()} - Doors: ${this.doors}`;
    }
}

// Motorcycle class that inherits from Vehicle
class Motorcycle extends Vehicle {
    constructor(brand, model, year, handlebarType) {
        super(brand, model, year);
        this.handlebarType = handlebarType;
    }

    details() {
        return `${super.details()} - Handlebar: ${this.handlebarType}`;
    }
}

// Create instances and test methods
const car1 = new Car("Toyota", "Corolla", 2020, 4);
const motorcycle1 = new Motorcycle("Yamaha", "MT-07", 2021, "sport");

car1.accelerate(50);
motorcycle1.accelerate(30);
car1.brake(10);

console.log(car1.details());      // "Toyota Corolla (2020) - Speed: 40 km/h - Doors: 4"
console.log(motorcycle1.details()); // "Yamaha MT-07 (2021) - Speed: 30 km/h - Handlebar: sport"
