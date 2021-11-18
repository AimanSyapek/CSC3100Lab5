package Lab2;
import static java.lang.System.out;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args)
	{
	
		//Answering question 1
		System.out.print("Ahmad bought a TV for RM1,000.00 with 8% sales tax\n");
		//Calculating cost of TV on top of tax
		double paid = 1000*1.08;
		System.out.println("Total need to be paid for TV: RM" + paid); //Print answer
		
		
		//Answering question 2
		System.out.print("\nBMI Calculator\n");
		Scanner scanner= new Scanner(System.in);
		//declaring variables (not initializing)
		String first_name;
		double weight;
		double height;
		// Read input from user
		System.out.print("Whats your name? ");
		first_name = scanner.nextLine();;
		System.out.print("Enter your weight(kg): ");
		weight = scanner.nextDouble();
		System.out.print("Enter your height(m): ");
		height = scanner.nextDouble();
		double bmi = (weight/(height*height)); //caalculate bmi
		System.out.println(first_name + ", your BMI is " + bmi + "\n"); //Print calculated BMI
		
		
		//Answering question 3
		System.out.print("Assessment mark calculator\n");
		System.out.print("If User did not attend one of exams please put 0 marks obtained\n");
		
		//declaring variables (not initializing)
		int quiz1, quiz2, assignment1, assignment2, finalExam;
		//Scanner scanner= new Scanner(System.in);
		
		//Ask quiz marks and calculate
		System.out.print("Enter mark for Quiz1: ");
		quiz1 = scanner.nextInt();
		System.out.print("Enter mark for Quiz2: ");
		quiz2 = scanner.nextInt();
		double avgQuiz = (quiz1+quiz2)/2; //Calculate avg Quiz mark
		double quizContribution = avgQuiz*0.3; //quiz overall mark contribution
		System.out.print("Your Quiz average is: " + avgQuiz + "\n");
		System.out.print("30% = " + quizContribution + "\n\n");
		
		//Ask Assignment mark and calculate
		System.out.print("Enter mark for Assignment1: ");
		assignment1 = scanner.nextInt();
		System.out.print("Enter mark for Assignment2: ");
		assignment2 = scanner.nextInt();
		double avgAsses = (assignment1+assignment2)/2; //Calculate avg Assignment mark
		double assesContribution = avgAsses*0.3; //assignment overall mark contribution
		System.out.print("Your Assignment average is: " + avgAsses + "\n");
		System.out.print("30% = " + assesContribution + "\n\n");
		
		//Ask final Exam mark and calculate
		System.out.print("Enter mark for Final Exam: ");
		finalExam = scanner.nextInt();
		double finExamContribution = finalExam*0.4; //assignment overall mark contribution
		System.out.print("40% = " + finExamContribution  + "\n" + "\n");
		
		//Final overall mark 
		System.out.print("Your final mark is: " + ( quizContribution + assesContribution + finExamContribution) + "\n");
	}
	
}
