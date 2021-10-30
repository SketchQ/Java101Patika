# Dairenin Alanını ve Çevresini hesaplayın

Java ile yarıçapını kullanıcıdan aldığımız dairenin alanını ve çevresini hesaplayan programı yazınız.

```math
Alan Formulü :  π * r * r;

Çevre Formülü : 2 * π * r;
```

## Ödev

Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

```math
𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
```

```java
import java.util.Scanner; 

public class Daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Yarıçapını kullanıcıdan alarak daire alanı ve çevre hesaplaması
        double pi = 3.14, alan, cevre,dilim_alani;
        int r,alpha;
        System.out.print("Lütfen Alanı ve Çevresinin alınmasınıı istediğiniz dairenin Yarıçapını giriniz:");
        r = input.nextInt();
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenizin alanı: " + alan);
        System.out.println("Dairenizin çevresi: " + cevre);

        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı
        System.out.println("Tebrikler!\nDaire diliminin alanını bulmak için ilerliyor...");
        input.nextLine();
        System.out.print("Lütfen Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Lütfen Daire diliminin merkez açısının ölçüsünü giriniz:");
        alpha = input.nextInt();
        System.out.println("Hesaplanıyor...");
        dilim_alani = (pi * (r*r)* alpha) / 360;
        System.out.println("Daire Diliminin alanı:\n" + dilim_alani);
        input.close();
    }
}

```
