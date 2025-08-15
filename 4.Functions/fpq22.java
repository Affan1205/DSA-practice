//Volume Of Cylinder

import java.util.Scanner;

public class fpq22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the Height: ");
        double height = input.nextDouble();
        System.out.print("Volume of cylinder = " + volume(radius, height));
        input.close();
    }

    static double volume(double r, double h) {
        double volCylinder = Math.PI * Math.pow(r, 2) * h;
        return volCylinder;
    }
}
