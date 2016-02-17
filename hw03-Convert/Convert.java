//Michael Mcateer
//hw03 cse 2 - convert meters to inches
import java.util.Scanner;
public class Convert{
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); //declare scanner
    System.out.println("distance in meters:");
    double meters=myScanner.nextDouble();
    double inches=meters*39.3701;
    System.out.println(inches + " inches is " + meters + " meters");
    }
}