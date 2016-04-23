//Michael McAteer
//CSE002 hw012
//CSE2Linear.java
//goal: print 15 grades, then search with binary and linear search


import java.util.Random;  //import utilities
import java.util.Scanner;

public class CSE2Linear{
	public static void main(String [] arg){
    Scanner myScanner = new Scanner(System.in); //import scanner
    int grades[] = new int[15]; //15 grades total
        System.out.println("Enter 15 integers for final grades"); //prompt user for grades

		int val1 = 0; //declare first variable
		int val2 = 0; //declare 2nd variable
		boolean bool = true;

		//val1 must be an integer and btw 0-100
		for (int i= 0;i<grades.length;i++) {
			while (true) {
				if (myScanner.hasNextInt()) {
				    val1=myScanner.nextInt();
					   if(val1>100||val1<0) {
						    System.out.println("Must input an integer between 0 and 100");
						    continue;
					} 
					//grades must be increasing in size
					if(val1<val2) {
						System.out.println("Grade must be greater than ("+val2+")");
						continue;
					}
					//while val1>val2
					else {
						grades[i] = val1;
						val2 = val1;
						break;
					} 
				}
				else {
					System.out.println("Must input an integer");
					myScanner.nextInt();
					continue;
				} 
            } //close  the while loop
		} //close for loop

		String result = "Sorted: "; //declare string result
		result+=listArray(grades);
		System.out.println(result); //prints out the users grades

        int search1 = 0; //declare first search
		int search2 = 0; //declare second search
		
		//promt user for binary and linear searches
		if (bool = true) {
		System.out.println("Enter a grade to search for: ");
		search1 = myScanner.nextInt();
		binary(grades,search1);
		Scrambled(grades);
		System.out.print("Enter a grade to search for: ");
		search2 = myScanner.nextInt();
		linear(grades,search2);
		} //close if
	} //close the main method

	//prints out the sorted grades
	public static String listArray(int num[]){
		String output = "{";
		for (int i=0;i<num.length;i++){
			if (i>0){
				output += ", ";
			}
			output += num[i];
		}
		output+="}";
		return output;
	}

 	//prints out the scrambled grades
 	public static void Scrambled(int[] grades){
        System.out.println( "Scrambled: ");
        int index;
        Random rand= new Random();
        for (int i = grades.length-1; i>0; i--){
            index = rand.nextInt(i+1);
            int temp = grades[index];
            grades[index] = grades[i];
            grades[i]=temp;
            System.out.print(grades[i] + " ");
 		}
        System.out.println(""); //prints new line
    }
    
//linear search	
public static int[] linear(int[] grades, int key){
      
      int i = 0;
      int iterations = 0;
      for(i = 0; i<grades.length; i++){
          if(key==grades[i]){ //if number is found
              System.out.println(key+" was found in the list with " +(i+1)+ " iterations"); //how many iterations it took to find
              iterations++; //keep searching
              break;
          }// end if statement
         
      } //when number i
      if (iterations>15){ //when grade is not found
          System.out.println(key+" was not found in the list with " +(i+1)+ " iterations");
      }
      return grades;
  } 
  
  //binary search
  public static int[] binary(int[] grades, int key){
      
      int max = 14;
      int min = 0;
      int mid = (max-min)/2;
      int iterations = 0;
      
      boolean bool = false;
      
      //always true
      while(max-min>0){
          iterations++;
          	if(grades[mid]==key){ 
              bool=true;
              break;
          } 
          else if(grades[mid]<key){
              min = mid;
              mid=(max+min+1)/2;
          }
          else{
              max = mid;
              mid=(max+min-1)/2;
          }
      }
  
      if(bool){
          System.out.println(key+" was found in the list with "+iterations+" iterations");
      }
      else{
          System.out.println(key+ " was not found in the list with "+iterations+" iterations");
      }
      return grades;
  } 
 

}