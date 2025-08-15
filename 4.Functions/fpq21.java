// Volume Of Prism

import java.util.Scanner;

public class fpq21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base , length , height respectively: ");
        double base = input.nextDouble();
        double length = input.nextDouble();
        double height = input.nextDouble();
        System.out.print("Volume of prism : " + volume(base, length, height));
        input.close();
    }

    static double volume(double b, double l, double h) {
        double volPrism = (b * l * h) / 2;
        return volPrism;
    }
}
