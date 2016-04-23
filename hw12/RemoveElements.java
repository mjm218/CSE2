//Michael McAteer
//cse002 hw12 program 2
//delete #s in an array given users input and print the new array

import java.util.Scanner;

public class RemoveElements{
  public static void main(String [] arg){
	
	Scanner scan=new Scanner(System.in);
    
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  //random list of numbers
  public static int [] randomInput(){           
      int[] ints = new int[10];               
      for (int i=0; i<ints.length; i++){ //counts to 10
          ints[i] = (int)((Math.random()*10) + 1); //fill w/ random numbers from 1-10
      }
      return ints;  //return random list of #s                
  }
  
  public static int[] delete(int ints[], int pos){
      //deleted list = new array
      int [] deletedlist = new int[ints.length-1];      
      //counts list length
      for (int i=0; i<ints.length-1; i++){      
          //i>= index
          if(i>=pos){                             
              //the elements will move 
              deletedlist[i]=ints[i+1];               
              } 
          //else, same list
          else{                                     
            deletedlist[i] = ints[i];
          }
      }
      //return the new list w/ deleted #
      return deletedlist;                               
  }
 
 //removes the #
 public static int [] remove(int list[], int target){
    int counter = 0;
    for(int i=0; i<list.length; i++){
        if (list[i]==target){      
            counter++;                
          	//counter from 0 to length of list
        	}
		}
    
    //newlist = new array
    int[] newlist =new int[list.length-counter];        
    int j = 0;      
    for(int i=0; i<list.length; i++){
        if(list[i]!= target){  //when element is not found
       		newlist[j] = list[i];   //print orig list
        		j++;       //increment variable j
    	}
    }
    return newlist;    //return newlist = new array
 }
}
 
 