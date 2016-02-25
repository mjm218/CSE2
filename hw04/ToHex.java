//Michael McAteer
//Hw04
//Decimal to Hexadecimal Converter
//goal: convert three integers: R, G, and B and convert them to hexadecimals in the form of "xxxxxx"

//import scanner
import java.util.Scanner;

//beginning of public class
    public class ToHex {

//beginning of main method    
    public static void main (String[] args){
        
    //declare scanner "myScanner"
    Scanner myScanner = new Scanner(System.in);
    
    //User must input three numbers to be converted
    System.out.println("Please enter three numbers representing RGB values: ");
    
    //declare integers input by user as red, green, and blue
    int red = myScanner.nextInt();
    int green = myScanner.nextInt();
    int blue = myScanner.nextInt();
    
     //red, green, and blue numbers must be numbers between 255 and 0
        if (red>255||red<0) {
           System.out.println("Sorry, you must enter values between 0-255.");
        }
        if (green>255||green<0) {
            System.out.println("Sorry, you must enter values between 0-255.");
        }
        if (blue>255||blue<0)  {
            System.out.println("Sorry, you must enter values between 0-255.");
        }
    
    //declare two strings for each color- one for how many divisioins can be made for each integer, resulting in six strings
    //the second set of strings will be used for the remainders of the divisions
    String Red1;
    String Green1;
    String Blue1;
    String Red2;
    String Green2;
    String Blue2;
        
        
        
        //int reddivider= how many times red integer can be divided by 16
        //int redremainder= the remainder from when the red integer is divided
           int reddivider = red/16;
           int redremainder = red%16;
            
            //output first character of color red
            //switch statements to output corresponding letters if reddivider>=10
               switch (reddivider) {
                   case 10: Red1 = "A";
                       break;
                    case 11: Red1 = "B";
                        break;
                    case 12: Red1 = "C";
                        break;
                    case 13: Red1 = "D";
                        break;
                    case 14: Red1 = "E";
                        break;
                    case 15: Red1 = "F";
                        break;  
            //if reddivider<10, it is simply the integer as a result of dividing original red input
                     default: Red1 = String.valueOf(reddivider);
               }
           
              //output second character of color red
              //switch statements to output corrseponding letters if redremainder>=10
               switch (redremainder) {
                   case 10: Red2 = "A";
                       break;
                    case 11: Red2 = "B";
                        break;
                    case 12: Red2 = "C";
                        break;
                    case 13: Red2 = "D";
                        break;
                    case 14: Red2 = "E";
                        break;
                    case 15: Red2 = "F";
                        break;   
                    default: Red2 = String.valueOf(redremainder);
                    //if redremainder<10, it is simply the remainder as a result of dividing the original red input
                    }
            
            //int greendivider= how many times green integer can be divided by 16
            //int greenremainder= the remainder from when the green integer is divided
            int greendivider = green/16;
            int greenremainder = green%16;
         
               //output first character of color green
               //switch statements to output corresponding letters if greendivider>=10
               switch (greendivider) {
                   case 10: Green1 = "A";
                       break;
                    case 11: Green1 = "B";
                        break;
                    case 12: Green1 ="C";
                        break;
                    case 13: Green1 = "D";
                        break;
                    case 14: Green1 = "E";
                        break;
                    case 15: Green1 = "F";
                        break;       
                    default: Green1 = String.valueOf(greendivider);
                    //if greendivider<10, green is simply the integer as a result of dividing original red input
                   }
               
               //output second character of color green
               //switch statements to output corrseponding letters if greenremainder>=10
               switch (greenremainder) {
                   case 10: Green2 = "A";
                       break;
                    case 11: Green2 = "B";
                        break;
                    case 12: Green2 = "C";
                        break;
                    case 13: Green2 = "D";
                        break;
                    case 14: Green2 = "E";
                        break;
                    case 15: Green2 = "F";
                        break;       
                    default: Green2 = String.valueOf(greenremainder);
                    //if greenremainder<10, it is simply the remainder as a result of dividing the original red input
                    }
            
            //int bluedivider= how many times blue integer can be divided by 16
            //int blueremainder= the remainder from when the blue integer is divided
            int bluedivider = blue/16;
            int blueremainder = blue%16;
               
                //output first character of color blue
                //switch statements to output corresponding letters if greendivider>=10
                switch (bluedivider) {
                   case 10: Blue1 = "A";
                       break;
                    case 11: Blue1 = "B";
                        break;
                    case 12: Blue1 = "C";
                        break;
                    case 13: Blue1 = "D";
                        break;
                    case 14: Blue1 = "E";
                        break;
                    case 15: Blue1 = "F";
                        break;       
                    default: Blue1 = String.valueOf(bluedivider);
                    //if bluedivider<10, it is simply the integer as a result of dividing original blue input
                    }
            
                //output second character of color green
                //switch statements to output corrseponding letters if blueremainder>=10
                switch (blueremainder) {
                   case 10: Blue2 = "A";
                       break;
                    case 11: Blue2 = "B";
                        break;
                    case 12: Blue2 = "C";
                        break;
                    case 13: Blue2 = "D";
                        break;
                    case 14: Blue2 = "E";
                        break;
                    case 15: Blue2 = "F";
                        break;       
                    default: Blue2 = String.valueOf(blueremainder);
                    //if blueremainder<10, it is simply the remainder as a result of dividing the original blue input 
                    }
            
            //print out the both the divider and remainder for each color
            System.out.println("Decimal numbers R= " + red + " G= " + green + " and B= " + blue+ " are represented in hexidecimal form as: #" +Red1 + Red2 + Green1 + Green2 + Blue1 + Blue2 );
            
        
   //end of main method 
    } 
//end of public class
}  
