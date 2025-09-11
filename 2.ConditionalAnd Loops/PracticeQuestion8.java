//Calculate Discount Of Product

import java.util.Scanner;

public class PracticeQuestion8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Product price before discount: ");
        float beforeDiscount = input.nextFloat();
        System.out.println("Exclusive Discount on Diwali sale is : ");
        float discount = input.nextFloat();
        float discountPrice = (discount * beforeDiscount) / 100;
        float amount = beforeDiscount - discountPrice;
        System.out.println("Product price after discount: " + amount);
input.close();
    }
}
