# Float ve Double Veri Tipleri

Java'da ondalıklı yani küsüratlı sayıları belirtir.

## Float

* 32 bit boyutundadır ve 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
* Float içerisine tam sayı yazdığımız zamanda bile o sayı 1.0 olarak ondalıklı hale getirilir.
* Float ile double ayırmak için, float tanımlamalardan sonra **"f"** veya **"F"** konulmalıdır.
* Keyword: **float**

## Double

* 64 bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
* Üst düzey matematiksel işlemlerde kullanılır.
* keyword: **double**

## Ondalık Sayı Veri tiplerinden hangisi Tercih edilmelidir?

Değişkenlik gösterir, Ancak;

* **Double** tipi, yüksek duyarlıklı ve hassas matematiksel işlemlerde kullanılır.
* **Float** basittir: hız ve bellek.
* **Double** daha yavaş ve fazla yer kaplar.
* **Java** hassas matematiksel işlemler, örneğin sinüs kosinüs fonksiyonları, **double** tipi değere döndürür.

```java
public class JavaPatika{
    public static void main(String[] args){
        float number1 = 3,14F;
        float number2 = 3,14f;

        double number3 = 3,14;
    }
}
```

### Kaynak

> [Float ve Double](https://app.patika.dev/moduller/java101/float-double)
