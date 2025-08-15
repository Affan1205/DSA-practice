// Perimeter Of Square

import java.util.Scanner;

public class fpq18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.print("Perimeter of Square: " + perimeter(side));
        input.close();
    }

    static double perimeter(double s) {
        double perimeterSquare = 4 * s;
        return perimeterSquare;
    }
}
