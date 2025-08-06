//Volume Of Pyramid

import java.util.Scanner;

public class pq18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double baselength = in.nextDouble();
        double basewidth = in.nextDouble();
        double height = in.nextDouble();
        double volume = (baselength * basewidth * height) / 3;
        System.out.println("Volume " + volume);
        in.close();
    }
}
