//Calculate Batting Average

import java.util.Scanner;

public class pq35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Total number of run: ");
        int run_scored = input.nextInt();
        System.out.println("Number of times batter dismissed: ");
        int dismissal = input.nextInt();
        double batting_average = run_scored / dismissal;
        System.out.println("Batting average : " + batting_average);
        input.close();
    }
}
