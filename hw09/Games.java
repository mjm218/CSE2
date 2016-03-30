//import scanner
import java.util.Scanner;

import java.util.Random; 

//beginning of public class
    public class Games {

//beginning of main method    
    public static void main (String[] args){
        
     //declare scanner "myScanner"
    Scanner myScanner = new Scanner(System.in);
    
    //prompt user to pick a game
    System.out.println("Welcome to Mike's game center!");
    System.out.println("Please choose between these three games: guessTheBox, spinTheWheel, or scrambler");
            String game = myScanner.next();
    
    
    //if user inputs "guessTheBox" - they go to guessTheBox method
    if(game.equals("guessTheBox")) 
    {
       guessTheBox();
    } 
    
    //if user inputs "spinthewheel" - they go to spinthewheel method
    else if (game.equals("spinTheWheel"))
    {
        spinTheWheel();
    }
    
    //if user inputs "scrambler" - they go to scrambler method
    else if (game.equals("scrambler"))  
    {
        String scrambled = scrambler();
            System.out.println(scrambled);
            //prints the scrambled word
        
    }
    
    //if no game is entered, there is an error
    else {
        System.out.println("ERROR: game type not found");
        System.out.println("Please enter a valid game type: ");
        } 
    }
    
    
    public static void guessTheBox(){
    //start of guessTheBox game
    
    Scanner myScanner = new Scanner(System.in);
     //declare scanner "myScanner"
    
    int guess = 0;
    int winningNum = 0;
    //initialize user guess and the winning number
    
    
    winningNum = 1 + (int)(Math.random()*3);
    //winning number is random number 1-3. -1/3 chance of winning
    
        System.out.print("Enter your guess of: 1,2, or 3: ");
        //prompt user for number
        
        //must input an integer
        while (myScanner.hasNextInt()) {
            guess = myScanner.nextInt();
                 if (guess == winningNum) {
                    //if the guess = the randomly generated number, the user wins
                    System.out.println("Correct match: You're a winner!");
                    }
    
                else {
                //else, user loses
                System.out.println("Sorry, not a match: you lose.");
                }
                
        if (guess!=1 && guess!=2 && guess!=3)  
        //guess has to be 1, 2, or 3
        {
            System.out.println("Error: must enter a valid guess:");
            System.out.println("Please try again: ");
            }
        }
        
        while (!myScanner.hasNextInt()) 
        //if not an integer, error
        {
            System.out.println("Error: must enter an integer");
            System.out.println("Please try again: ");
        }
        
        
       
    }
     
    ///////////////////////////////////////////////////////////////
    
    public static void spinTheWheel() {
    
    //declare scanner "myScanner"
    Scanner myScanner = new Scanner(System.in);
    
    Random random = new Random();
    
    //declare variables
    String winningColor = "";
    int color;
    String colorInput;
    
    //user picks a color
    System.out.println("Choose a color: red or black: ") ;
    colorInput = myScanner.next();
    
    //user picks an integer
    System.out.println("Choose an integer from 1-5: ");
    int numberInput = myScanner.nextInt();
    
    int winningNumber = 1 + (int)Math.random()*5;
    //ranfom number from 1-5 is winning number
    
    //winning color out of 2 colors is generated. 1=red, 2=black
    color = 1 + (int)Math.random()*2;
    if (color == 1){
        winningColor = "red";
        }
    if (color == 2){
        winningColor = "black";
    }
    
    //user must get winning color and number to win
    if (colorInput == winningColor && numberInput == winningNumber) {
        System.out.println("You win! The wheel spun " +colorInput+ " " +numberInput);
    }
    //or else they lose the game
    else {
        System.out.println("Sorry, you didn't win spinTheWheel");
    }
    }
    
    //////////////////////////////////////////////////////////////////
    
     public static String scrambler(){
     //scrambler method
    
        Scanner myScanner = new Scanner(System.in);
        //declare scanner
        
        //Prompt user to input a word
        System.out.print("Input a word: ");
        String scrambled = myScanner.nextLine();
        
        //need two strings
        //one has user's characters, and one has no characters
        StringBuilder newWord = new StringBuilder();
        StringBuilder oldWord = new StringBuilder(scrambled);
        
        //user's word needs at least one letter
        while (oldWord.length()>0) 
        {   
            
            //gives us a random character in the word
            int character = (int)(Math.random()*oldWord.length());
            
            //put character into the empty string
            newWord.append(oldWord.charAt(character));
            
            //make sure the character can't be chosen again
            oldWord.deleteCharAt(character);
        }
        return newWord.toString();
        //return to the main function so word can be printed out
    } //end of the scrambler method
} //end of the class
    
    
    
    
    
    