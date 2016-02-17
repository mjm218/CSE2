//Michael McAteer
//hw03- volume of a pyramid
import java.util.Scanner;
public class Pyramid{
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("length of pyramid square:");
    double length = myScanner.nextDouble();
    System.out.println("length of pyramid square:");
    double width = myScanner.nextDouble();
    System.out.println("height of pyramid square:");
    double height = myScanner.nextDouble();
    double volume= (length*width*height)/(3);
    System.out.println(volume);
    }
}