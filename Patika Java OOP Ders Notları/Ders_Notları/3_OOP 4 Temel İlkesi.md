# NYP'nin 4 Temel İlkesi

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

## Encapsulation

Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir. Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir. Böylelikle biz değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz. Bunu bir örnek ile anlamaya çalışalım.

### Encapsulation Örneği

Kitap adında bir sınıfımız olsun ve bu sınıfımıza ait 3 adet değişkenimiz olsun bunlar ; **kitapAdi, sayfaSayisi ve yazar**. Bu değişkenlerin erişim belirleyicileri **public** olsun ve her sınıftan erişilsin. Kitap sınıfından oluşturacağımız bir nesne bu niteliklerin hepsini taşısın. Bu yüzden oluşturacağımız **Constructor (kurucu)** metodunu bu şekilde oluşturalım.

```java
public class Kitap {
    public int sayfaSayisi ;
    public String kitapAdi, yazar ;
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi ;
        this.yazar = yazar ;
    }
}
```

![uml](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuL8ioKZDJLKepaujISwev7BEIImkLl3EB4aiKAZcqbR8p2jHA4wiJ4iCJgpCBCu4YWIN56NcfIjaWvGufY29L2PM9HO1kM3D6cZATD1Dqa7HfibLo-MGcfS2T140)

Kitap sınıfından bir nesne oluşturalım.

```java
Kitap book = new Kitap("Harry Potter", 500, "JK Rowling");
```

