// Perimeter Of Rectangle

import java.util.Scanner;

public class pq11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double breadth = in.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter " + perimeter);

        in.close();
    }
}
