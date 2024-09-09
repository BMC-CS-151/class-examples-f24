import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.File;

public class Handling {

    //TODO 1: Read from the input file argument and print each line
    //      If the file doesn't exist, print an error message and return
    public static void read(String fname)  {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(fname));//System.In for user input
        } catch (Exception e) {
            System.out.println("File: " + fname + " does not exist"); 
            return;
        }

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        //System.out.print

    }

    public static void main(String[] args) {
        String fileToRead = args[0];
        read(fileToRead);
        //TODO 2: Call read with the first command line argument 
    }
}
