package Lab7;
import java.util.Scanner;

public class MuhdAimanSyafiq_lab07_Munep2 {
    public static void main(String[] args) {
        //Declarator and Scanner object creation
       String string1;
       String string2;
       Scanner input = new Scanner(System.in);

       // Asks for the first string
       System.out.print("Enter the first string: ");
       string1 = input.nextLine();
       // Checks whether string1 length is over 8 char
       if (string1.length() > 8 ){
           System.out.print("Valid Password!! \nFirst string: \"");
           System.out.println(string1+ "\" with length " + string1.length()); // Prints 5th to 10th characters of string1
       }
       else
           System.out.println("Invalid password...");
        
        // Ask for the second string
       System.out.print("Enter the second String: ");
       string2 = input.nextLine();
       if (string1.contains(string2)){ // Checks for string2 presence in string1
           System.out.println("Second string exists in the first string");
           
       }
       else {
           System.out.println("Second string doesn't exist in the first string.\nConcatting...");
           string1 = string1.concat(string2);
           System.out.println("Updated First string: " + string1);

       }
    }
}