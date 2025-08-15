//Area Of Parallelogram

import java.util.Scanner;

public class fpq12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        double height = input.nextDouble();
        System.out.print("Enter the base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Area of Rectangle is " + area(height, base));
        input.close();
    }

    static double area(double h, double b) {
        double areaRectangle = h * b;
        return areaRectangle;
    }
}
