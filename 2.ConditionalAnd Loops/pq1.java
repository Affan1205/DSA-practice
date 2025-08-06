//Area Of Circle Java Program

import java.util.Scanner;

public class pq1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
        input.close();
    }
}
