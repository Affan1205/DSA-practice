//Curved Surface Area of a Cylinder

import java.util.Scanner;

public class fpq25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius = ");
        double radius = in.nextDouble();
        System.out.print("Enter the height = ");
        double height = in.nextDouble();
        double cSa = area(radius, height);
        System.out.print("Curved surface area of cylinder = " + cSa);
        in.close();
    }

    static double area(double r, double h) {
        double ans = 2 * Math.PI * r * h;
        return ans;
    }
}
