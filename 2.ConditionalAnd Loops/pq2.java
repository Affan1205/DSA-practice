// Area Of Triangle

import java.util.Scanner;

public class pq2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double breadth = input.nextDouble();

        double area = (0.5) * breadth * length;
        System.out.println("Area "+ area);
        input.close();
    }
}
