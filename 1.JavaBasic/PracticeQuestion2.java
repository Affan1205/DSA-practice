// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class PracticeQuestion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name = ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " in Rubrik.");

        input.close();
    }
    
}
