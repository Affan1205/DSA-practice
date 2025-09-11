//Calculate Distance Between Two Points
import java.util.Scanner;

public class PracticeQuestion9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("x1 y1 x2 y2 : ");
        double x1 = input.nextDouble() , y1=input.nextDouble() ;
        double x2 = input.nextDouble() , y2=input.nextDouble() ;
        double dx = x2-x1 , dy = y2-y1;
        double d = Math.sqrt(dx*dx + dy*dy );
        System.out.println("Distance = " + d);
        input.close();

    }
}
