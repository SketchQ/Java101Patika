/** @author Erim Serdönmez 02/09/2021
 * Etkinlik.java -- Hava Durumuna göre etkinlik önerme
 */
package Pratikler;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan hava durumu bilgisi alma
        int hava;
        System.out.print("Lütfen şu anki hava durumunu yazınız: ");
        hava = input.nextInt();

        // Etkinlik Önerme

        if (hava <= 5){
            System.out.println("Hava Sıcaklığı :" + hava +" derece Bugün Kayak Yapmanızı öneririm.");
        }
        if ( (5 <= hava) && !(hava > 15)){
            System.out.println("Hava Sıcaklığı :" + hava +" derece Bugün Sinemaya gitmenizi öneririm.");
        }
        if ((10 <= hava) && !(hava > 25)){
            System.out.println("Hava Sıcaklığı :" + hava +" derece Bugün Piknik yapmanızı tavsiye ederim.");
        }
        if ((hava >= 25) && !(35 < hava )){
            System.out.println("Hava Sıcaklığı :" + hava +" derece Bugün Yüzmenizi öneririm.");
        }
        if (hava >= 35){
            System.out.println("Bugün Hava sıcaklığının herhangi bir etkinlik için uygun olmadığını görüyorum.\nTavsiyem evde kalmanız.");
        }
        input.close();
    }
}
