//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Practiceques2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println(name + " you are selected at Rubrik.");
        input.close();

    }
}
