import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite fruit: ");
        String fruit = input.next();
        switch (fruit) {
            
            case "mango":
                System.out.println("king of fruit.");
                break;
            case "apple":
                System.out.println("apple a day keeps doctor away.");
                break;
            case "banana":
                System.out.println("monkey fruit.");
                break;
            case "orange":
                System.out.println("king of vitamin C.");
                break;
            case "berry":
                System.out.println("luxorious.");
                break;

            default:
                System.out.println("enter valid input.");
                break;
        }
        input.close();
    }
}
