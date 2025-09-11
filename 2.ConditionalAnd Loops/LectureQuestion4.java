//Reverse of a number

import java.util.Scanner;

public class LectureQuestion4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Reverse of  " + num + " is  : ");
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
        }
        System.out.print(ans);
        input.close();
    }
}
