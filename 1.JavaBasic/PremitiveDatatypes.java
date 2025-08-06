import java.util.Scanner;

public class PremitiveDatatypes {
    public static void main(String[] args) {

        // Declaring INTEGER datatype
        // int roll_no = 34;
        // System.out.println(roll_no);

        // --->INTEGER INPUT PROGRAM
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your Rollno : ");
        // int roll_no = input.nextInt();
        // System.out.println("My Rollno is :" + roll_no);

        // Declaring STRING(NOT PRIMITIVE) datatype
        // String name = "ajhfju;;kl";
        // System.out.println(name);

        // --->STRING INPUT PROGRAM
        // Scanner input = new Scanner(System.in);
        // System.out.println("What are your Goals: ");
        // String goals = input.nextLine();
        // System.out.println("My Goals are " + goals);

        // Declaring CHARACTER datatype
        // char grade = 's';
        // System.out.println(grade);

        // char full_name[] = { 'A', 'f', 'f', 'a', 'n' };
        // System.out.println(full_name);

        // --->CHARACTER INPUT PROGRAM
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your company you work at :");
        // char name = input.next().charAt(0);
        // System.out.println("Great you are at top Software Company : " + name);

        // Declaring BOOLEAN datatype
        // boolean is_fun = false;
        // System.out.println(is_fun);

        // --->Boolean INPUT PROGRAM
        // Scanner input = new Scanner(System.in);
        // System.out.print("If you work on yourself you can achieve anything: ");
        // boolean ans = input.nextBoolean();
        // System.out.println("Answer is " + ans);

        // Declaring FLOAT datatype
        // float percentage = 98.4f;
        // System.out.println(percentage);

        // --->FLOAT INPUT PROGRAM
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your percentage : ");
        // float percentage = input.nextFloat();
        // System.out.println("My percentage is : " + percentage);

        // Declaring DOUBLE datatype
        // double percentage = 98724.451371;
        // System.out.println(percentage);

        // --->Double INPUT PROGRAM
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your percentage : ");
        // double percentage = input.nextDouble();
        // System.out.println("My percentage is : " + percentage);

        // Declaring LONG datatype
        // long phone_no = 90749824755l;
        // System.out.println(phone_no);

        // --->LONG INPUT PROGRAM
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Phone number : ");
        double phone_no = input.nextLong();
        System.out.println("My phone number is : " + phone_no);

        input.close();
    }

}
