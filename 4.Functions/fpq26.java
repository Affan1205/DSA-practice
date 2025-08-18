//Total Surface Area of a Cube

import java.util.Scanner;

public class fpq26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of cube = ");
        double side = in.nextDouble();
        System.out.println("Total Surface Area of a Cube = " + cube(side));
        in.close();
    }

    static double cube(double s) {
        double ans = 6 * Math.pow(s, 2);
        return ans;
    }

}
