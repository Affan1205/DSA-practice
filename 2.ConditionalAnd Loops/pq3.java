//Area Of Rectangle Program

import java.util.Scanner;

public class pq3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double bredth = in.nextDouble();
        double area = length * bredth;
        System.out.println("Area " + area);

        in.close();
    }
}
