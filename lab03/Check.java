//Michael McAteer
//lab 03
//program to split check evenly

import java.util.Scanner;
public class Check{ //start of class Check
    public static void main(String[] args) { //start of main method
    Scanner myScanner = new Scanner(System.in); //declare scanner
    System.out.print("Enter the original cost of the check in the form xx.xx:"); //print out check cost
    double checkCost = myScanner.nextDouble();
    System.out.print("Enter the percentage tip that you wish to pay as a whole number in the form xx:"); //tip percentage
    double tipPercent = myScanner.nextDouble();
    tipPercent/= 100; //convert check to decimal
    System.out.print("Enter the number of people who went out to dinner:"); //number of people
    int numPeople = myScanner.nextInt();
    double totalCost; //naming total cost
    double costPerPerson; //naming cost per person
    int dollars,dimes, pennies; // naming dollars, dimes, pennies
    totalCost=checkCost * (1 + tipPercent); //calculate total cost
    costPerPerson=totalCost / numPeople; //calculate cost per person
    dollars=(int)costPerPerson; //calculate total dollars
    dimes=(int)(costPerPerson * 10) % 10; //calculate total dimes
    pennies=(int)(costPerPerson * 100) % 10; //calculate total pennies
    System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    } //end of main method
} //end of class