//Area of Rhombus

import java.util.Scanner;

public class fpq13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Diagonal  of triangle: ");
        double diagonal1 = input.nextDouble();
        System.out.print("Enter the Second Diagonal of triangle: ");
        double diagonal2 = input.nextDouble();
        System.out.println("Area of Triangle is " + area(diagonal1, diagonal2));
        input.close();
    }

    static double area(double d1, double d2) {
        double areaTriangle = 0.5 * d1 * d2;
        return areaTriangle;
    }

}
