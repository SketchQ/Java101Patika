# Kullanıcıdan Veri Alma (input)

Java'da **kullanıcıdan veri almak** için **Scanner** sınıfı(class) kullanılır. Bu sınıfı kullanmadan önce kodumuza **Scanner** sınıfını dahil etmemiz gerekir.  
Bunun için **import** kullanılır;

```java
import java.util.Scanner;
```

import projenin en başına yazılır. Kullanıcıdan veri alma için **değişkenlere** ihtiyacımız vardır.  
"a" adında int bir veri oluşturalım ve kullanıcının inputu ile "a" verisine değer atamak için **Scanner** sınıfından türeyen ve adı **input** olan bir nesne tanımlayalım.  
Eğer değişkenimiz **"integer"** türünde iste **"input.nextInt()"** veya **double** türünde ise **"input.nextDouble()"** kod bloğu kullanılmalıdır.

```java
import java.util.Scanner;
public class JavaPatika{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a , b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A sayısı : " + a);
        System.out.println("B sayısı : " + b);
    }
}
```

## Veri Tipklerine Göre Scanner Metotları

![Scanner](..\Eklentiler\Scanner.png)

```java
import java.util.Scanner;
public class JavaPatika{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        // String Örneği
        String adSoyad = inp.nextLine();

        // Sayı Örnekleri
        int yas = int.nextInt();
        double mass = int.nextDouble();

        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yas: " + yas);
        System.out.println("Maas: " + mass);
    }
}
```

### Kaynak

> [Scanner](https://app.patika.dev/moduller/java101/scanner)
