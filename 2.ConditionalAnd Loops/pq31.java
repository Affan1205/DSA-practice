//Calculate Distance Between Two Points

import java.util.Scanner;

public class pq31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the points ");
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();
        double x_cordi = Math.abs(x2 - x1) * Math.abs(x2 - x1);
        double y_cordi = Math.abs(y2 - y1) * Math.abs(y2 - y1);
        double add = x_cordi+y_cordi;
        double Distance = Math.sqrt(add);
        System.out.println("Distance " + Distance);
        input.close();
    }
}
