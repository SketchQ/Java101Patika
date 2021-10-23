/**@author Erim Serdönmez - 29/08/2021
 * Taksimetre.java -- Taksimetre hesaplayan program
 * KM başı = 2.20 TL
 * Minumum Ödeme Tutarı = 20 TL
 * Taksimetre açılış miktarı = 10 TL
 */
package Pratikler;

import java.util.Scanner; 

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Gidilen Mesefaye (KM) göre taksimetre tutarını ekrana yazdıran program.
        int acilis = 10, alinan_yol;
        double kmTek = 2.20, tutar;
        String sonuc;
        System.out.print("Lütfen kaç KM yol gittiğinizi yazınız:");
        alinan_yol = input.nextInt();
        System.out.println("Ödenecek Tutar Hesaplanıyor...");
        tutar = acilis + (alinan_yol * kmTek);
        System.out.println(tutar);
        sonuc = tutar > 20 ? "Ödenecek Tutar: " + tutar : "Ödenecek Tutar 20 TL'nin altında olduğu için Toplam Miktar: 20TL'dir.";
        System.out.println(sonuc);
        input.close();
    }
}
