package week2.wednesday.access_modifiers;

class Car {
    private String carName;

    // Private constructor
    public Car(String name) {
        this.carName = name;
    }

    // Private method
    private String getCarName() {
        return this.carName;
    }

    // Inner class
    class Engine {
        String engineType;

        void setEngine() {
            // Accessing the carName property of Car using the getCarName method accessible in the inner class:
            if (getCarName().equals("Chrysler")) {
                this.engineType = "Smaller";
            } else {
                this.engineType = "Bigger";
            }
        }
    }
}

public class private_modifier2 {
    public static void main(String args[]) {
        Car car = new Car("BMW");// This will throw a Compile Time Error
    }
}
