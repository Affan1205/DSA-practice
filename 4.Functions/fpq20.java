//Volume of a Cone

import java.util.Scanner;

public class fpq20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the Height: ");
        double height = input.nextDouble();
        System.out.print("Volume of cone = " + volume(radius, height));
        input.close();

    }

    static double volume(double r, double h) {
        double volCone = (Math.PI * Math.pow(r, 2) * h) / 3;
        return volCone;
    }
}
