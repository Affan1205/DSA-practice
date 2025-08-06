//To find Armstrong Number between two given number.

// import java.util.Scanner;

// public class Practiceques8 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the First number: ");
//         int num1 = input.nextInt();
//         System.out.print("Enter the Second number: ");
//         int num2 = input.nextInt();

//         // Loop through each number in the given range
//         for (int i = num1; i <= num2; i++) {
//             int ans = 0;
//             int check = i;
//             int temp = i;

//             // For 3-digit Armstrong numbers only (cube each digit)
//             while (temp > 0) {
//                 int digit = temp % 10;
//                 ans = ans + digit * digit * digit;
//                 temp = temp / 10;
//             }
//             if (ans == check) {
//                 System.out.print(check + " ");
//             }
//         }
//         input.close();
//     }
// }



