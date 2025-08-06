//Perimeter Of Parallelogram

import java.util.Scanner;

public class pq10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double base = in.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("Perimeter " + perimeter);

        in.close();
    }
}
