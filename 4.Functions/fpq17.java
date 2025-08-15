//Perimeter of Rectangle

import java.util.Scanner;

public class fpq17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = input.nextDouble();
        System.out.print("Perimeter of Rectangle: " + perimeter(length, breadth));
        input.close();
    }

    static double perimeter(double l, double b) {
        double perimeterRectangle = 2 * (l + b);
        return perimeterRectangle;
    }

}
