
//Perimeter of Parallelogram
import java.util.Scanner;

public class fpq16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth: ");
        double base = input.nextDouble();
        System.out.print("Perimeter of parallelogram: " + parallelogram(length, base));
        input.close();
    }

    static double parallelogram(double l, double b) {
        double periParallelogram = 2 * (l + b);
        return periParallelogram;
    }

}
