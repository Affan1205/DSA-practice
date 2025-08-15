
// Perimeter Of rohmbus
import java.util.Scanner;

public class fpq19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.print("Perimeter of Rohmbus: " + perimeter(side));
        input.close();
    }

    static double perimeter(double s) {
        double perimeterRohmbus = 4 * s;
        return perimeterRohmbus;
    }
}
