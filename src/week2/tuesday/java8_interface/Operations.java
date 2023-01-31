package week2.tuesday.java8_interface;

public interface Operations {

    default int add(int a, int b) {
        return a + b;
    }

    static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
