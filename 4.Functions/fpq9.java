// Area Of Triangle

import java.util.Scanner;

public class fpq9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of triangle: ");
        double height = input.nextDouble();
        System.out.println("Area of Triangle is " + area(base, height));
        input.close();
    }

    static double area(double b, double h) {
        double areaTriangle = 0.5 * b * h;
        return areaTriangle;
    }

}
