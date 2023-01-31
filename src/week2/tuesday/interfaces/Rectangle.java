package week2.tuesday.interfaces;

public class Rectangle implements Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        //implementation to draw a rectangle
        System.out.println("Draw a rectangle");
    }
    @Override
    public double getArea() {
        return width * height;
    }
}
