import java.util.Scanner;
//Part a: create a College class with name, number of students, year founded

//Part b: In the main, create 3 colleges and put them in an array

//Part c: Take college name as input and print the year it was founded

public class College {
    //member variables
    private String name;
    private int numStudents;
    private int yearFounded;

    public College(String name, int numStudents, int yearFounded) {
        this.name = name;
        this.numStudents = numStudents;
        this.yearFounded = yearFounded;
    }

    public College() {
        name = "default college";
        numStudents = 0;
        yearFounded = 2024;
    }

    public String getName() {
        return name;
    } 

    public int getNumStudents() {
        return numStudents;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public static void main(String[] args) {
        College brynMawr = new College("Bryn Mawr", 1742, 1885);
        College haverford = new College("Haverford", 1600, 1833);
        College upenn = new College("University of Pennsylvania", 28000, 1740);

        College[] colleges = new College[3];

        colleges[0] = brynMawr;
        colleges[1] = haverford;
        colleges[2] = upenn;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a college name");

        //sc.hasNextLine()
        String inputName = sc.nextLine();
        boolean found = false;

        for (int i=0; i<colleges.length; i++) {
            if (colleges[i].getName().equals(inputName)) {
                System.out.println("Year founded: " + colleges[i].getYearFounded());
                found = true;
            } 
        }

        if (!found)
            System.out.println("The college you entered: " + inputName + " is not in our database");
        //find the inputName in colleges array and print the year it was
        //founded. Otherwise print "Not in our database"
    }
}
