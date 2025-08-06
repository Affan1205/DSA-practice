// Total Surface Area Of Cube

import java.util.Scanner;

public class pq20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double tsa = 6 * side*side;
        System.out.println("tsa " + tsa);
        in.close();
    }
}
