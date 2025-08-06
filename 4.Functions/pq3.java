//A person is eligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class pq3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int age = in.nextInt();
        isEligible(age);
        in.close();
    }

    static void isEligible(int a) {
        if (a >= 18) {
            System.out.println("Yes! Eligible to vote.");

        } else {
            System.out.println("Not Eligible to vote.");
        }
    }
}
