//Perimeter Of Rectangle

import java.util.Scanner;

public class fpq15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = input.nextDouble();
        System.out.print("Perimeter of circle is: " + perimeter(radius));
        input.close();
    }

    static double perimeter(double r) {
        double perimeterCircle = 2 * Math.PI * r;
        return perimeterCircle;
    }
}
