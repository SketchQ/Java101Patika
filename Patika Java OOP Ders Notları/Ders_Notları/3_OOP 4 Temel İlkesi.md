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

Kalıtım, programlama ortamında da gerçek hayattaki tanımına benzer bir işi gerçekleştirir. Bir sınıfın başka bir sınıftan kalıtım yapması demek, kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını kendisine alması demektir. Kalıtımı yapan sınıfa **alt sınıf**, kendisinden kalıtım yapılan sınıfa **ata sınıf** dersek, ata sınıfta tanımlı olan her şeyin alt sınıf için de tanımlı olduğunu söyleyebiliriz.

Eğer bir A sınıfın B sınıfından kalıtım yapması isteniyorsa, aşağıda ki şekilde tanımlanır.

```java
public class A extend B {
    // code goes here
}
```

### Kalıtım Türleri

#### Tek Yönlü Kalıtım (Single Inheritance)

* Bir sınıfın başka bir sınıfı genişlettiği alt ve ata sınıf ilişkisini ifade eder.

![Single Inheritance](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl1.png)

#### Çoklu Kalıtım (Multiple Inheritance)

* Bir sınıfın birden fazla sınıfı miras almasını ifade eder; bu, bir alt sınıfın iki ata sınıfa sahip olduğu anlamına gelir.  
**Not : Java çoklu kalıtımı desteklemez. (Interface kullanılır)**

![Multiple Inheritance](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl2.png)

#### Çok seviyeli Kalıtım (Multilevel Inheritance)

* Bir sınıfa ait alt sınıfın başka sınıfları genişletmesine denir.

