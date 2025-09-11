import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what are your goals");
        System.out.println(input.nextLine()); //You can write string as long as you want
        System.out.println(input.next()); //You can only write till its find space

        System.out.println("How old are you? ");
        System.out.println(input.nextInt());

        input.close();
    }
}
