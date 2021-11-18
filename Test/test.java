package Test;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cretae a scanner obj
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please insert value A:");
		int A = input.nextInt();
		
		System.out.println("Please insert value B:");
		int B = input.nextInt();
		
		int total= A + B;
		
		
		System.out.println("Total is " + total);
		
		
		System.out.println("Please enter name: ");
		//input.nextLine();
		String name=input.nextLine();
		 
		System.out.println("Please enter weight in kg: ");
		double weight=input.nextDouble();
		 
		System.out.println("Please enter height in meter: ");
		double height=input.nextDouble();
		 
		double bmi;
		bmi= weight/(height*height);
		 
		System.out.print("The BMI for "+ name + " is " + "BMI "+ bmi);
	}
}
