/** @author Erim Serdönmez -- 29/08/2021
 * VucutIndeks.java -- Kullanıcıdan boy ve kilo verileri alarak Vücut Kitle İndeksini hesaplar.
 */
package Odevler;

import java.util.Scanner; 

public class VucutIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,indeks;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);
        input.close();
    }
}
