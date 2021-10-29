# Palindrom Sayılar

Java ile nir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

## Palindrom Sayı Nedir?

palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1,4,8,99,101,363,4004,9889...

```java
public class Palindrom {
    
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            System.out.println("----------");
            System.out.println("Number: " + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak: " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayı: " + reverseNumber);
            temp /= 10;
        }
        if(reverseNumber == number){
            System.out.println(number + " Palindrom bir sayıdır.");
        }else{
            System.out.println(number + " Palindrom bir sayı değildir.");
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrom(2476);
    }
}
```

### Kaynak

[Patika](https://app.patika.dev/moduller/java101/pratik-palindrom)
