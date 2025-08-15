// Area Of Equilateral Triangle

import java.util.Scanner;

public class fpq14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        double side = sc.nextDouble();
        System.out.print("Area of equi triangle = " + area(side));
        sc.close();
    }

    static double area(double side) {
        double areaEquilateral = (Math.sqrt(3) * Math.pow(side, 2)) / 4;
        return areaEquilateral;
    }
}
