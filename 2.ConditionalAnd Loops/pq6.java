//Area Of Rhombus

import java.util.Scanner;

public class pq6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diagona1 = input.nextDouble();
        double diagonal2 = input.nextDouble();

        double area = (diagona1 * diagonal2);
        System.out.println("Area " + area);
        input.close();
    }
}
