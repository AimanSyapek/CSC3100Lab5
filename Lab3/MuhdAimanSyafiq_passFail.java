package Lab3;
import java.util.Scanner;

public class MuhdAimanSyafiq_passFail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your test marks: ");
		int testMark = input.nextInt();
		if (testMark > 40)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
