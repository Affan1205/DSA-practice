//Calculate Electricity Bill

import java.util.Scanner;

public class pq28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unit = input.nextInt();
        double amount = 7 * unit;
        System.out.println("Electricity bill : " + amount);
        input.close();
    }
}
