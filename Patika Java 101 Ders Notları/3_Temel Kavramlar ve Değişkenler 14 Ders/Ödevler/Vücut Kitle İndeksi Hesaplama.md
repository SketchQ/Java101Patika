# Vücut Kitle İndeksi Hesaplama

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

## Formül

```math
Kilo (kg) / boy(m) * boy(m)
```

## Çıktısı

```java
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
```

```java

import java.util.Scanner; 

public class VucutIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,indeks;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);
        input.close();
    }
}
```
