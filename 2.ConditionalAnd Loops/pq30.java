
//Calculate Discount Of Product
import java.util.Scanner;

public class pq30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Original Price of product: ");
        int original_price = input.nextInt();
        System.out.print("Discount on that product: ");
        int discount = input.nextInt();
        double discounted_price = (discount * original_price) / 100;
        double selling_price = original_price - discounted_price;
        System.out.println("amount after discount " + selling_price);

        input.close();
    }
}
