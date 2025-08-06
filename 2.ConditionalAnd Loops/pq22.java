import java.util.Scanner;

public class pq22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n = n / 10;

        }
        int sub = product - sum;
        System.out.println(sub);

        in.close();
    }
}
