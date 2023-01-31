package week2.tuesday.abstract_classes.shape;

public abstract class Shape {

    //non-abstract method
    public void moveTo(int x, int y) {
        System.out.println("Moving " + x + " units to right and " + y + " units up " );
    }

//    abstract method
    public abstract void draw();


}

