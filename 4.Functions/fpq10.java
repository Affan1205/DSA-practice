// Area Of Rectangle Program

import java.util.Scanner;

public class fpq10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of triangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth of triangle: ");
        double breadth = input.nextDouble();
        System.out.print("Area of Rectangle is " + area(length, breadth));
        input.close();
    }

    static double area(double l, double b) {
        double areaRectangle = l * b;
        return areaRectangle;
    }
}
