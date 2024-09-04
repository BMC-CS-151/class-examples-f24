import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = args[0];
        int numWords = 0;
        
        File f = new File(filename);

        //Scanner sc = new Scanner(filename) BAD! 
        //try {
        Scanner sc = new Scanner(f);
        //} catch (FileNotFoundException e) {
        //file doesn't exist
        //}

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            //String split -> arr of strings 
            String[] words = line.split(" ");
            numWords += words.length;

            //System.out.println("Line: " + line);
            //System.out.println(words);
        }

        System.out.println(numWords);
    }
}
