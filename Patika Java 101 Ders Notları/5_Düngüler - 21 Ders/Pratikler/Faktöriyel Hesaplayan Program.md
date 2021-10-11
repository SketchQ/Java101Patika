# Faktöriyel Hesaplama

Java ile faktöriyel hesaplayan program yazıyoruz.

## Ödev

N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n'in r'li kombinasyonu olarak adlandırılır. N'in r'li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yapınız.

## Kombinasyon Formülü

```math
C(n,r) = n! / (r! * (n-r)!)
```

## Faktoriyel

```java

import java.util.Scanner; 

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Faktoriyel Hesaplama
        // n! = 1 * 2 * 3 * 4 * 5 ... * n
        System.out.print("Lutfen bir sayi giriniz : ");
        int prompt = input.nextInt();
        int total = 1;

        // Faktoriyel
        for(int i = 1 ; i <= prompt ; i++){
            total *= i;
        }
        System.out.println(prompt + " Faktoriyel = " + total);
        input.close();
    }   
}
```
