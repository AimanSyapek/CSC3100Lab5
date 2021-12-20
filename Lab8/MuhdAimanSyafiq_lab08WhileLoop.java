package Lab8;

import java.io.File; import java.util.ArrayList; import java.util.List; import java.util.Scanner;

public class MuhdAimanSyafiq_lab08WhileLoop{
    public static void main(String[] args) throws Exception { 
        //////////////////////////////////////////////////////////////////// 
        // READING IN THE DATA FROM A CSV (Comma separated value) FILE 
        String strRecord = "";
        Scanner inputFile = new Scanner(new File("dataset.csv"));
        inputFile.useDelimiter("[\\n,]"); 

        List<String> records = new ArrayList<String>(); // THE ARRAYLIST STORING ALL YOUR RECORDS
        inputFile.nextLine(); // This code allows us to skip the header (ID, Name, etc.)

        // The WHILE loop below gets each row and adds it into records (which is an ArrayList...
        // An array list is just an array of strings that you don't need to know about
        // much. Anything U need to know about it will be described for you. 
        while (inputFile.hasNext()) { 
            // get the next line 
            strRecord = inputFile.next(); 
            records.add(strRecord) ; // each row is added 
        } 
        inputFile.close(); 
        System.out.println("Total elements in the records array list: " + records.size() + ".\n"); 
        
        int offset = 0; 
        String name, state, age; 
        for (int i=1; i <= 24; i++) {
            // Read and display names and show state
            name = records.get(offset+1); 
            state = records.get(offset+2); 
            age = records.get(offset+3); 
            offset = offset + 7; 
            System.out.println(name + " comes from " + state + " and is " + age + "-years old");
        }
        System.out.println(""); 
        System.out.println(""); 

        //Task A
        //Declaration
        offset = 0; //Reset offset
        String pension;
        int mainincome = 0, age2;
        int ageYoung = Integer.parseInt(records.get(offset+3));
        int ageOld = Integer.parseInt(records.get(offset+3));
        String youngest = "";
        String oldest = "";
        String state2;
        List<String> notPayed = new ArrayList<String>();
        List<String> selangorianOverpaid = new ArrayList<String>();
        for (int i=1; i <= 24; i++){ //rea
            name = records.get(offset+1); 
            state2 = records.get(offset+2);
            age2 = Integer.parseInt(records.get(offset+3));
            mainincome = Integer.parseInt(records.get(offset+4));
            pension = records.get(offset+6);
            if (age2>=56 && (pension.startsWith("0"))){
                notPayed.add(name); //append current name to list
            }

            if (mainincome >= 4500 && state2.contains("Selangor")){ //Selangorians that are overpaid
                selangorianOverpaid.add(name); //append current name to list
            }

            if (age2<= ageYoung) { //cycles, compare youngest age and saving name for later
                ageYoung = age2;
                youngest = name; 
            }
            if (age2 >= ageOld) { //cycles, compare oldest age and saving name for later
                ageOld = age2;
                oldest = name;
            }
            offset = offset + 7;
        }
        //Question 1
        System.out.println("The pensioners(56 years old and above) who are not getting paid is the following: ");
        for(int i = 0; i < notPayed.size(); i++){
            System.out.println(notPayed.get(i));
        }
        //Question 2
        System.out.println("\n\nSelangorians whose main income exceeds RM4500");
        for(int i = 0; i < selangorianOverpaid.size(); i++){
            System.out.println(selangorianOverpaid.get(i));
        }
        //Question 3
        System.out.println("\n\nThe yougest person in Putrajaya is " + youngest + " which is " + ageYoung + " years old.");
        System.out.println("The oldest person in Putrajaya is " + oldest+ " which is " + ageOld + " years old.");

        //Task B
        //Question 1
        offset = 0; //Reset offset
        int summation = 0;
        int numPeople = 0;
        for (int i=1; i <= 24; i++){
            numPeople++;
            mainincome = Integer.parseInt(records.get(offset+4));
            summation += mainincome;
            if (summation >= 200000){
                break;
            }
            offset += 7;
        }
        System.out.println("\n\nIt takes " + numPeople + " to read before their combine sum of their income reaches more than RM200 000,\nor more accurately their sum will be RM" + summation + ". \n\n");

        //Question 2
        offset = 0; //Reset offset
        numPeople = 0;
        String nameStartsN = ""; 
        for (int i=1; i <= 24; i++){
            numPeople++;
            name = records.get(offset+1);
            if (name.charAt(0) == 'N'){
                nameStartsN = name;
                break;
            }
            offset += 7;
        }
        System.out.println("It takes " + numPeople + " before finding someone whose name begins with the letter N who is " + nameStartsN + "\n\n");
    }
}