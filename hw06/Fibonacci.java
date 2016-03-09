//Michael McAteer
//hw06
//CSE 2 - Fibonacci sequence
//goal- create custom fibonacci sequence based on users' inputs

//import scanner utility
import java.util.Scanner;

//start of public class 
public class Fibonacci {
    
    //start of main method
    public static void main (String[] args){ 

    //creater scanner "myScanner"
    Scanner myScanner= new Scanner(System.in);

    //first fibonacci input = integer "a1"
    System.out.println("Enter the first number in the sequence: " );
    int a1 = myScanner.nextInt();
        
     //second integer = second input from user
    System.out.println("Enter the second number in the sequence: " );
    int a2 = myScanner.nextInt();
    
    System.out.println("How many numbers in the sequence you want to print: ");
    int n = myScanner.nextInt();
    
        //create while loop for user inputting integers less than 0 or nonintegers
        while(a1<0||a2<0||n<0)
            { 
            System.out.print ("Sorry, you must enter positive integers. ");
            System.out.print ("Enter the first number in the sequence: ");
            //if invalid input occurs, this prompts user for a valid first integer
            a1 = myScanner.nextInt();
            
            System.out.print ("Enter the second number in the sequence: ");
            //if invalid input occurs, this prompts user for a valid first integer
            a2 = myScanner.nextInt();
            
            System.out.print ("How many numbers in the sequence you want to print: ");
            //if invalid input occurs, this prompts user for a valid first integer
            n = myScanner.nextInt();
            }
            
        //print out sequence     
        System.out.print("The fibonacci sequence is: " +a1+ ", " +a2+ ", "); 
        //there are already two give integers, a1 and a2
        int counter = 2; 
        //declare a3
        int a3 = 0;
        
        while (counter<n) 
            {
            //calculates remaining numbers in sequence
            a3 = a1 + a2;
            System.out.println(a3 + ", ");
            a1 = a2;
            a2 = a3;
            counter++; 
            }
            
    }
}