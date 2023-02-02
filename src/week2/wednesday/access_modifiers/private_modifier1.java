package week2.wednesday.access_modifiers;

class Data {
    // private field
//    private String address;
    public String address;


}

public class private_modifier1 {

    public static void main(String[] args) {
        // Create an object of the Data class
        Data data = new Data();

        // trying to access a private field from another class
        data.address = "Toronto"; // This line would cause an error because the String address is private.
    }
}
