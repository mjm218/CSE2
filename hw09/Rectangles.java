//import scanner
import java.util.Scanner;

//beginning of public class
    public class Rectangles {

    public static void main(String[] args){
    
    //declare scanner "myScanner"
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Please enter a word or number: ");
        if (myScanner.hasNextInt()) {
             int number = myScanner.nextInt();
             rectangle(number);
        }
        else {
            String word = myScanner.nextLine();
            rectangle(word);
        }
        }
    
    public static void rectangle (String word) {
    
        int length = word.length();
        System.out.println("output: ");
        for (int i=0; i<length; i++) {
            System.out.println(word);
    }
    
        System.out.println("");
    }
    
    public static void rectangle (int number) {
        System.out.println("output: ");
        for (int i=0; i<number; i++) {
            for (int j=0; j<number; j++) {
                System.out.print("%");
    }
        
            System.out.println("");
        }
    }
    }
    
    
    
   
        
    