//Michael Mcateer
//hw03 cse 2 - convert meters to inches
import java.util.Scanner; //import scanner
public class Convert{ //start of class
    public static void main(String[] args) { //start of method
    Scanner myScanner = new Scanner(System.in); //declare scanner
    System.out.println("distance in meters:"); //insert distance meters
    double meters=myScanner.nextDouble(); //declare meters
    double inches=meters*39.3701; //1 meter = 39.3701
    System.out.println(inches + " inches is " + meters + " meters"); //inches to meters conversion
    }
}