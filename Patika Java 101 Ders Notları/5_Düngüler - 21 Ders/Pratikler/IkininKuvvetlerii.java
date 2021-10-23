/** @author Erim Serdönmez -- 13/09/2021
 *  Girilen sayıya kadar olan 2'nin, 4 ve 5'in kuvvetlerini ekrana yazdıran program
 */
package Pratikler;

import java.util.Scanner;

public class IkininKuvvetlerii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2'nin kuvvetlerini bulma
        double prompt;
        System.out.print("Lütfen bir sayı giriniz : ");
        prompt = input.nextDouble();

        for (double i = 0; i <= prompt; i++) {
            System.out.println("Sonuç : " + Math.pow(2, i));
        }

        // 4 ve 5'in kuvvetleri
        double inp;

        System.out.print("Lütfen 4 ve 5'in katları için bir sayı giriniz : ");
        inp = input.nextDouble();

        for (double i = 0; i <= inp; i++) {
            System.out.println("4'ün kuvvetleri Sonuç : " + Math.pow(4, i));
        }
        for (double i = 0; i <= inp; i++) {
            System.out.println("5'in Kuvvetleri Sonuç : " + Math.pow(5, i));
        }
        input.close();
    }
}