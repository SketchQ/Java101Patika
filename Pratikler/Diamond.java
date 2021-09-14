/** @author Erim Serdonmez -- 14/09/2021
 *  Drawing a diamond pattern
 *  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 
 */
package Pratikler;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Degeri Giriniz : ");
        int n = input.nextInt();
        input.close();
        // Diamond
        for(int i = 0 ; i <= n ; i++){
            for(int k = 1 ; k <= (n - i); k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2 * i) - 1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int x = 1;
        for(int i = n - 2 ; i >= 0  ; i--){
            for(int j = 0 ; j <= x; j++){
                System.out.print(" ");
            }
            for(int k = (2 * i)- 1 ; k > 0 ; k--){
                System.out.print("*");
            }
            System.out.println(" ");
            x++;
        }
        // Triangle
        /*
        for(int i = 0 ; i <= n; i++){
            for(int j = 1 ; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (2 * i ) - 1 ; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */
    }
}
