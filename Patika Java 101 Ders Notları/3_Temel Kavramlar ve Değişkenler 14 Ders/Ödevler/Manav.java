/** @author Erim Serdönmez -- 29/08/2021
 * Manav.java -- Kullanıların verdiği kilogram değerlerine göre toplam tutarı hesaplayıp ekrana yansıtır.
 */
package Odevler;

import java.util.Scanner; 

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total = 0,kilo;
        System.out.print("Armut Kaç Kilo ?");
        kilo = input.nextDouble();
        total += armut * kilo;
        System.out.print("Elma Kaç Kilo ? ");
        kilo = input.nextDouble();
        total += elma * kilo;
        System.out.print("Domates Kaç Kilo ?");
        kilo = input.nextDouble();
        total += domates * kilo;
        System.out.print("Muz Kaç Kilo ? ");
        kilo = input.nextDouble();
        total += muz * kilo;
        System.out.print("Patlıcan Kaç Kilo ?");
        kilo = input.nextDouble();
        total += patlican * kilo;
        System.out.print("Toplam Tutar : " + total + " TL");
        input.close();
    }
}
