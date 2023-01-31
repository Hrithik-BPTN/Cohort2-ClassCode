package week2.tuesday.abstract_classes.vehicles;

public class Vehicle_Creator {

    public static void main(String[] args) {
        Car car1 = new Car(4,"Gasoline");


        Vehicle car = new Car(4,"Gasoline");
        car.move();
        car.stop();
        car.horn();

        Bicycle bicycle = new Bicycle(2,"electric");
        bicycle.move();
        bicycle.stop();
    }
}
