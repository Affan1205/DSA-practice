//Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class pq9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double perimeter = 3 * side ;
        System.out.println("perimeter " + perimeter);
        in.close();
    }
}
