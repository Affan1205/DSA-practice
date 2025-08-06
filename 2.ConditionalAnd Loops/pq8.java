//Perimeter Of Circle

import java.util.Scanner;

public class pq8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double area = 2 * Math.PI * radius;
        System.out.println("Area = " + area);

        in.close();
    }
}
