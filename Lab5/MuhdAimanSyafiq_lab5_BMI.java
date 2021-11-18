package Lab5;

import java.util.Scanner;

public class MuhdAimanSyafiq_lab5_BMI {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Declaration
    String username;
    char gender;
    char ethnic;
    double bmi;
    double waistSize= 0;
    double height = 0;
    double weight = 0;
    boolean brkloop1 = false;
    boolean brkloop2 = false;
    boolean brkloop3 = false;

    //Input Name
    System.out.print("What is your name? Name: ");
    username = input.nextLine();
    
    //Input gender 
    do{
    System.out.println("Enter your gender (M for Male / F for Female)");
    gender = input.next().charAt(0); 
    gender = Character.toUpperCase(gender); //Set all char input to uppercase
    if ((!(gender == 'M'||gender == 'F')))
        System.out.println("Please enter ONLY M or F");
    } while (!(gender == 'M'||gender == 'F')); 

    //Input Asian
    do{
    System.out.println("Are you Asian?\nEnter \"A\" if your asian \nEnter \"N\" if your not asian ");
    ethnic = input.next().charAt(0); 
    ethnic = Character.toUpperCase(ethnic); //Set all char input to uppercase
    if ((!(ethnic == 'A'||ethnic == 'N')))
        System.out.println("Please enter ONLY A or N");
    } while(!(ethnic == 'A'||ethnic == 'N'));

    //Input meters
    do {
        System.out.print("Please enter your height in METERS: ");
        if (input.hasNextDouble()) {
            height = input.nextDouble();
            brkloop1 = true;
            
            if (height<0.00) {
                System.out.println("Are you perhaps underground? \nNegative numbers is not an acceptable input, sorry...");
                brkloop1 = false;
            } 
            
        }else {
            System.out.println("Please enter a valid positive integer... try again!");
            brkloop1 = false;
            input.next();
        }
    } while (!(brkloop1)); //validation of input

    //Input kilogram
    do {
        System.out.print("Please enter your weight in kg: ");
        if (input.hasNextDouble()) {
            weight = input.nextDouble();
            brkloop2 = true;
            
            if (weight<0.0) {
                System.out.println("Are you defying gravity? or perhaps a blackhole... \nantimatter exist but dont lie about your weight!");
                brkloop2 = false;
            } 
            
        }else {
            System.out.println("Please enter a valid positive integer... try again!");
            brkloop2 = false;
            input.next();
        }
    } while (!(brkloop2)); //validation of input

    //Input Inches for waistline
    do {
        System.out.print("Enter your waist size (in INCHES): ");
        if (input.hasNextDouble()) {
            waistSize = input.nextDouble();
            brkloop3 = true;
            
            if (waistSize<0.0) {
                System.out.println("Are you the perhaps next Playboy front cover model? \ncause their waist is non-existant...");
                brkloop3 = false;
            } 
            
        }else {
            System.out.println("Please enter a valid positive integer... try again!");
            brkloop3 = false;
            input.next();
        }
    } while (!(brkloop3)); //validation of input

    //Calculate BMI
    bmi = weight / (height*height);
    
   //Print
   System.out.println("\n===   Status   ===");
   System.out.println("Name: " + username);
   System.out.println("BMI: " + String.format("%.2f",bmi));
   switch (gender){ 
       case 'M': // Male block
       System.out.println("Gender: Male");
       switch (ethnic){
           case 'A':
           if (waistSize > 40 && bmi >= 28){
               System.out.println("Based on the Asian chart, you are considered obese.");
               System.out.println("WARNING: High risk for Heart Disease and Type 2 Diabetes");
           } else if(waistSize > 30 && bmi >= 23){
               System.out.println("Based on the Asian chart, you are considered overweight.");
               System.out.println("Comment: Everyone has their own lifestyle so its upto you.");
           } else if(bmi <11.50){
               System.out.println("Based on the Asian chart, you are considered underweight.");
               System.out.println("WARNING: High risk for Anemia and Immune deficiency.");
           } else{
               System.out.println("Based on the Asian chart, you are considered normal weight.");
               System.out.println("Comment: Healthy and good to go!");
           }
           if (waistSize>40)
            	   System.out.println("Remarks: Your waistline is " + (waistSize - 40) + " inches beyond the normal limit. \nReduce your belly size if you desire.");
           break;
           case 'N':
           if (waistSize > 40 && bmi >= 30){
               System.out.println("Based on the WHO chart, you are considered obese.");
               System.out.println("WARNING: High risk for Heart Disease and Type 2 Diabetes.");
           } else if(waistSize > 30 && bmi >= 25){
               System.out.println("Based on the WHO chart, you are considered overweight.");
               System.out.println("Comment: Everyone has their own lifestyle so its upto you.");
           } else if(bmi <18.50){
               System.out.println("Based on the WHO chart, you are considered underweight.");
               System.out.println("WARNING: High risk for Anemia and Immune deficiency.");
           } else{
               System.out.println("Based on the WHO chart, you are considered normal weight.");
               System.out.println("Comment: Healthy and good to go!");
           }
           if (waistSize>40)
            	   System.out.println("Remarks: Your waistline is " + (waistSize - 40) + " inches beyond the normal limit. \nReduce your belly size if you desire.");
           break;
       }
       break;
       case 'F': // Female block
       System.out.println("Gender: Female");
           switch (ethnic){
               case 'A':
               if (waistSize > 40 && bmi >= 28){
                   System.out.println("Based on the Asian chart, you are considered obese.");
                   System.out.println("WARNING: High risk for Heart Disease and Type 2 Diabetes.");
               } else if(waistSize > 30 && bmi >= 23){
                   System.out.println("Based on the Asian chart, you are considered overweight.");
                   System.out.println("Comment: Everyone has their own lifestyle so its upto you.");
               } else if(bmi <11.50){
                   System.out.println("Based on the Asian chart, you are considered underweight.");
                   System.out.println("WARNING: High risk for Anemia and Immune deficiency.");
               } else{
                   System.out.println("Based on the Asian chart, you are considered normal weight.");
                   System.out.println("Comment: Healthy and good to go!");
               }
               if (waistSize>40)
            	   System.out.println("Remarks: Your waistline is " + (waistSize - 40) + " inches beyond the normal limit. \nReduce your belly size if you desire.");
               break;
           case 'N':
               if (waistSize > 40 && bmi >= 30){
                   System.out.println("Based on the WHO chart, you are considered obese.");
                   System.out.println("WARNING: High risk for Heart Disease and Type 2 Diabetes.");
               } else if(waistSize > 30 && bmi >= 25){
                   System.out.println("Based on the WHO chart, you are considered overweight.");
                   System.out.println("Comment: Everyone has their own lifestyle so its upto you.");
               } else if(bmi <18.50){
                   System.out.println("Based on the WHO chart, you are considered underweight.");
                   System.out.println("WARNING: High risk for Anemia and Immune deficiency.");
               } else{
                   System.out.println("Based on the WHO chart, you are considered normal weight.");
                   System.out.println("Comment: Healthy and good to go!");
               }
               if (waistSize>40)
            	   System.out.println("Remarks: Your waistline is " + (waistSize - 40) + " inches beyond the normal limit. \nReduce your belly size if you desire.");
               break;
           }
           break;
       }
       input.close();
   }
           
}