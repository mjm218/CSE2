//write a program that takes decimal RGB values (three inputs)
//then converts them to hexadecimal

//import scanner
import java.util.Scanner;
//est a class
public class Untitled1  {
    //declare main method
    public static void main(String[] args)  {
        //declare scanner
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        //prompt user to enter RGB values
        System.out.print("Please enter three numbers representing RGB values: ");
        //verify that the user entered and int
        if(myScanner.hasNextInt())  {
            
            //have scanner read in inputs only if they are ints
            int digit1=myScanner.nextInt();
            int digit2=myScanner.nextInt();
            int digit3=myScanner.nextInt();
        
            //verify that the users input is <= 255
            if (digit1 < 256)   {
                if (digit2 < 256)   {
                    if (digit3 <256)    {
                        
                        //if numbers are inputted correctly (an int between 0 and 255) convert the digits to hexadecimal format
                        //call method toHexString() to convert users decimal input to a hexidecimal 
                        String answer1=Integer.toHexString(digit1);
                        String answer2=Integer.toHexString(digit2);
                        String answer3=Integer.toHexString(digit3);
                        
                        //print out the numbers representing the RGB values and their converted haxadecimal values
                        System.out.println("The decimal numbers R: "+digit1+", G: "+digit2+", B: "+digit3+" is represented in hexadecimal as:"+answer1+""+answer2+""+answer3+"");
                    }
                }
            }
            //if user enters a number greater than 255 for digit1 print error message and terminate program
            else if (digit1 > 255)    {
                System.out.println("Sorry, you must enter values between 0-255.");
                }
            //same for digit2
            else if (digit2 > 255)  {
                System.out.println("Sorry, you must enter values between 0-255.");
                }
            //ditto for digit3
            else if (digit3 >255)   {
                System.out.println("Sorry, you must enter values between 0-255");
                }
        //if user enters any input other then an int, print error message
        else   {
            System.out.println("Sorry, your input must consist of integers.");
            }
        }
        
    }//end of main method
}// end of class