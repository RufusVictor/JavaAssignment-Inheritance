abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void displayInfo();
}

class Car extends Vehicle {
    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Doors: " + doors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Has Gear: " + hasGear);
    }
}

class Truck extends Vehicle {
    int capacity;

    public Truck(String brand, int speed, int capacity) {
        super(brand, speed);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Capacity: " + capacity + " tons");
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180, 4);
        car.displayInfo();

        System.out.println();

        Vehicle bike = new Bike("Yamaha", 120, true);
        bike.displayInfo();

        System.out.println();

        Vehicle truck = new Truck("Volvo", 100, 15);
        truck.displayInfo();
    }
}
