import java.util.Arrays;

public class PassinginArray {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(nums));//[3, 4, 5, 6, 7]
        change(nums);
        System.out.println(Arrays.toString(nums));//[3, 72348, 5, 6, 7]
    }

    static void change(int[] arr) {
        arr[1] = 72348;
    }
}
