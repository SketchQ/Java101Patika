/** @author Erim Serdönmez -- 03/09/2021
 *  CinZodyak.java -- Kullanıcının Çin Zodyağını hesaplayan program
 */
package Odevler;

import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        String zodiak;
        // Kullanıcıdan Veri alma
        System.out.print("Çin Zodyak Burcunuzu bulan programa hoşgeldiniz.\nLütfen Doğum Yılınızı Giriniz : ");
        year = input.nextInt();
        input.close();

        // Zodyak Hesaplama
        switch ((year % 12)) {
            case 0:
                zodiak = "Maymun";
                break;
            case 1:
                zodiak = "Horoz";
                break;
            case 2:
                zodiak = "Köpek";
                break;
            case 3:
                zodiak = "Domuz";
                break;
            case 4:
                zodiak = "Fare";
                break;
            case 5:
                zodiak = "Öküz";
                break;
            case 6:
                zodiak = "Kaplan";
                break;
            case 7:
                zodiak = "Tavşan";
                break;
            case 8:
                zodiak = "Ejderha";
                break;
            case 9:
                zodiak = "Yılan";
                break;
            case 10:
                zodiak = "At";
                break;
            case 11:
                zodiak = "Koyun";
                break;
            default:
                zodiak = "Hatalı giriş yaptınız";
        }
        // Kullanıcıya Bilgi Verme
        System.out.println("Çin Zodyağı Burcunuz : " + zodiak);
    }
}
