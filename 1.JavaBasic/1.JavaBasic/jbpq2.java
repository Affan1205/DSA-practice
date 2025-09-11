// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class jbpq2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.next();
        System.out.print("We are excited to say " + name + " you have crack Rubrik. ");
        input.close();
    }
}
