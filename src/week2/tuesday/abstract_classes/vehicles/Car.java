package week2.tuesday.abstract_classes.vehicles;

class Car extends Vehicle {

    public Car(int numberOfWheels, String fuelType) {
        super(numberOfWheels, fuelType);
    }
    @Override
    public void move() {
        System.out.println("The car is moving on the road.");
    }
    @Override
    public void stop() {
        System.out.println("The car has stopped at a traffic signal.");
    }

}
