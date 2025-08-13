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

// //To calculate Fibonacci Series up to n numbers.
// public class fpq6 {
// public static void main(String[] args) {
// int a = 0;
// int b = 1;
// System.out.print(a + " " + b + " ");
// int n = 10;
// for (int i = 2; i < n; i++) {
// int sum = a + b;
// System.out.print(sum + " ");
// a = b;
// b = sum;
// }
// }
// }