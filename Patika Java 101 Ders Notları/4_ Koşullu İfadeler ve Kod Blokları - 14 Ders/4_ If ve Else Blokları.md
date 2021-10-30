# If ve Else Blokları

Java'da mantıksal ve koşullu ifadeler için if blokları kullanılır. Java 'da if blokları Türkçede "eğer" cümlesinin verdiği anlamla aynı şeyi ifade etmektedir. Programlamada koşul oluşturmak için if ve else bloklarını kullanırız. Else deyimi "değil ise" anlamı katmaktadır ve if deyiminden sonra kullanılır. Programlama da if ve else deyimleri çok önemlidir ve kodlamanın temel yapı taşlarını oluştururlar. If ve Else blokları ile programımız içerisinde ki algoritmalarımızı oluştururuz.  

Koşula göre program içinde farklı işlemleri yerine getirmek gerekebilir. İf-else muhtemelen yazılım programlarında en yaygın kullanılan karar mekanizmasıdır. Bu tarz durumları Java'da kodlayabilmek için if-else karar mekanizmasının yanında switch-case gibi yapılarda kullanılmaktadır. İf-else karar mekanizması istenilen koşul gerçekleştiği takdirde çalışır. Kısacası belirlenen koşul doğruysa yazılan kod çalışır.

## Java'da Karak Mekanizmaları

***If, Else, else if,switch***

* Programımızda belirtilen bir koşul "True" ise yürütülecek kod bloğu için **"If"**.
* Aynı Koşul "False" ise yürütülecek kod bloğu için **"else"**.
* ilk koşul "False" ise ancak yeni bir koşul belirtmek istenirse **"else if"**.
* Yürütülecek bir çok alternatif kod bloğu belirtmek için **"switch"**.  
kullanılır.

```java
public class Test{
    public static void main(String[] args){
        if(age < 50){
            System.out.print("Personel kayıtlarını getir.");
        }
    }
}
```

```java
public class Test{
    public static void main(String[] args){
        if (creditRatio > 0.7){
            System.out.println("Kurumsal müşteri tipinde kredi");
        }
        else{
            System.out.println("Standart müşteri tipinde kredi");
        }
    }
}
```

```java
public class Test{
    public static void main(String[] args){
        if (ortalama >= 50){
            System.out.println("Dersi Geçtiniz");
        }else{
            System.out.println("Dersten kaldınız");
        }
    }
}
```

## else - if

if- else- if : if-else-if kalıbında, bir if satırı, istediğiniz sayıda else-if satırı ve isteğe bağlı olarak tanımlanan bir else satırı bulunur. Yani, else satırının tanımlanması şart değildir. Program, en başta yer alan if satırı ile if-else-if kalıbını değerlendirmeye başlar. İlk doğru ifadenin bulunduğu if veya else-if satırı ile karşılaştığında ilgili işlem satırını çalıştırır. Kalıbın geri kalan tüm satırlarını değerlendirmeye almadan geçer. Eğer if ve else if satırlarında yer alan ifadelerden hiç biri doğru bir sonuç vermezse, else satırında yer alan işlem satırını çalıştırır. else satırı da mevcut değilse, program if-else-if kalıbının hiç bir satırını çalıştırmadan bir sonraki satırdan çalışmasına devam eder. if-else-if kalıbında sadece tek bir satır işlem görür.

```java
public class Test{
    public static void main(String[] args){
        if(i == 10){
            System.out.println("i nin değeri 10'dur.");
        }
        else if(i < 10){
            System.out.println("i nin değeri 10'dan küçüktür.");
        }
        else{
            System.out.println("i nin değeri 10'dan farlıdır ve 10'dan küçük değildir.");
        }
    }
}
```

```java
public class Test{
    public static void main(String[] args){
        float saltRatio = 0.9f;
        if (saltRatio >= 0.9){
            System.out.println("Yüksek derecede tuzlu");
        }
        else if((saltRatio > 0.5) && (saltRatio < 0.8)){
            System.out.println("Orta Derecede Tuzlu...");
        }
        else{
            System.out.println("düşük Derecede tuzlu");
        }
    }
}
```

Örneğin: 18 yaşından küçük olanlar kan bağışı yapamazlar, fakat, 18 yaşına eşit ve büyük olan bir kişi eğer kilosu 48'den büyükse kan verebilir, kilosu 48'den küçükse kan veremez gibi basit bir kuralı Java'da kodlayalım.

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age, kilo;
        System.out.print("Lütfen yaşınızı giriniz?");
        age = nextInt();
        System.out.print("Lütfen kilonuzu giriniz");
        kilo = nextInt();
        if (age >= 18){
            if(kilo > 48){
                System.out.println("Kan Verebilirsiniz");
            }
            else{
                System.out.println("Kan vermek için kilonuzun en düşük 48 kg olmalısı gerekmektedir.");
            }
        }
        else{
            System.out.println("Kan verebilmek için en az 18 yaşında olmanız gerekmektedir"),
        }
        input.close();
    }
}
```

### Kaynak

> [If-Else](https://app.patika.dev/moduller/java101/if-else)
