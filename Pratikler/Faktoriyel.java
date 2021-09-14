/** @author Erim Serdönmez -- 13/09/2021
 *  Faktöriyel ve Kombinasyon hesaplayan program
 */
package Pratikler;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Faktoriyel Hesaplama
        // n! = 1 * 2 * 3 * 4 * 5 ... * n
        System.out.print("Lutfen bir sayi giriniz : ");
        int prompt = input.nextInt();
        int total = 1;

        // Faktoriyel
        for (int i = 1; i <= prompt; i++) {
            total *= i;
        }
        System.out.println(prompt + " Faktoriyel = " + total);

        // Kombinasyon Hesaplama
        // C(n,r) = n! / (r! * (n-r)!)
        System.out.print("Kombinasyon hesaplamak icin lutfen bir sayi giriniz : ");
        int n = input.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        int r = input.nextInt();
        System.out.println("Kombinasyon Hesaplaniyor...");

        int nFact = 1, rFact = 1, C = 1, D = 1, E = 1;
        int nRFact = 1;
        // N faktoriyel hesaplama
        for (int i = 1; i <= n; i++) {
            nFact = C *= i;
        }
        // R factorial
        for (int i = 1; i <= r; i++) {
            rFact = D * i;
        }
        // N -R factorial
        for (int i = 1; i <= n - r; i++) {
            nRFact = E *= i;
        }
        // Kombinasyon Hesaplama
        int comb = nFact / (rFact * nRFact);
        System.out.println("Kombinasyon Sonuc : " + comb);
        input.close();
    }
}
