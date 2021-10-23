/** @author Erim Serdönmez -- 03/09/2021
 *  ArtikYil.java -- Kullanıcıdan veri olarak yıl alıp artık yıl hesaplayan program
 */
package Odevler;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan veri alma
        int year;
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();
        input.close();

        // Artık yıl hesaplama
        String message = " bir artık Yıldır !";
        String message1 = " bir artık yıl Değildir !";
        boolean isTrue = (year % 4 == 0);

        if (isTrue) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + message);
                } else {
                    System.out.println(year + message1);
                }
            } else {
                System.out.println(year + message);
            }
        } else {
            System.out.println(year + message1);
        }
    }
}
