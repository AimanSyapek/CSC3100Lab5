package Lab7;
import java.util.Scanner;

public class MuhdAimanSyafiq_lab07_Munep1 {
    public static void main(String[] args) {
       //Declarator and Scanner object creation
       String string1;
       String string2;
       Scanner input = new Scanner(System.in);

       // Asks for the first string
       System.out.print("Enter the first string: ");
       string1 = input.nextLine();
       System.out.println("String length is: "+string1.length());
       // Checks whether string1 length is over 10 char
       if (string1.length() > 10){
           System.out.print("Substring from character 5 to 10 of First string: ");
           System.out.println(string1.substring(4, 10)); // Prints 5th to 10th characters of string1
       }
       else
           System.out.println("String length is less than 10 character.");

       // Ask for the second string
       System.out.println("Enter the second String");
       string2 = input.nextLine();
       if (string1.contains(string2)){ // Checks for string2 presence in string1
           System.out.println("Second string exists in the first string\nReplacing...");
           string1 = string1.replace(string2, "Selamat Datang"); // Search for character sequence matching string2 and replaces it with Selamat Datang
           System.out.println("Updated First string: " + string1);
       }
       else 
           System.out.println("Second string doesn't exist in the first string.");
       
   }
}