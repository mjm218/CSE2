//Michael McAteer
//hw06
//CSE 2 - Run Factorial
//create an infinite loop which displays lines

//import utilities
import java.util.*;

//start of public class
public class TextSpinner{

    //main method
    public static void main(String[] args){
    
        //declare random variable
        int x=808;
        
            //will always be true - creates an infinite loop
            while (x>0)
            {
                
                //print given sequence of lines
                System.out.print("/");
                System.out.print("\b");
                System.out.print("-");
                System.out.print("\b");
                System.out.print("\\");
                System.out.print("\b");
                System.out.print("|");
                System.out.print("\b");
            }
    }
}