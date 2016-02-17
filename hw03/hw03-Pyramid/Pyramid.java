//Michael McAteer
//hw03- volume of a pyramid
import java.util.Scanner; //import scanner
public class Pyramid{ //start of class
    public static void main(String[] args){ //start of method
    Scanner myScanner = new Scanner(System.in); //declare scanner
    System.out.println("length of pyramid square:"); //input length of pyramid square
    double length = myScanner.nextDouble(); //declare length variable
    System.out.println("width of pyramid square:"); //input width of pyramid square
    double width = myScanner.nextDouble(); //declare width variable
    System.out.println("height of pyramid square:"); //input height of pyramid
    double height = myScanner.nextDouble(); //deckare height variable
    double volume= (length*width*height)/(3); //calculate volume
    System.out.println(volume); //print volume
    }
}