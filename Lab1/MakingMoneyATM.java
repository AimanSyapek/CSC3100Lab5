package Lab1;
import java.time.*; // Imports LocalDateTime class
import java.time.format.DateTimeFormatter; // Imports date formatter class

public class MakingMoneyATM
{
	public static void main(String[] args)
	{
		// Printing the display
		System.out.println("\n     ++++++++++++++++++++++++++++     ");
		System.out.println("    /                            \\    ");
		System.out.println("   /    $  $  $  $  $  $  $  $    \\   ");
		System.out.println("  /                                \\  ");
		System.out.println(" |   Making Money Bank ATM Service  | ");
		System.out.println(" |__________________________________| ");
		System.out.println("\n	        Welcome!             \n");
		System.out.println("//////////////////////////////////////\n");
		System.out.println("     Insert your card to proceed.");

		//Printing time for user
		LocalDateTime dateObj = LocalDateTime.now(); // Retrieve date and time
		DateTimeFormatter dateFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy"); // Converts the time format
		String dateFormatted = dateObj.format(dateFormatObj); // Formatted string
		System.out.printf("   Current time: "+ dateFormatted);
		System.out.println("\n\n//////////////////////////////////////\n");

	}
}

                              
                                    
                                    