//Input currency in rupees and output in USD

import java.util.Scanner;

public class fpq6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        double indRupee = input.nextDouble();

        double amount = currencyConverter(indRupee);
        System.out.print(amount);
        input.close();
    }

    static double currencyConverter(double rupees) {
        Scanner in = new Scanner(System.in);
        in.close();
        double calculate;
        System.out.print("Which country currency you want: ");
        String str = in.next();
        if (str == "doller" || str == "Doller") {
            calculate = rupees / 85;
            return calculate;

        } else if (str == "euro" || str == "Euro") {
            calculate = rupees / 102;
            return calculate;
        } else {
            return 0;
        }

    }
}
