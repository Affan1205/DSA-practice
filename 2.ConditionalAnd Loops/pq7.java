import java.util.Scanner;

public class pq7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area " + area);
        in.close();
    }
}
