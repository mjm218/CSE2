//Michael McAteer
//Hw7

//goal: create double helix

//import scanner
import java.util.Scanner;

//beginning of public class
    public class Twisty {

//beginning of main method    
    public static void main (String[] args){
        
    //declare scanner "myScanner"
    Scanner myScanner = new Scanner(System.in);
    
    int length = 0;
    boolean acceptableLength = false;
    
    System.out.print("intput your length: "); //must be between 0 and 80
        while (!acceptableLength) {
        if (myScanner.hasNextInt()) {
            length = myScanner.nextInt();
                if (length >80 || length<0) {
                    System.out.println("   ERROR: need an integer between 0 and 80");
                    System.out.print("Input your desired length: ");
                    length = myScanner.nextInt();
                }
                
        else{ //must be an integer
            acceptableLength = true;
            myScanner.nextInt();
        
        }
    }
    
    int width = 0;
    boolean acceptableWidth = false;
    
    System.out.print("intput your width: "); //must hava valid width
    while (!acceptableWidth) {
        if (myScanner.hasNextInt()) {
            width = myScanner.nextInt();
                if (width<0) {
                    System.out.println("   ERROR: need an integer");
                    System.out.print("Input your desired length: ");
                    length = myScanner.nextInt();
        }
        
        else { //width must be integer
            acceptableWidth = true;
            myScanner.nextLine();
        }
        }
    }
    
    int i;
    int j;
    for(i=0; i<width; i++) { //print #'s'
        for(j=0; j<length; j++) {
            if((j%(2*width)==i)) {
                System.out.print("#");
            }
            if ((2*width-(i+1)==j%(2*width))){
                System.out.print("#");
            }
            else if((width-i)==j%(2*width)+1 ){
            }
            else if (j==(width-i)) { //print \\'s going up
                System.out.print ("\\"); 
            }
             else if ((width+i==j%(2*width))){
                    System.out.print("\\"); //prints \\'s going down'
            }
            else {
                System.out.print(" ");
            }
        }
    
    System.out.println();
}
}
} //main method
} //class

        
    