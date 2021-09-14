/** @author Erim Serdonmez -- 14/09/2021
 *  Girilen Sayinin Harmonik serisini bulan program 
 */

package Pratikler;

import java.util.Scanner; 

public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n = input.nextInt();
        input.close();
        double result = 0;

        for(double i = 1 ; i <= n ; i++){
            result += ( 1 / i);
        }

        System.out.println(n + " Sayisinin harmonik degeri " + result);
    }
}
