# Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı

## **Koşullar**

* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
* Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
* Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
* Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

## Ödev

Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

```java
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
```
