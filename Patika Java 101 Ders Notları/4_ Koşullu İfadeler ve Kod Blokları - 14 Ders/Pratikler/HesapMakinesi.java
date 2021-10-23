/** @author Erim Serdönmez -- 31/08/2021
 * hesapmakinesi.java -- dört işlem yapan basit bir hesap makinesi programı
 */
package Pratikler;

import java.util.Scanner;
 
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan iki sayı alma
        int x,y;
        System.out.print("Lütfen bir Sayı giriniz : ");
        x = input.nextInt();
        System.out.print("Lütfen bir sayı daha giriniz : ");
        y = input.nextInt();

        // Hesap işlemi
        byte i;
        System.out.println("\nToplama için '1', Çıkartma için '2', Çarpma için '3', Bölme için '4' tuşuna basınız...");
        i = input.nextByte();

        switch(i){
            case 1 :
                System.out.println("Toplama işlemi yapılıyor.");
                System.out.println("Sonuç : " + ( x + y));
                break;
            case 2 :
                System.out.println("Çıkartma işlemi yapılıyor.");
                System.out.println("Sonuç : " + (x - y));
                break;
            case 3 : 
                System.out.println("Çarpma işlemi yapılıyor.");
                System.out.println("Sonuç : " + (x * y));
                break;
            case 4 : 
                System.out.println("Bölme işlemi yapılıyor.");
                System.out.println("Sonuç : " + (x / y));
                break;
            default:
                System.out.println("Lütfen belirtilen değer aralıklarında bir sayıya basınız!");
        input.close(); 
        }
    }
}
