//Michael McAteer
//Hw04
import java.util.Scanner;
public class ToHex{
    public static void main (String[] args){
        Scanner myscanner= new Scanner(System.in);
        System.out.println("enter a decimal number");
        int decimal= myscanner.nextInt();
        char digits[]={0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F'};
        String hexadecimal="";
        if (decimal>0);{
        int hexValue= decimal%16;
        char hexChar;
        if (decimal<=9&&hexValue>=0){
            hexChar=(char)(hexValue+'0');}
        else if (decimal==10){
            hexChar=(char)(hexValue+'A');}
        else if (decimal==11){
            hexChar=(char)(hexValue+'B');}
        else if (decimal==12){
            hexChar=(char)(hexValue+'C');}
        else if (decimal==13){
            hexChar=(char)(hexValue+'D');}
        else if (decimal==14){
            hexChar=(char)(hexValue+'E');}
        else if (decimal==15){
        hexChar=(char)(hexValue+'F');
        }
        hexadecimal=hexValue+hexChar;
        decimal=decimal/16;
    }
    System.out.println("The hexadecimal is " +hexadecimal);  
         }
}