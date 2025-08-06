//Perimeter Of Rhombus

import java.util.Scanner;

public class pq13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double perimeter = 4 * side;
        System.out.println("perimeter " + perimeter);
        in.close();
    }
}
