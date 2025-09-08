//Input currency in rupees and output in USD.

import java.util.Scanner;

public class jbpq6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double rupees = input.nextDouble();
        double doller = rupees / 87;
        System.out.print(rupees + " rupees is equal to " + doller + " in doller.");
        input.close();
    }
}
