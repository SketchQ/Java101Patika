# Byte, Short , Int ve Long Veri Tipleri

Java'da tam sayıları belirten veri tipleridir. Aralarındaki fark boyuttur.

## Byte

* 8 bit uzunluğundadır. Max 127, Min -128 değerleri arasındadır.
* Keyword : **byte**

## Short

* 16 bit uzunluğundadır. Max 32,767, Min -32,768 arasında
* Keyword: **short**

## Integer

* 32 bit uzunluğundadır. Max 2,147,483,647 , Min -2,147,483,648 değerleri arasındadır.
* En çok tercih edilen veri tipidir, sebebi optimize uzunlukta olmasıdır.
* Keyword: **int**

## Long

* 64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min -9,223,372,036,854,775,808 değerleri arasındadır.
* Int'in yetersiz olduğu durumlarda kullanılır.
* Keyword: **long**

```java
public class JavaPatika{
    public static void main(String[] args){
        byte a = 120;
        short b = 1000;
        int c = 100000;
        long d = 10000000;
    }
}
```

### Kaynak

> [Tam Sayı Veri Tipleri](https://app.patika.dev/moduller/java101/byte-short-int-long)
