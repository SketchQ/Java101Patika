# Artık Yıl Hesaplayan Program

Java ile kullanıcıdan alınan yılın artık olup olmadığını bulan programı yazınız.

## Artık Yıl

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır.

* 1988,1992,1996,2000,2004,2008,2012,2016,2020,2024 gibi.

100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır.

* 1200,1600,2000 gibi

## Senaryo

```text
Yıl Giriniz : 2020
2020 bir artık yıldır !
```

```java
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
```
