//Volume of Cylinder

import java.util.Scanner;

public class pq16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double Volume = (Math.PI * radius * radius * height);
        System.out.println("Volume " + Volume);
        in.close();
    }
}
