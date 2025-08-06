//Counting occurance

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Which number occurance required: ");
        int occurance_number = input.nextInt();
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == occurance_number) {
                count++;
            }
            num = num / 10;
        }
        System.out.print("Occurance of " + occurance_number + " is --> " + count);
        input.close();
    }
}
