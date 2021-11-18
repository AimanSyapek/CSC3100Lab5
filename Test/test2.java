package Test;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		char option = 'd';
		System.out.println("Enter an alphabet");
		
		//initiate
		if (input.hasNext())
			option = input.next().charAt(0);
		
		System.out.println(option);

	}
}
