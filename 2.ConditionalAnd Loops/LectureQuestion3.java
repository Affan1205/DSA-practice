//COUNTING OCCURANCE

import java.util.Scanner;

public class LectureQuestion3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("for which digit you want to count occurance ");
        int n = input.nextInt();
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.print("the occurance of " + n + " is " + count);
        input.close();
    }
}
