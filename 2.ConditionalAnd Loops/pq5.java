//Area of Parallelogram

import java.util.Scanner;

public class pq5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        double area = (base * height);
        System.out.println("Area " + area);
        input.close();
    }
}
