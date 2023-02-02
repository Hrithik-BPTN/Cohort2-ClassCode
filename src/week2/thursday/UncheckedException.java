package week2.thursday;

public class UncheckedException {

    public static void main(String[] args) {
//        String name = "john";
        String name = null;
        printLength(name);
    }

    private static void printLength(String myString) {

        try{
        System.out.println(myString.length());
        } catch (NullPointerException npe){
            System.out.print("String can't be null");
        }
    }
}









// The class Exception and any subclasses that are not also subclasses of RuntimeException are checked exceptions.