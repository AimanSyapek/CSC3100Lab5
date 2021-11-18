package Test;
import java.io.IOException;
import java.util.Scanner;

public class TestJava {
public static void main(String[] args) {
    String s = "happy birthday";
    String reqStrg = " ";
    
    String[] arr=s.split(" ");

    for(int i=0; i<arr.length; i++){
        char c =arr[i].charAt(0);
        //1st way
        String c1=String.valueOf(c).toUpperCase();
        String sub=arr[i].substring(1);
        reqStrg += c1+sub+" ";
        
    }
    System.out.print(reqStrg.trim());

    //TODO: Convert int to string
}
}
