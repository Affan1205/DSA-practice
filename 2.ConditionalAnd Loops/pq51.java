// Kunal is allowed to go out with his friends only on the even days of a given month. 
// Write a program to count the number of days he can go out in the month of August.
public class pq51 {
    public static void main(String[] args) {
        int count = 0;
        int aug_days = 31;
        for (int i = 1; i <= aug_days; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kunal is allowed to go out with his friends " + count + " days.");

    }
}
