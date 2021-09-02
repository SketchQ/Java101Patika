/** @author Erim Serdönmez --02/09/2021
 *  HackerRank Java if - Else
 */
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        // Given an integer, n perform the following actions.
        /*
         * İf n is odd, print 'Weird' if n is even and in he inclusive range of '2' to
         * '5', print 'Not Weird' if n is even and in the inclusive range of '6' to
         * '20', print 'Weird' if n is even and greater than '20', print 'Not Weird'
         */
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        if ((n % 2) == 0) {
            if ((n >= 2) && (n <= 5)) {
                System.out.println("Not Weird");
            }
            if ((n >= 6) && (n <= 20)) {
                System.out.println("Weird");
            }
            if (n > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        input.close();
    }
}
