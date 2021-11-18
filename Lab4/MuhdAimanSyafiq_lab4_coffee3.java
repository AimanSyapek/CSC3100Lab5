package Lab4;
import java.util.Scanner;

public class MuhdAimanSyafiq_lab4_coffee3 {
	public static void main(String[] args) {
		//Ask user for how many coffee order
		Scanner input = new Scanner(System.in);
		int numBag = 0;
		boolean brkLoop;
		do {
			System.out.print("Please enter amount of bags to order: ");
			if (input.hasNextInt()) {
				numBag = input.nextInt();
				brkLoop = true;
				
				if (((numBag % 10) != 0) || (numBag < 0)) {
					System.out.println("Please enter orders in postive integer multiple of tens! Try again...");
					brkLoop = false;
				} 
				
			}else {
				System.out.println("Please enter a valid appropriate integer... try again!");
				brkLoop = false;
				input.next();
			}
		} while (!(brkLoop)); //validation of input
		
		//Select type of box
		System.out.println("Press 1 to select Large box \n"
						+ "Press 2 to select Medium box \n"
						+ "Press 3 to select Small box \n");
		int typeofBox = input.nextInt();
		double boxprice = 0;
		int numberofBox = 0;
		String typeBox = null;
		
		if (typeofBox == 1) {
			numberofBox = numBag / 20;
			boxprice = 2.00;
			typeBox = "LARGE";
			
			//If there's is remainder coffee bag that can't fit, add the coffee to another box, so +1 to numberofBox
			if ((numBag % 20)!=0)
				++numberofBox;
		}
		
		if (typeofBox == 2) {
			numberofBox = numBag / 10;
			boxprice = 1.50;
			typeBox = "MEDIUM";
		}
		
		if (typeofBox == 3) {
			numberofBox = numBag / 5;
			boxprice = 1.00;
			typeBox = "SMALL";
		}
			
		//Calculate price of coffee brought
		double totalCofPrice = numBag * 10;
		
		//Calculate Total number of box used price
		double totalBoxPrice = boxprice * numberofBox;
		
		//Calculate total needed to be paid
		double totalOverall = totalCofPrice + totalBoxPrice;
		
		
		//Print Invoice
		System.out.println("***********************************************************"+ "\n");
		System.out.println("Expect " + numberofBox + '-' + typeBox + " BOXES with "
							+ numBag +" Coffee bags to be delived!");
		System.out.println("COFFEE (RM10 X " + numBag + "-bags): RM"+ totalCofPrice);
		System.out.println(typeBox + " BOXES (RM" + boxprice + " X " + numberofBox + "-bags): RM" + totalBoxPrice + "\n");
		System.out.println("TOTAL (TO BE PAID VIA PAYPAL): RM"+ totalOverall + "\n");
		System.out.println("***********************************************************");
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
