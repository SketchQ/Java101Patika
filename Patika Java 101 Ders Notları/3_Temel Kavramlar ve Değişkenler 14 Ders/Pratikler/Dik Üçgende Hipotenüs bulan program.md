# Dik Üçgende Hipotenüs Bulan Program

Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

```math
h2 = b2 + c2
```

## Ödev

Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

## Formül

```math
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2


Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
```

```java
import java.util.Scanner; 
import java.lang.Math;

public class DikUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan dik kenarları alıp Hipotenüs hesaplama
        int a, b, c, h, u, alan;
        System.out.println("Lütfen Hipotenüsünü ölçmek istediğiniz üçgenin dik kenarlarını yazınız:");
        a = input.nextInt() ;
        b = input.nextInt();
        h = (a*a) + (b*b);
        System.out.println("Hipotenüs hesaplanıyor...");
        System.out.println("Üçgeninizin Hipotenüsü : " + Math.sqrt(h));

        // Üç Kenar Uzunluğunu Kullanıcıdan alıp üçgenin alanını hesaplayan program
        System.out.println("Alanını hesaplamak istediğiniz üçgenin üç kenar uzunluğunu giriniz...");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        u = (a+b+c) / 2;
        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgeninizin Alanı:\n" + Math.sqrt(alan));
        input.close();
    }
}

```
