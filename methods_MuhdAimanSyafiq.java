import java.util.*;
import javax.swing.JOptionPane;

public class methods_MuhdAimanSyafiq {
    //All these variables are freely able to be use by all methods including main[] (global variable)
    static String pc = JOptionPane.showInputDialog(null, "Please enter your postcode to check whether \nyour suburb qualifies for super shipping discount:)", "DELIVERY CHARGE", JOptionPane.QUESTION_MESSAGE);
    static Scanner input = new Scanner(System.in);
    final static double TshirtPrice = 10.00;
    final static double TrouserPrice = 20.00;
    static double discount = 0.05;
    static double normalShipping = 19.55;
    static double actualShipping;
    static int postcode = Integer.parseInt(pc);
    static int numOfShirts = 0;
    static int numOfTrousers = 0;

    public static void main(String[] args) {
        //thes variables can only be used in main[]
        String msg;
        String repeatingMsg = "Congratulations!\nYou qualify for the super special shipping fee discount of ";
        
        switch (postcode) {
            case 43650:
                    msg = "You are from Bangi! " + repeatingMsg;
                    setShippingPrice(10.00);
                    setDiscount(0.7500);
                    actualShipping = normalShipping*(1-discount);
                    break;
            case 43000:
                    msg = "You are from Kajang! " + repeatingMsg;
                    setShippingPrice(15.00);
                    setDiscount(0.8500);
                    actualShipping = normalShipping*(1-discount);
                    break;
            case 43400:
                    msg = "You are from Serdang! " + repeatingMsg;
                    setShippingPrice(25.00);
                    setDiscount(1);
                    actualShipping = normalShipping*(1-discount);
                    break;
            default:
                    msg = "Your suburb does not qualify for any shipping fee discount.\nWe however still offer a shipping discount of";
                    actualShipping = normalShipping*(1-discount);
                    break;
        }

        displayDiscount(msg,discount);
        System.out.printf("Your final shipping fee is RM%.2f. %n(Normal shipping fee is RM%.2f).%n%n", actualShipping, normalShipping);
        System.out.println("============= ENTER ORDER =============");
        int done = 0;
        while (done==0) {
            setQuantity(); //Ask for quantity for Shirts and Trousers
            if ((numOfShirts <= 4) && (numOfShirts >= 0) && (numOfTrousers <= 4) && (numOfTrousers >= 0)) {
                done = 1;
                dispFinalPrice(calcTotal(calcProductPrice(numOfShirts,TshirtPrice,numOfTrousers,TrouserPrice),actualShipping)); //Calculate and print total pprice for user
            }
            else
                System.out.println("At most 4... and of course, plz enter a positive number...");
        }

    }
    //setDiscount()
    public static void setDiscount(double valueDiscount){
        discount = valueDiscount;
    }
    //displayDiscount()
    public static void displayDiscount(String msg, double discount){
        System.out.printf("%s %.2f%%.%n", msg, discount*100);
    }

    //setShippingPrice()
    public static void setShippingPrice(double shippingPrice){
        normalShipping = shippingPrice;
    }

    //setQuantity() - ask quantity and set quantity for num shirts and trouser
    public static void setQuantity(){
        System.out.println("Number of t-shirts to purchase? You can only buy up to 4 t-shirts: ");
        numOfShirts = input.nextInt();
        System.out.println("Number of trousers to purchase? Again, max. 4 items: ");
        numOfTrousers = input.nextInt();
    }
    //calcProductPrice() - calculate product price only
    public static double calcProductPrice(double numOfA, double aPrice, double numOfB,double bPrice){
        return (numOfA * aPrice + numOfB * bPrice);
    }

    //calcTotal() - calculate product price plus shipping price
    public static double calcTotal(double productPrice, double actualShipping){
        return (productPrice+ actualShipping);
    }

    //dispFinalPrice() - print total price
    public static void dispFinalPrice(double totalPrice){
        System.out.println("You have ordered " + numOfShirts + " t-shirts and " + numOfTrousers + " trousers.");
        System.out.println("Thanks for your oder. Total price including shipping:");
        System.out.printf("RM%.2f. Please come again!!!", totalPrice);
}
}
