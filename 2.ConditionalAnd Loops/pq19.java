
//Total Surface area of cylinder
import java.util.Scanner;

public class pq19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double tsa = (2 * 3.14 * radius)*(radius + height);
        System.out.println("tsa " + tsa);
        in.close();
    }
}
