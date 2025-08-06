//Java Program to Calculate Area and Circumference of Circle

import java.util.Scanner;

public class pq6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius: ");
        double radius = in.nextDouble();
        double areaOFcircle = areaCircle(radius);
        System.out.println("Area of Circle is : " + areaOFcircle);
        double circumferenceofCircle = circumferenceCircle(radius);
        System.out.println("Circumference of Circle is : " + circumferenceofCircle);
        in.close();
    }

    static double areaCircle(double r) {
        double area = Math.PI * r * r;
        return area;
    }

    static double circumferenceCircle(double r) {
        double circumference = 2 * Math.PI * r;
        return circumference;
    }

}
