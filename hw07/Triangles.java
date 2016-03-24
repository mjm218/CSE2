//Michael McAteer
//Hw7
//goal:number triangles
//have to input number twice - couldn't figure out :(

//import scanner
import java.util.Scanner;

//beginning of public class
    public class Triangles {

//beginning of main method    
    public static void main (String[] args){
        
    //declare scanner "myScanner"
    Scanner myScanner = new Scanner(System.in);
    
    int number = 0;
    boolean acceptableNum = false;
    
    System.out.println("enter an integer between 5 and 30");
    
        
    //must be btw 5 and 30
    while (!acceptableNum) {
        if (myScanner.hasNextInt()) {
            number=myScanner.nextInt();
               if (number >= 30 || number < 5) {
                    System.out.println("ERROR: need an integer between 5 and 30");
                    System.out.print("Input your desired number: ");
                    number = myScanner.nextInt();
        }
        
            //must be an integer
            else {
                acceptableNum = true;
                number = myScanner.nextInt();
            }
        }
    
    // for loop
    System.out.println("The For Loop: ");
    int forcounter1 = 1; //first 1/2
        for (int i = 1; i<number; i++) {
               for(int j=1; j<=forcounter1; j++)  {
                    System.out.print(forcounter1);
               }
        forcounter1 ++;
        System.out.println();
        }
    
    int forcounter2 = 1; //second 1/2
        forcounter2 = number ;
        for (int i=1; i<number+1; i++) {
            for (int j=0; j<forcounter2;j++) {
               System.out.print(forcounter2);
                }
        forcounter2--;
        System.out.println();
        }
         
    // while loop
    System.out.println("The while Loop: ");
    int i=1; int j =0; //first 1/2
        while (i<=number){
            j=0;
            while (j<i){
                System.out.print(i);
                j++;
            }
            System.out.println("");
            i++;
        }
        System.out.println("");
        
        i = number - 1; //second 1/2
        while (i > 0) {
            j = 0;
            while (j<i) {
                System.out.print(i);
                j++;
            }
            System.out.println("");
            i--;
            }
        System.out.println("");
    }
    
    
    //do while loop
    System.out.println("The Do While loop: ");
       int i = 1; // first 1/2
       int j = 1;
       do {
          j = i;
               do {
               System.out.print(i);
               j--;
               }
               while (j>0);
               System.out.println("");
               i++;
       }     
         while (i<=number); //second 1/2
            i = (number + 1);
               do {
                    i = j;
                    do {
                        System. out.print(i);
                        j--;
                    }
                    while (j > 0);
                    System.out.println("");
                    i--;
               } while (i>=1);
               
    } //main method
    }// class
    
  