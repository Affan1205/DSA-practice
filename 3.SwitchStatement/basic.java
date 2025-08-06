// switch (expression) {
//     case value1:
//         // statements
//         break;
//     case value2:
//         // statements
//         break;
//     // ... more cases
//     default:
//         // statements for no case match (optional)
// }

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number b/w 1 to 7 : ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("enter valid input");
                break;
        }
input.close();
    }

}
