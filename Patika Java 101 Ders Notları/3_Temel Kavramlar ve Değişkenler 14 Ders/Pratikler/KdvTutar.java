/** @author Erim Serdönmez -- 29/08/2021
 *  KdvTutar.java -- Kullanıcıdan alınan verinin KDV'sini hesaplayan program.
 */

package Pratikler;

import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastırın.
        System.out.println("Lütfen ürününüzün fiyatını KDV dahil bir şekilde giriniz...");
        double kdvsiz_fiyat = input.nextDouble();

        // %18 KDV tutarını hesaplamak
        double kdv_miktarı = (kdvsiz_fiyat * 18) / 100;
        System.out.println("KDV tutarı : " + kdv_miktarı);
        // KDV hariç fiyatı
        double kdv_haric = kdvsiz_fiyat - kdv_miktarı;
        System.out.println("Ürününüzün KDV hariç miktarı : " + kdv_haric);
        

        // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Yeni ürününüzün fiyatını giriniz \nEğer tutar 0 ve 1000 TL arasında ise KDV %18\nTutar 1000TL üzerinde ise KDV miktarı %8 olucaktır.");
        double tutar = inp.nextDouble();
        double kdv = (tutar > 999) ? ((tutar * 8) / 100) : ((tutar * 18) / 100);
        System.out.println("Ürününüzün KDV miktarı : " + kdv);
        System.out.println("Toplam Tutar : " + (tutar + kdv));
        input.close();
        inp.close();
    }
}
