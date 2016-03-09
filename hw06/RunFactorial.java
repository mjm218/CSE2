//Michael McAteer
//Hw06
//CSE 2
//calculate factorials
    

import java.util.Scanner;

public class RunFactorial{

    public static void main(String[] args)  {
        
        int fact = 1;
        int input;
        int x = 1;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter an integer that is between 9 and 16:");
        input = myScanner.nextInt();
       
        while (input<9 || input>16) {
            System.out.println("Invalid input, enter again!");
            input =myScanner.nextInt();
        }
            
        while (input>=9 && input<=16) {
            if (x<=input) {
                fact *= x;
                x++;
         
        System.out.println("Input accepted:");
        System.out.println(+input+ "! = " +fact);
            }
        }
                
    }
}
