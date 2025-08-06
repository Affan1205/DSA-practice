public class Typecasting {
    public static void main(String[] args) {

        // System.out.print("Enter some input: ");
        // Scanner input = new Scanner(System.in);
        // float marks = input.nextFloat();
        // System.out.println(marks); // we put int in float and result is float
        // becauseint is smaller than float

        // System.out.print("Enter some input: ");
        // Scanner input = new Scanner(System.in);
        // int marks = input.nextInt();
        // System.out.println(marks);// we put float in int and result is error because
        // float is bigger than int

        // To solve this problem we used typecasting
        // int num = (int) (8797.67);
        // System.out.println(num);

        // <---------- Widening Typecasting (Implicit Casting)------------>
        // When you convert a smaller(narrower) data type to a larger (wider) data type.
        // This is done automatically by Java because it’s safe—no data will be lost.
        // int i = 10;
        // double d = i; // int to double (automatic)
        // d will be 10.0

        // <----------Narrowing Typecasting (Explicit Casting)------------>
        // When you convert a larger data type to a smaller data type.
        // This can lose data, so the programmer must do it manually.

        // double d = 9.78;
        // int i = (int) d; // double to int (manual)
        // i will be 9 (decimal truncated)

    }
}
