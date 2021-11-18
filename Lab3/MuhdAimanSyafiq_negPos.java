package Lab3;
import java.util.Scanner;

public class MuhdAimanSyafiq_negPos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int userInt = input.nextInt();
		if (userInt % 20 == 0) {
			System.out.println("Positive");
		}
		else
			System.out.println("die");
	}
}
