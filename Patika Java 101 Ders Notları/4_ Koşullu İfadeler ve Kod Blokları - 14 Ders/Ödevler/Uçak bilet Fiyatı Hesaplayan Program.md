# Uçak Bileti Fiyatı Hesaplayan Program

Java ile mesafeye ve şartlara göre uçak bileti hesaplayan program.  
Kullanıcıdan, **Mesafe(KM), yaş ve yolculuk tipi(Tek Yön,Gidiş-Dönüş)** bilgilerini alın.  
Mesafe başına **0.10 TL/km**  
İlk olarak uçuşun toplam fiyatını hesapla.  
Sonrasında aşağıdaki koşullara göre indirim uygula:  

* Kullanıcıdan alınan değerler geçerli olmalı. (Mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise '1' veya '2' olmalıdır.)
* Kişi 12 yaşından **küçük** ise bilet fiyatı üzerinden **%50** indirim.
* Kişi 12 - 24 yaşları arasında ise **%10** indirim.
* Kişi 65 yaşından büyük ise **%30** indirim.
* Kişi "Yolculuk Tipini" **gidiş-dönüş** seçmiş ise **%20** indirim.

```java
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan verileri alma.
        int km, age, flight_type;
        boolean isError = false;
        System.out.println(
                "Merhabalar, Uçak bileti hesaplayan programa hoşgeldiniz.\nMesafe başına ücret : 0.10 TL/km'dir.");
        System.out.print("Lütfen Uçuş türünüzü Seçiniz (Tek yön ise '1', Gidiş-Dönüş ise '2' ye basınız.): ");
        flight_type = input.nextInt();
        if ((flight_type != 1) && (flight_type != 2)) {
            isError = true;
        }
        System.out.print("Lütfen toplam mesafeyi KM cinsinden yazınız : ");
        km = input.nextInt();
        if (km < 0) {
            isError = true;
        }
        System.out.print("Lütfen Yaşınızı belirtiniz : ");
        age = input.nextInt();
        if (age < 0) {
            isError = true;
        }
        // Input Verification
        if (isError) {
            System.out.println("Hatalı Veri Girdiniz, Lütfen Bilgilerinizi kontrol Ediniz...");
        }
        input.close();
        // Toplam Miktarı Hesaplama
        double net_price, final_price, discount;
        net_price = (0.10 * km);
        System.out.println("İndirimlerden önceki toplam Uçuş Tutarınız : " + net_price + " TL'dir.");

        // Indirimleri uygulama
        if (age < 12) {
            discount = (net_price / 2);
        } else if ((age >= 12) && (age <= 24)) {
            discount = (net_price * 0.10);
        } else if (age >= 65) {
            discount = (net_price * 0.30);
        } else {
            discount = 0;
        }
        if (flight_type == 2) {
            discount += (net_price * 0.20);
        }

        // Son miktarı hesaplama
        if (discount != 0) {
            final_price = (net_price - discount);
        } else {
            final_price = net_price;
        }

        // Kullanıcıya Bilgi verme
        System.out.println(
                "Toplam indirim miktarınız : " + discount + " TL'dir.\nSon Miktar: " + final_price + " TL'dir.");
    }
}
```
