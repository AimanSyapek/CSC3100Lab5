package Test;
import java.util.Scanner;

public class testConversion {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		boolean isNumber;
		
		System.out.println("Enter a whole number"); //ask int
		
		do {
			if (input.hasNextInt()) {
				number = input.nextInt();
				isNumber = true;
			} else {
				System.out.println("Enter a whole number");
				isNumber = false;
				input.next();
			}
			
		} while (!(isNumber)); //validate input
		
		System.out.println(number); //print
		
	}
}
