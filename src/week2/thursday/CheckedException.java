package week2.thursday;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {


    public static void main(String[] args) throws FileNotFoundException {

//        try {
            readFile("test.txt");
//        } catch(FileNotFoundException fnfe){
//            System.out.print("File Not found");
//        }
    }


    /*
    If you don't want to catch the exception in the method, you can use "throws" keyboard
    to move the exception up to be handled by the caller function
     */
    private static void readFile(String fileName) throws FileNotFoundException {

       // Reading a file using FileReader

        FileReader fileReader = new FileReader(fileName);

    }
}






// Checked exceptions are exceptions that Java makes you deal with one way or the other at compile time