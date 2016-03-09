//Michael McAteer
//Hw06
//CSE 2
//calculate factorials
    
//import scanner
import java.util.Scanner;

//beginning of class
public class RunFactorial{

    //beginning of main method
    public static void main(String[] args)  {
        
        // declare varaibles - factorial, input, and x for factorial
        int fact = 1;
        int input;
        int x = 1;
        
        //declare scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user's integer
        System.out.println("Enter an integer that is between 9 and 16:");
        input = myScanner.nextInt();
       
        //input must be between 9 and 6 
        while (input<9 || input>16) {
            System.out.println("Invalid input, enter again!");
            input = myScanner.nextInt();
        }
            
        //once input is between 9 and 6, calculate factorial
        while (input>=9 && input<=16) {
            if (x<=input) {
                fact *= x;
                x++;
         
        //print outcome once input is accepted
        System.out.println("Input accepted:");
        System.out.println(+input+ "! = " +fact);
            }
        }
                
    }
}
