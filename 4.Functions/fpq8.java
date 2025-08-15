// Area Of Circle Java Program

import java.util.Scanner;

public class fpq8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = input.nextDouble();
        System.out.print("Area of circle is: " + area(radius));
        input.close();
    }

    static double area(double r) {
        double areaCircle = Math.PI * Math.pow(r, 2);
        return areaCircle;
    }
}
