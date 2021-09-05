/** @author Erim Serdönmez -- 05/09/2021
 *  CiftSayilarıBulanProgram.java -- Kullanıcının girdiği sayıya kadar olan çift sayıları bulan program.
 *  0'dan girilen sayıya kadar olan sayılardan 3 ve 4 'e bölünen sayıların ortalamasını hesaplayan program
 */
package Pratikler;

import java.util.Scanner;

public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan alınan sayıya kadar olan çift sayıları bulma

        int prompt;

        System.out.println("Lütfen Bir Sayı Giriniz : ");
        prompt = input.nextInt();
        System.out.println();
        for (int i = 1; i <= prompt; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        // 3 veya 4'e tam bölünen sayıların toplamının ortalaması
        System.out.println("3 ve 4'e tam bölünen sayıların ortalamasını hesaplıyor...");
        int sum = 0, final_sum;
        for (int i = 0; i <= prompt; i++) {
            if ((i % 3 == 0) || (i % 4 == 0)) {
                sum += i;
            } else {
                continue;
            }
        }
        final_sum = sum / prompt;
        System.out.println(final_sum);
        input.close();
    }
}
