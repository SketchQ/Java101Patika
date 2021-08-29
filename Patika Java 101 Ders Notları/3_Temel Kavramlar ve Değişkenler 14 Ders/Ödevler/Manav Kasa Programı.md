# Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

## Meyveler ve KG fiyatları

* Armut : 2.14 TL
* Elma : 3.67 TL
* Domates : 1.11 TL
* Muz : 0.95 TL
* Patlıcan : 5.00 TL

## Örnek Çıktı

```text
Armut Kaç Kilo ? : 0
Elma Kaç Kilo ? : 1
Domates Kaç Kilo : 1
Muz Kaç Kilo : 2
Patlıcan Kaç Kilo : 3
Toplam Tutar : 21.68 TL
```

```java
import java.util.Scanner; 

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total = 0,kilo;
        System.out.print("Armut Kaç Kilo ?");
        kilo = input.nextDouble();
        total += armut * kilo;
        System.out.print("Elma Kaç Kilo ? ");
        kilo = input.nextDouble();
        total += elma * kilo;
        System.out.print("Domates Kaç Kilo ?");
        kilo = input.nextDouble();
        total += domates * kilo;
        System.out.print("Muz Kaç Kilo ? ");
        kilo = input.nextDouble();
        total += muz * kilo;
        System.out.print("Patlıcan Kaç Kilo ?");
        kilo = input.nextDouble();
        total += patlican * kilo;
        System.out.print("Toplam Tutar : " + total + " TL");
        input.close();
    }
}
```
