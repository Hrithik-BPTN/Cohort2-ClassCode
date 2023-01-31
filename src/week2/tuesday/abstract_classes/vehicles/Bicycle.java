package week2.tuesday.abstract_classes.vehicles;

public class Bicycle extends Vehicle {

    public Bicycle(int numberOfWheels, String fuelType) {
        super(numberOfWheels, fuelType);
    }

    @Override
    public void move() {
        System.out.println("The bicycle is moving on the road.");
    }
    @Override
    public void stop() {
        System.out.println("The bicycle has stopped at a traffic signal.");
    }
}
