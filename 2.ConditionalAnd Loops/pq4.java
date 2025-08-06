//Area Of Isosceles Triangle

import java.util.Scanner;

public class pq4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        double area = (base * height) / 2;
        System.out.println("Area " + area);
        input.close();
    }
}