![Multilevel Inheritance](https://patika-prod.s3-eu-central-1.amazonaws.com/content/modules/oop/lessons/inheritance/zpxqtnLQrKGR5D2dh)

#### Hiyerarşik Kalıtım (Hierarchical Inheritance)

* Birden fazla sınıfın aynı sınıfı genişlettiği bir alt ve üst sınıf ilişkisini ifade eder.

![Hierarchical Inheritance](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl4.png)

#### Hibrit Kalıtım (Hybrid Inheritance)

* Programda birden fazla kalıtım türünün kombinasyonuna denir. Örneğin, A ve B sınıfı, C sınıfını genişletir ve başka bir D sınıfı, A sınıfını genişletir, bu bir hibrit kalıtım örneğidir, çünkü bu, tek yönlü ve hiyerarşik kalıtımın bir birleşimidir.

![Hybrid Inheritance](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java102/inheritance/figures/kl5.jpeg)

### Kalıtım'da Constructor Zinciri ve Super Anahtar Sözcüğü

Bir sınıfa ait nesne oluşturulurken, o sınıfın bir kurucusunun işletildiğini, kurucunun çalışması tamamlandıktan sonra bellekte artık bir nesnenin oluştuğunu biliyoruz. Kurucuları da nesneleri ilk oluşturuldukları anda anlamlı durumlara taşıyabilmek için kullanıyoruz. Bu durumda, eğer nesnesi oluşturulacak sınıf başka bir sınıfın alt sınıfıysa, önce ataya ait iç nesnesinin oluşturulması ve bu nesnenin niteliklerinin ilk değerlerinin verilmesi gerektiğini söyleyebiliriz.

İç içe nesnelerin oluşabilmesi için nesnelerin içten dışa doğru oluşması gerekir. İç-nesnenin oluşabilmesi için, nesnesi oluşturulacak sınıfa ait kurucu işletilmeye başladığı zaman ilk iş olarak ata sınıfa ait kurucu çağrılır. Eğer ata sınıf da başka bir sınıfın alt sınıfıysa, bu kez o sınıfın kurucusu çağrılır. Kurucu zinciri alt sınıftan ata sınıfa doğru bu şekilde ilerler. En üstte, kalıtım ağacının tepesindeki sınıfın kurucusunun çalışması sonlandıktan sonra sırası ile alt sınıfların kurucularının çalışması sonlanacaktır. Böylece iç içe nesneler sıra ile oluşturularak en son en dıştaki nesne oluşturulmuş olur ve kurucu zinciri tamamlanır.

### Super Kullanma

Eğer ata sınıfta varsayılan kurucu yoksa ve programcı alt sınıftaki kurucunun içinde ata sınıfın hangi kurucusunun çağrılacağını belirtmezse derleme hatası alınacaktır. Çünkü derleyici aksi belirtilmedikçe ata sınıfın varsayılan kurucusunu çağıran super() kodunu üretecektir. Ata sınıfın hangi kurucusunun çağrılacağı, super anahtar sözcüğü ile birlikte verilen parametrelere göre belirlenir. Nasıl ki new işleci ile birlikte kullandığımız parametreler hangi kurucunun çağrılacağını belirliyorsa, super anahtar sözcüğü ile birlikte kullanılan parametreler de aynı şekilde ata sınıfın hangi kurucusunun işletileceğini belirler.

Son Hali:

![uml](http://www.plantuml.com/plantuml/png/RL59Rkf04DtNAVnt_-lBLuX8f8X5XYo856LPjWjJSWzE3vQSuIovGWx1mL8qZMW4Arxp1hrNNlY0BaIju4_OaARA3nJQpGojGk-hMpqgEnDL7r1NsAtiZ9sWG8hMrWYYUhGI0V-hdXtxl_y4jJnaD4lYi453ylhAaTS3TgJPpsHIQcDLrF8RpOH6F1qvJqjsXUM1T7H9tD4eTJKQmPeyChIes1VQf-stey1wQHrDGd7o3JZoevNqPpigD85JFSy6frSSotQUPSw-cLspNo465kbRvFTJvJqsHx721lUTBzI_OTNpziShqYcttrMJJ4FXnRhXBhgeeYuCopYHKJoSRcX8zRIpsOP2KaDvoxgEzUTLTVna5QIx7OZ3_m3d9ygI8WxojaiKvEa5dPy0vTRCfHPmjkcKXWMPBchr2m00)

---

## Polymorphism

**Polymorphism(çok biçimlilik)** NYP'de programlama dilinin farklı tip verileri ve sınıfları farklı şekilde işleme yeteneğini belirten özelliğidir. Daha belirgin olmak gerekirse, metotları ve türetilmiş sınıfları yeniden tanımlama yeteneğidir.

**Polimorfizm,** alt sınıfların ata sınıflardaki metotları geçersiz kılması(method overriding) sayesinde çok biçimli olarak davranmasına denir. Bu sayede alt sınıf ata sınıfından gelen davranışı kendine göre şekillendirebilir.

Metotlarda **"Geçersiz Kılma"** ise bir alt sınıfın içine doğrudan ya da dolaylı ata sınıflarından gelen bir(ya da daha fazla) yöntemin aynısının(aynı yöntem adı ve aynı parametre listesi) kodlanmasına verilen addır.

Polimorfizm sayesinde uygulamaların genişletilebilirliğini sağlarız ve bir ata sınıfın sunduğu yöntemleri geçersiz kılan alt sınıflar yardımı ile ata sınıfa göre kodlanmış tek bir kod kesimine farklı davranışlar yüklemek olanaklı olmaktadır. Öyleyse, elimizde esnek bir altyapı var demektir. Bu esneklik altyapıya yeni türlerin eklenmesi, kalıtım ve geçersiz kılma ilişkileri çerçevesinde oldukça kolaydır.

### Polymorphism Örneği

![örnek](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/polymorphism/figures/polimorfizm.jpg)

## Abstraction

Nesne yönelimli programlamada **Soyutlama (Abstraction)** ilkesi, eğer bir sınıf için nesne üretmek mantıksız geliyorsa o sınıf soyutlanabilir. Alt sınıfların ortak özelliklerini ve işlevlerini taşıyan ancak henüz bir **nesnesi olmayan** bir üst sınıf oluşturmak istenirse bir **soyut (abstract)** üst sınıf oluşturulur.

**Soyutlama,** bir sınıfa veya metoda temel görevlerin tanımlanması, detayların ise tanımlanmaması demektir. Temel olarak bir soruna ait çözüme giderken kullanılacak yöntemlerin, ilk etapta daha genel basit ve soyut bir tanımını yapmaktır.

### "abstract" Anahtar Kelimesi ve Soyut Sınıf Kavramı (Abstract Class)

Soyutlama kavramı sınıfın içindeki iç işleyişi dışarıdan izole etmek, yani gizlemektir.
Soyutlama yapabilmek için "abstract" anahtar kelimesi, "interface" gibi yapılar bizlere yardımcı olmaktadır.

Soyutlama için Java'da iki yöntem mevcuttur:

* "interface" tanımlamak
* "abstract" sınıf tanımlamak

### Soyut Sınıf (Abstract Class)

**"abstract"** anahtar kelimesi ile tanımlanan sınıflardır. Sınıfın içinde soyut ("abstract") metotlar veya normal fonksiyonlar tanımlanabilir. Soyut sınıflardan **"new"** anahtar kelimesi ile bir nesne oluşturulamaz.

#### Soyut Sınıf Özellikleri

* **"abstract"** anahtar kelimesi ile tanımlanmış olması gerekiyor.
* Soyut veya soyut olmayan fonksiyonlar tanımlanabilir.
* Soyut sınıflardan **"new"** anahtar kelimesi ile nesne oluşturulamaz.
* Kurucu metodu ve static fonksiyonlar tanımlanabilir.
* **"final"** kelimesi ile tanımlanmış fonksiyonları içerebilir. ***Bu final fonksiyonlar alt sınıflarda ezilemezler (override).***

```java
// abstract sınıf örneği

public abstract class Doping {
    protected double price ;
    protected double[] taxes ;

    public double[] getTaxes() {
        return taxes ;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes ;
    }

    public double getPrice() {
        return price ;
    }

    public void setPrice(double price) {
        this.price = price ;
    }

    // soyut metot örneği
    public abstract double calculate() {

    }
}
```

Yukarıda soyut bir sınıf tanımladık. "abstract" kelimesi ile sınıf tanımladık, ayrıca sınıfın içinde "calculate" isimli "abstract" metot tanımladık. Aynı zamanda soyut olmayan metotlar da tanımladık. Senaryomuzda bir e-ticaret sisteminde "Doping" tipinde ek ürünler olduğunu düşünelim. İlan tarihini güncelleyen bir doping çeşidimiz olsun, bir de üst sırada çıkmanızı sağlayan bir doping olsun. Bu iki alt sınıfta "Doping" isimli sınıftan kalıtım alarak belli özellikleri kendilerine alsınlar. ***Fakat, her dopingin ücret hesaplama yöntemi birbirinden farklı olabilir. Ayrıca, her dopingin mutlaka fiyat hesaplama fonksiyonu olmalıdır.***

Yukarıdaki durumda **"abstract"** sınıf tanımlayıp diğer doping çeşitleri bu ATA sınıftan kalıtım alacaklardır. **"calculate"** isimli "abstract" metodu, **"metod ezme" (overriding)** yöntemiyle *ezip metodun içini kendilerine göre dolduracaklardır*. Alt sınıflardaki diğer özellikler soyutlama tekniğiyle dış dünyadan gizlenecektir. Dış dünyadan dopingi kullanmak isteyen başka bir sınıf veya kod parçası doping nesnesi üzerindeki "calculate" fonksiyonunu çağırıp fiyatı hesaplayacaktır. Diğer iç hesaplama ve çalışma detaylarını bilmeyecektir.

```java
public class TopOfListDoping extends Doping {

    public TopOfListDoping(double price) {
        super.setPrice(price) ;
    }

    // "Doping" soyut sınıfından kalıtım ile gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor.
    @Override
    public double calculate() {
        return super.getPrice() + super.getPrice() * 0.35;
    }
}

public class UpdateDoping extends Doping {

    public UptodateDoping(double price, double[] taxes) {
        super.setPrice(price);
        super.setTaxes(taxes);
    }
    // Doping tiplerinde sadece "calculate" isimli fonksiyonu dış dünyaya açtık. Diğer tüm fonksiyonlar ve özellikler sınıf içinde kaldı.
    @Override
    public double calculate() {
        return calculateTaxes() + comisionRate();
    }

    private double calculateTaxes() {

        double totalTaxValue = 0;
        for (int i = 0; i < super.getTaxes().length; i++) {
            totalTaxValue += super.getTaxes()[i];
        }
        return totalTaxValue;
    }

    private double comisionRate() {
        return super.getPrice() * 0.2;
    }
}
```
