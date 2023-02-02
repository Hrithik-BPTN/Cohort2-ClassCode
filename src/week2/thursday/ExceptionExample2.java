package week2.thursday;

public class ExceptionExample2 {

    public static void main(String[] args) {

        try {
            int[] a = {1, 2, 3, 4};

            a[4] = 4;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }

    }
}
