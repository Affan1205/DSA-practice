//Volume of sphere

import java.util.Scanner;

public class fpq23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        double volume = sphere(radius);
        System.out.print("volume of sphere : " + volume);
        input.close();
    }

    static double sphere(double radius) {
        double ans = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        return ans;

    }
}
