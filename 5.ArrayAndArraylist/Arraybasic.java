public class Arraybasic {
    public static void main(String[] args) {

        // DECLARATION OF ARRAY
        int[] numbers; // Array to hold integers
        String[] name; // Array to hold string
        double[] price; // Array to hold doubles

        // INITIALIZATION OF ARRAY
        // 1-way
        int[] numbers1;
        numbers = new int[5];// Array of 5 integers, all set to 0
        String[] fruits;
        fruits = new String[5];

        // 2 - way
        int[] numbers2 = new int[5];// Array of 5 integers, all set to 0
        String[] fruit = new String[5];

        // 3 - way
        int[] numbers3 = { 34, 342, 43, 3, 2 };
        String[] names = { "Aman", "Rekha", "Sita" };
        System.out.println(numbers3[3]);
    }
}
