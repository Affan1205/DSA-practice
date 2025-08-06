//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Practiceques5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("The Inr amount ");
        double rupees = input.nextInt();
        double doller = (rupees / 85);
        System.out.print(" is " + doller + " us dollers.");

        input.close();
    }
}
