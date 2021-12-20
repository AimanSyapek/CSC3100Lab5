package Lab7;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class MuhdAimanSyafiq_lab07StringFormaating {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\lgdata.csv"));
    double temp = 0.0;
    scanner.useDelimiter(",|\\r\\n");
    double[][] input = new double[100][5];
    double[] maxs = {0,0,0,0,0};
    double[] mins = {0,0,0,0,0};

    int i=0,j=0;
    while(scanner.hasNext()){
        temp = Double.parseDouble(scanner.next());
        input[i][j] = temp;
        j++;
        if (j==4 && i<=99){
        temp = Double.parseDouble(scanner.next());
        input[i][j] = temp;
        j = 0;
        i++;
        }
        }
    scanner.close();

    double currMax = 0;
    double currMin = 0;
    //For all columns, identify the max
    for (int col=0; col<=4; col++){
        currMax = 0.0;
        currMin = 10000.0; //some crazy big number
        //for each row
        for (int row=0; row<=99; row++){
            if (input[row][col]>=currMax){
            currMax = input[row][col];
            }
            if (input[row][col]<=currMin){
            currMin = input[row][col];
            }

        maxs[col] = currMax;
        mins[col] = currMin;
        }
    }
    // Let's calculate the normalized values, now :)
    double[][] normalized = input;

    for (int col=0; col<=4; col++){
    //for each row
        for (int row=0; row<=99; row++){
        normalized[row][col] = (normalized[row][col] - mins[col]) / (maxs[col] - mins[col]);
        }
    }
    //print
    for(int k=0;k<100;k++){
        if (k==0) {
            System.out.println(" | Value 1 | Value 2 | Value 3 | Value 4 | Value 5 | \n====================================================");
        }
    
        for(int l=0;l<5;l++){
            System.out.print(" | " + String.format("%.5f",normalized[k][l]));
        }
        System.out.println(" |\n");
        } 
    }
}
