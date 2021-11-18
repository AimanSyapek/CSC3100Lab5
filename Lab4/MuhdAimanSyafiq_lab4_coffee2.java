package Lab4;
import java.util.Scanner;

public class MuhdAimanSyafiq_lab4_coffee2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Intializing
		final int multi = 10;
		int numOrd = 0;
		String typebox = null;
		double feePerBox;
		char option = ' ';
		boolean brkLoop;
		boolean brkLoop2 = false;
		
		//Ask order number and type of bag
		
		do {
			System.out.print("Please enter amount of bags to order: ");
			if (input.hasNextInt()) {
				numOrd = input.nextInt();
				brkLoop = true;
				
				if (((numOrd % 0) != 0)|| (numOrd < 0)) {
					System.out.println("Please enter orders in multiple of tens! Try again...");
					brkLoop = false;
					input.next();
				} 
				
			}else {
				System.out.println("Please enter a valid appropriate integer... try again!");
				brkLoop = false;
				input.next();
			}
		} while (!(brkLoop)); //validation of input
		
		//Check Input 
		
		do {
		System.out.print("Select a type of box: \n "
				+			"	a) Large box: can fit 20-bags (RM2.00 per box)\n "
				+ 			"	b) Medium box: can fit 10-bags (RM1.50 per box)\n "
				+			"	c) Small box: can fit 5-bags (RM1.00 per box)\n"
				+ 			"Please enter either a, b or c: ");
		
		if (input.hasNext())
			option = input.next().charAt(0);
		else {
			System.out.println("Please ONLY enter either a, b or c... try again");
			brkLoop2 = false;
			input.next();
		}
		
		
		//check type of box match input
		switch(option) {
		case'a':
			if(numOrd % 20 != 0) {
				System.out.println("");
				brkLoop2 = false;
			} else {
				typebox = "LARGE BOXES";
				System.out.println("You selected" + typebox);
				feePerBox = 2.0;
				brkLoop2 = true;
			}
			break;
			
		case'b': 
			typebox = "MEDIUM BOXES";
			System.out.println("You selected" + typebox);
			feePerBox = 1.5;
			brkLoop2 = true;
			break;
			
		case'c':
			typebox = "SMALL BOXES";
			System.out.println("You selected" + typebox);
			feePerBox = 1.0;
			brkLoop2 = true;
			break;
		}
		} while (!(brkLoop2));
		
		//Calculate order
		
		
		//Print order
		System.out.println("==========================");
		System.out.println("Expect " + numOrd + '-' + typebox + " to be delivered.");
		
		
		
		System.out.print(
				 " __________________________________\r\n"
				+ "|                __                |\r\n"
				+ "|              _/..\\_              |\r\n"
				+ "|            _/......\\_            |\r\n"
				+ "|          _/..........\\_          |\r\n"
				+ "|        _/...Troxion....\\_        |\r\n"
				+ "|      _/.......Coffee.....\\_      |\r\n"
				+ "|    _/......................\\_    |\r\n"
				+ "|  _/........where.............\\_  |\r\n"
				+ "|_/..........coffee..is..........\\_|\r\n"
				+ "| \\_.........not..just.........._/ |\r\n"
				+ "|   \\_.......coffee..........._/   |\r\n"
				+ "|     \\_...................._/     |\r\n"
				+ "|       \\_...but...kopi!.._/       |\r\n"
				+ "|         \\_............_/         |\r\n"
				+ "|           \\_........_/           |\r\n"
				+ "|             \\_...._/             |\r\n"
				+ "|               \\__/               |\r\n"
				+ "|__________________________________|");
	}
}

