import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BreakThings {

  //TODO 1: Let's go through line by line... what will happen?
  //TODO 2: Fix to avoid any exceptions
  public static void main(String[] args) throws FileNotFoundException {

    Scanner input = new Scanner(new File("NotARealFile.txt"));

    //try {
    //if (args.lengh == 0) print that you need a cmd line argument 
        String arg1 = args[0];
       //} catch (ArrayindexOutOfBoundsException e) {
       //}
    System.out.println("Cmd line argument " + arg1);

    Object broken = null;
    System.out.println(broken.toString());
    
    int reallyBroken = 100 / 0;
  }
}