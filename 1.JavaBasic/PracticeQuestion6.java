//Input currency in rupees and output in USD.

import java.util.Scanner;

public class PracticeQuestion6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input amount in ruppes ₹ ");
        double amount = input.nextDouble();
        double dollar = amount / 87;
        System.out.println("₹" + amount + " is equals to $" + dollar);
        input.close();
    }
}
