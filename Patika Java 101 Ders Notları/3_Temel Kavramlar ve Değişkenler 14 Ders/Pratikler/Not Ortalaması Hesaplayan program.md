# Not Ortalaması Hesaplayan Program

Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.  

## Ödev

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.  
Not : If ve Else kullanılmayacak...

```java
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        // Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik Derslerinin sınav puanlarını kullanıcıdan alan ve ortalamarını hesaplayıp ekrana bastırılan program.

        Scanner input = new Scanner(System.in);

        // Matematik
        System.out.println("Matematik notunuzu yazınız : ");
        int matematikNot = input.nextInt();
        // Fizik
        System.out.println("Fizik notunuzu yazınız: ");
        int fizikNot = input.nextInt();
        // Kimya
        System.out.println("Kimya notunuzu yazınız: ");
        int kimyaNot = input.nextInt();
        // Türkçe
        System.out.println("Türkçe Notunuzu yazınız: ");
        int turkceNot = input.nextInt();
        // Tarih
        System.out.println("Tarih notunuzu yazınız: ");
        int tarihNot = input.nextInt();
        // Müzik
        System.out.println("Müzik notunuzu yazınız: ");
        int muzikNot = input.nextInt();
        input.close();
        
        // Ortalama alma
        System.out.println("Ortalama hesaplanıyor...");
        double ortalama = (matematikNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot) / 6;
        System.out.println("ortalamanız: " + ortalama);
        String sonuc = (ortalama > 60) ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(sonuc);
    }
```
