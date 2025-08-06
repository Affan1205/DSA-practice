//Volume Of Sphere

import java.util.Scanner;

public class pq17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double Volume = (4*Math.PI * radius * radius * radius)/3;
        System.out.println("Volume " + Volume);
        in.close();
    }
}
