package week2.tuesday.abstract_classes.vehicles;

public abstract class Vehicle {
    private int numberOfWheels;
    private String fuelType;

    public Vehicle(int numberOfWheels, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
    }
    public abstract void move();
    public abstract void stop();

    public void horn(){
        System.out.println("Loud Sound of a horn from a vehicle");
    }
}
