# Lokal Değişken Kavramı

Java'da lokal değişkenler, kod blokları içerisinde tanımlanan değişkenlerdir ve sadece tanımlandıkları kod blokları içerisinde kullanılabilirler. Diğer metot ve sınıflar üzerinden erişimleri yoktur. Lokal değişkenler tanımladıkları ({...}) kod blokları arasında kullanılırlar.  

```java
public class JavaPatika{
    static void ekranaBas(){
        // Hatalı Kullanım
        System.out.println(a);
    }

    public static void main(String[] args){
        int a = 10;
        if(a < 10){
            int b = 20;
            Stystem.out.println(a);
        }
        // Hatalı Kullanım
        System.out.println(a);
    }
}
```

Bu örnekte if blokları arasında tanımlanmış olan integer türünde ki **"b"** değişkeni, if bloğunun dışında ekrana bastırılmak istenildiğinde hata ile karşılaşılacaktır. Çünkü **"b"** değişkeni if blokları arasında tanımlanmıştır ve tanımlandığı kod blokları arasında kullanılabilir.  
Dikkat edilmesi gereken diğer bir nokta, main metodun içerisinde tanımlanmış olan **"a"** değişkeni if bloğu içerisinde kullanılabilir, çünkü if bloğu main metodun bir parçasıdır. Ama **"a"** değişkeni **ekranaBas();** metodu içerisinde kullanılamaz, bunun sebebi ise **ekranaBas()** ve **main metodu** farklı iki kod bloklarıdır.

## Kaynak

[Patika](https://app.patika.dev/moduller/java101/local-variable)
