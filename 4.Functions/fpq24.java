//volume of pyramid

import java.util.Scanner;

public class fpq24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double perpendicularHeight = in.nextDouble();
        double volume = pyramid(base, perpendicularHeight);
        System.out.print("volume of pyramid= " + volume);
        in.close();
    }

    static double pyramid(double b, double pH) {
        double ans = (b * pH) / 3;
        return ans;
    }
}
