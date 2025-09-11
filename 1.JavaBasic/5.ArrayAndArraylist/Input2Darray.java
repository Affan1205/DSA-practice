import java.util.Arrays;
import java.util.Scanner;

public class Input2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);// no of rows
        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
            System.out.println();
        }
        // 1st output method
        for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
        }
        System.out.println();
        }

        // output by using toString
        for (int row = 0; row < arr.length; row++) {
        System.out.println(Arrays.toString(arr[row]));
        }

        // output by using foreachloop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }


        in.close();
    }
}
