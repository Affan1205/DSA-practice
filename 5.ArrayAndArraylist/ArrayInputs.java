import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {

        // int[] arr = new int[5];
        // arr[0] = 3;
        // arr[1] = 23;
        // arr[2] = 34;
        // arr[3] = 32;
        // arr[4] = 38;
        // System.out.println(arr[3]);

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // input using for loop
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // 1st method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2nd method
        // FOR EACH LOOP
        for (int num : arr) {// for every element in the array , print the element
            System.out.print(num + " ");// here num represnt element of array
        }

        // 3rd toString method
        System.out.println(Arrays.toString(arr));

        // Array of object
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // you can modify also
        str[2] = "cse";
        System.out.println(Arrays.toString(str));

    }

}
