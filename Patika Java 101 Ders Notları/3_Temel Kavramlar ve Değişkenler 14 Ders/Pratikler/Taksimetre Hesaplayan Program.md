# Taksimetre Hesaplayan Program

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

* Taksimetre KM başına 2.20TL tutmaktadır.
* Minumum ödenecek tutar 20 TL'dir. 20 TL altındaki ücretlerde yine 20 TL alınacaktır.
* Taksimetre açılış ücreti 10 TL'dir.

```java
import java.util.Scanner; 

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Gidilen Mesefaye (KM) göre taksimetre tutarını ekrana yazdıran program.
        int acilis = 10, alinan_yol;
        double kmTek = 2.20, tutar;
        String sonuc;
        System.out.print("Lütfen kaç KM yol gittiğinizi yazınız:");
        alinan_yol = input.nextInt();
        System.out.println("Ödenecek Tutar Hesaplanıyor...");
        tutar = acilis + (alinan_yol * kmTek);
        System.out.println(tutar);
        sonuc = tutar > 20 ? "Ödenecek Tutar: " + tutar : "Ödenecek Tutar 20 TL'nin altında olduğu için Toplam Miktar: 20TL'dir.";
        System.out.println(sonuc);
        input.close();
    }
}

```
