//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class fpq2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name: ");
        String str = in.nextLine();
        message(str);
        in.close();

    }

    static void message(String mess) {
        System.out.println("Hello " + mess + " Welcome to Rubrik.");
    }
}