![book Object](http://www.plantuml.com/plantuml/png/NO-n3e8m54NtznLF9WsGiBWmOLoC31hvWWTKgK1hscTCDVwxLHRiUdFFkRc5PJ9y7mTOS2T6WRONt7GEjWDPYwLakk4BOfIAqP8xKqLEMkcJYerK5-o_bKqxInmzoK0ymSkWbeIcv0zRmHiEzLKqZBNMlPyEUCoZ7HdZyAYPXOaWq66-pZAOApsnB_6a7uEF8k-VJgNfRm4AeLh__mC0)

Kitap sınıfından **book** adlı bir nesne oluşturduk ve bu nesnemizin niteliklerini belirttik. Peki biz bu kurucu metotta sayfa sayısını negatif bir değer girseydik ne olurdu ? Hiç bir kitabın sayfa sayısı negatif bir değer olamayacağı için, nesnemizde bir anlamsızlık olacaktı. Biz bu sorunu **constructor (kurucu)** metotumuza yazacağımız bir if kontrolü ile çözebiliriz.

```java
public class Kitap {
    public int sayfasayisi ;
    public String kitapAdi, yazar;
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar ;
        if (sayfaSayisi < 1) {
            System.out.println("Lütfen pozitif bir değer giriniz : ");
        }else {
            this.sayfaSayisi = sayfaSayisi;

        }
    }
}
```

Constructor metodu görüldüğü gibi modifiye ettik ve nesne oluşturulurken anlamız verilerin olmasını engelledik. Ama sorunlarımız hala bitmedi , biz nesneye ait niteliklere hala dışarıdan erişebiliyoruz ve book.sayfaSayisi = -10 dersek , nesneye ait sayfa sayısını yine anlamsızlaştırmış oluruz. Bu sorunu çözmek için sınıfa ait değişkenlere dışarıdan erişimi kapatmamız gerekir ve oluşturduğumuz değişkenlerin erişim belirleyicilerini **(Access Modifiers)** değiştirmemiz gerekli. Tüm **public'leri private** olarak değiştiriyoruz.

Son Hali :

```java
public class Kitap {
    private int sayfasayisi ; // Access modifier changed
    private String kitapAdi, yazar; // // Access modifier changed
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar ;
        if (sayfaSayisi < 1) {
            System.out.println("Lütfen pozitif bir değer giriniz : ");
        }else {
            this.sayfaSayisi = sayfaSayisi;

        }
    }
}
```

Sınıfa ait değişkenlerimin izinlerini **private** yaparak bu sorunu çözdük ama, biz book nesnesine ait değişkenlere erişimi tamamen kısıtladık. Yani biz oluşturduğumuz nesneye ait sayfa sayısını ekrana bastıramayız çünkü değişken **private** olarak tanımlandı. Ya da sayfa sayısı yanlış girilmiş bir nesneyi daha sonrasında düzenleyemeyiz. Bu sorunu çözmek için sınıfa ait değişkenlerimizi sarmalayarak, sınıf içerisinde ki metotlar yardımı ile değişkenlerimizi koruma altına alıyoruz ve kullanıma sunuyoruz. Bu metotlara sonrasında ismini çok duyacağımız **Getter ve Setter** metotları diyoruz.

### Getter ve Setter Metotları

#### Getter

Sınıfımıza ait **private** değişkenler mevcut. Bu değişkenlere dışarıdan erişebilmek için her bir değişkenimiz için **Getter** metodu yazmalıyız. Nesneye ait bu metot çağrıldığında geriye bir değer döndürmeli ve bu değer bizim istediğimiz private değişken olmalı. **sayfaSayisi** değişkeni için getter metodu tanımlayalım,

```java
public class Kitap {
    // Nitelikler
    private int sayfasayisi ; 
    private String kitapAdi, yazar; 

    // Constructor
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar ;
        if (sayfaSayisi < 1) {
            System.out.println("Lütfen pozitif bir değer giriniz : ");
        }else {
            this.sayfaSayisi = sayfaSayisi;

        }
    }
    // Getter
    public int getSayfaSayisi() {
        return this.sayfaSayisi;
    }
}
```

Görüldüğü gibi basit bir metot yardımı ile sınıfa ait **private** değişkenimize ulaşabildik. Burada dikkat edilmesi gereken noktalar **getter** metotları **geri dönüşü olan** metot tipindedir ve isimlendirilmesi ise get ile başlayıp sonra değişken ismi yazılmalıdır. İsimlendirmeyi bu şekilde yapmasak da çalışacaktır lakin kodun okunabilirliği adına bu kurala uyulması gerekir.

#### Setter

Biz **getter** metodu ile **private** olan değişkenimize ulaştık.Peki bu değişkenin değerini değiştirmek istediğimizde ne yapmalıyız ? Bir sınıfa ait **private** bir değişkenin değerini değiştirmek için, **setter metodu** yazılmalıdır. **sayfaSayisi** değişkeni için setter metodu yazalım.

```java
public class Kitap {
    // Nitelikler
    private int sayfasayisi ; 
    private String kitapAdi, yazar; 

    // Constructor
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar ;
        if (sayfaSayisi < 1) {
            System.out.println("Lütfen pozitif bir değer giriniz : ");
        }else {
            this.sayfaSayisi = sayfaSayisi;

        }
    }
    // Getter
    public int getSayfaSayisi() {
        return this.sayfaSayisi;
    }

    // Setter
    public void setSayfaSayisi(int number) {
        if (number > 1) {
            this.sayfaSayisi = number;
        } else {
            System.out.println("Negatif bir değer girdiniz.");
        }
    }
}
```

Setter metodunu modifiye ederek nesnemiz için anlamsız olan durumu ortadan kaldırmış olduk. Setter metodunun genel özellikleri ise , geriye bir değer döndürmeyen metot olması ve isimlendirme yaparken başlangıç olarak set yazıp sonrasında değişken ismini yazmaktır.

Son Hali :

![Encapsulation](http://www.plantuml.com/plantuml/png/RP4nJyCm48Nt-nL7fbOqKXUMJ4KiY0mWCZ5UcgCrIMnaNq6cuh_ZSAf8BDRtllTP9--2a9VJEC2L77ba33tB_XZXRg0Gi3P2xtY64eqL31HVgQ5eWab98zxO0_OJSjlDaaXVvE5QnwiCs-IcpMAsJhi3ouLUhR52xRNu6sgNP5gyJEib7bZgYqT3j3Jon7muqodHp8H9XlOqjkmNZBh_LNp3O_l6Uy7MkHxFa1sBLN5FtaTySYBi2yXkn-fckuNv_MdnKEEp-nnIL2I__a1P_hu0ExPT-gmV)

---

## Inheritance
