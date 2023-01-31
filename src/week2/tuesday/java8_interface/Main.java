package week2.tuesday.java8_interface;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(5, 7);
        System.out.println("Result of add: " + result);//Result of add: 12
        int randomNumber = Operations.getRandomNumber();
        System.out.println("Random number: " + randomNumber);
    }
}
