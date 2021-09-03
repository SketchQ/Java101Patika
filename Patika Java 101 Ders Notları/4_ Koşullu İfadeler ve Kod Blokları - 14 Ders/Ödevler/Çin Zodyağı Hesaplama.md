# Çin Zodayağı Hesaplayan Program

Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağını hesaplayın.

## Çin Zodyağı Nasıl Hesaplanır?

Kişinin doğum yılının 12 ile bölümünden kalana göre bulunur.

* Doğum Tarihi % 12 = 0 == > **Maymun**
* Doğum Tarihi % 12 = 1 == > **Horoz**
* Doğum Tarihi % 12 = 2 == > **Köpek**
* Doğum Tarihi % 12 = 3 == > **Domuz**
* Doğum Tarihi % 12 = 4 == > **Fare**
* Doğum Tarihi % 12 = 5 == > **Öküz**
* Doğum Tarihi % 12 = 6 == > **Kaplan**
* Doğum Tarihi % 12 = 7 == > **Tavşan**
* Doğum Tarihi % 12 = 8 == > **Ejderha**
* Doğum Tarihi % 12 = 9 == > **Yılan**
* Doğum Tarihi % 12 = 10 == > **At**
* Doğum Tarihi % 12 = 11 == > **Koyun**

## Senaryo

```text
Doğum Yılınızı Giriniz : 1990
Çin Zodyağı Burcunuz : At
```

```java
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
```
