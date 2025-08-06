//Calculate Commission Percentage
import java.util.Scanner;

public class pq32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Original Price of House: ");
        double original_price = input.nextDouble();
        System.out.print("Commision percentage of dealers: ");
        double commision = input.nextDouble();
        double dealer_charge = (commision * original_price) / 100;
        System.out.println("Dealer charges " + dealer_charge);
        double buying_price = original_price + dealer_charge;
        System.out.println("Total amount  " + buying_price);

        input.close();
    }
}
