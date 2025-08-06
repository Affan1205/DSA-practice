import java.util.Scanner;

public class conditionalstatements {
    public static void main(String[] args) {
        // 1.if statement - Executes a block if the condition is true.
        // if (condition) {
        // // code to execute if condition is true
        // }
        //Example- Suppose you want to check if someone is old enough to vote:
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >=18) {
            System.out.println("You are eligible to vote:) ");
        }
        input.close();

    }
}
