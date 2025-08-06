//parameter in function

import java.util.Scanner;

public class basic4 {

    // ---->Integer parameter example
    // public static void main(String[] args) 
    // int ans = sum(20, 30);
    // System.out.println("Sum is : " + ans);
    // }

    // static int sum(int a, int b) {
    // int add = a + b;
    // return add;
    // }

    //---->String parameter example
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String naam = sc.next();
        String personalized = greeting(naam);
        System.out.println(personalized);
        sc.close();
    }
    static String greeting(String name) {
        String message = "hello" + name;
        return message;
    }

}
