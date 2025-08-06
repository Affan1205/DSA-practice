//Volume Of Prism

import java.util.Scanner;

public class pq15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double baseheight = in.nextDouble();
        double height = in.nextDouble();
        double Volume = ((base * baseheight) / 2) * height;
        System.out.println("Volume " + Volume);
        in.close();
    }
}
