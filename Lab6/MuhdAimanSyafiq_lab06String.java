package Lab6;
import java.util.Scanner;
import java.lang.Math;

public class MuhdAimanSyafiq_lab06String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Print and read input
        System.out.println("===========================\n=== Welcome to Autofill ===\n===========================\n");
        System.out.print("Please enter your name: ");
        String username = input.nextLine();
        System.out.print("Please enter your myKad number: ");
        String numIC = input.nextLine();
        input.close();

        //validation
        boolean alphaTest = isNumeric(numIC); //Test if its number using function at the end
        if (!alphaTest || numIC.length() < 12 ){ //Test if it reaches 12 char long
            System.out.println("Invalid/Insufficient input");
            System.exit(0); //exits program
        }

        //Processing
        int day = Integer.parseInt(numIC.substring(4,6));
        int month = Integer.parseInt(numIC.substring(2,4));
        int year = Integer.parseInt(numIC.substring(0,2));
        if (year <= 22)
            year += 2000;
        else
            year += 1900;
        int numGender = Integer.parseInt(numIC.substring(11,12));
        int negeri = Integer.parseInt(numIC.substring(6,8));

        //Printing~
        //Name
        System.out.println("\nFull name: "+ username);

        //Mykad
        System.out.println("MyKad: " + numIC);

        //Gender
        System.out.print("Gender: ");
        if ( numGender % 2 == 0 )
        System.out.println("Female");
        else
        System.out.println("Male");

        //Age
        System.out.println("Age: "+ (2021-year));

        //D.o.B
        System.out.print("D.o.B: ");
        System.out.print(day);
        if (numIC.charAt(5) == '1')
        System.out.print("st");
        else if (numIC.charAt(5) == '2')
        System.out.print("nd");
        else if (numIC.charAt(5) == '3')
        System.out.print("rd");
        else
        System.out.print("th");

        switch (month){
            case 1: System.out.print(" January ");
            break;
            case 2: System.out.print(" February ");
            break;
            case 3: System.out.print(" March ");
            break;
            case 4: System.out.print(" April ");
            break;
            case 5: System.out.print(" May ");
            break;
            case 6: System.out.print(" June ");
            break;
            case 7: System.out.print(" July ");
            break;
            case 8: System.out.print(" August ");
            break;
            case 9: System.out.print(" September ");
            break;
            case 10: System.out.print(" October ");
            break;
            case 11: System.out.print(" November ");
            break;
            case 12: System.out.print(" December ");
            break;
        }
        System.out.println(year);

        //State born in
        System.out.print("State of birth : ");
        switch (negeri){
            case 1:
            case 21:
            case 22:
            case 23:
            case 24: 
            System.out.println("Johor");
            break;
            case 2:
            case 25:
            case 26:
            case 27: 
            System.out.println("Kedah");
            break;
            case 3:
            case 28:
            case 29: 
            System.out.println("Kelantan");
            break;
            case 4:
            case 30: 
            System.out.println("Melaka");
            break;
            case 5:
            case 31:
            case 59: 
            System.out.println("Negeri Sembilan");
            break;
            case 6:
            case 32:
            case 33: 
            System.out.println("Pahang");
            break;
            case 7:
            case 34:
            case 35: 
            System.out.println("Pulau Pinang");
            break;
            case 8:
            case 36:
            case 37:
            case 38:
            case 39: 
            System.out.println("Perak");
            break;
            case 9:
            case 40: 
            System.out.println("Perlis");
            break;
            case 10:
            case 41:
            case 42:
            case 43:
            case 44: 
            System.out.println("Selangor");
            break;
            case 11:
            case 45:
            case 46: 
            System.out.println("Terengganu");
            break;
            case 12:
            case 47:
            case 48: 
            case 49:
            System.out.println("Sabah");
            break;
            case 13:
            case 50:
            case 51: 
            case 52:
            case 53:
            System.out.println("Sarawak");
            break;
            case 14:
            case 54:
            case 55: 
            case 56:
            case 57:
            System.out.println("Kuala Lumpur");
            break;
            case 15:
            case 58:
            System.out.println("Labuan");
            break;
            case 16:
            System.out.println("Putrajaya");
            break;
            default:
            System.out.println("Unknown");
            break;
        }
            
        System.out.println("\nThank you for using this program! \nSee you next time!");

    }

    //A function to validate myKad input 
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
