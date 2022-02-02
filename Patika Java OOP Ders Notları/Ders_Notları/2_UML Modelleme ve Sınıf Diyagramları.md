# UML Modelleme ve Sınıf Diyagramları

## Modelleme Nedir?

Gerçek hayattaki problemleri bilgisayarın sanal ortamında çözebilmek için, her şeyden önce problemin uygun şekilde bilgisayar ortamına aktarılması gerekmektedir. Bu işlem **“soyutlama (abstraction)” ya da “modelleme (modeling)”** olarak anılır.

## UML (Unified Modelling Language) Nedir?

UML’ in Türkçe deki karşılığı “Birleşik Modelleme Dili” olsa da aslında bir programlama dili değil yazılım mühendisliğinde nesne tabanlı modellemede kullanılan standart olmuş görsel modelleme dilidir. Bir yazılımın hayata geçirilmesinde farklı görev tanımlamaları bulunmaktadır (Tasarımcılar, programcılar, analistler, testçiler, kalite sorumluları, kullanıcılar) gibi. Bir yazılım için her kişinin farklı bakış açısı vardır. Müşteri açısından projeye baktığımızda müşteriyi işlerin sıralandırılması, sisteme artıları ve eksileri , işler arasındaki ilişkiler ilgilendirirken bir fonksiyonun detayları ilgilendirmemektedir. Analist açısından baktığımızda nesne özellikleri, fonksiyonlar ve alacakları parametreler yeterli iken tasarımcı açısından parametrelerin veri tipleri, fonksiyonun performansı, yaşam süresi gibi bilgiler de önemli olmaktadır.

Bu nedenle UML bu ekip için gerekli farklı diyagramlar içermektedir. Yazılım geliştirme işinde yer alacak farklı ekiplerin farklı bakış açılarına uygun farklı UML diyagramları bulunmaktadır.

### Neden UML ?

* Hataların kolaylıkla fark edilip en düşük seviyeye indirgenmesi.(Risk, zaman, maliyet)
* Kodlama kolaylığı sağlar.
* Kullanılan tekrar kod sayısı ayırt edilebilir bu sayede verim sağlanır.
* Mantıksal hataların minimum seviyeye düşürülmesini sağlar.
* Geliştirme maliyetinin düşmesini sağlar.
* Resmin tamamının görülmesini sağlar.
* UML diyagramları ile yazılım tamamını görebileceğimiz için verimli bellek kullanımı sağlanabilir.
* Karmaşık sistemlerde değişiklik yapmayı kolaylaştırır.
* UML ile dokümanlandırılmış kodları düzenlemek daha az zaman alacaktır
* UML diyagramlarını kullanan yazılımcılar aynı dili konuşacaklarından kolay iletişim sağlanır.

## UML Diyagram Türleri

![UML Diyagram Türleri](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/uml-class-diagram/figures/uml-diagramlar.jpg)

### Sınıf Diyagramları (Class Diagram)

Nesne yönelimli programlamada her bir nesnenin konseptini belirten yapılara sınıf (class) adı verilmektedir. Sınıflar çok farklı yapılarda ve işlevlerde olabilirler. Bununla birlikte, genellikle programlamada bütün iş tek bir sınıfın üzerine yüklenmez. Kuracağınız sistem ile ilgili önce temel sınıflar belirlenip daha sonra bunlar arasındaki bağlantıların açıklanması gerekir. Bunu bir yazılım geliştirme sürecinin tasarım aşamasında yaparız. Burada sınıfların modellemesi için UML kullanırız ve Sınıf Diyagramları adı veririz.

Programlamada sınıfların niteliklerini **"değişkenler"(Variables) , davranışlarını da "metotlar"(Methods)** tanımlar.

![UML](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuL8ioKZDJLKepaujISwerCqlBSd9p4lbKW22v9p4uc8eMGqKWO2mnABCnAISr685NGMDlCoIr9pCx9pK8asuWlXuEDCtjIGZFmMiqYMnh2WnxyZ6e_Dp4g6AQxaSKlDIW8u00000)

#### Örnek

![UML1](http://www.plantuml.com/plantuml/png/ROz1JWCn34NtFOKf4WA9Ng0BL37CcZEOYUb4IUoHxL1nUoAgKQHsbdR-y_ivcQDwBNdtu3CL0alaq_nxaEevCkq0eEqYBwXOu0kdT5Qf70R9el0uZkFxnt2Jcf73HQCxCRZMwn6Sl053DPT2-hzQ1pYymJxBEVBponwEK8sKiH0ymO9c5z7Gyj0p3UZm4OpCeZIN9E9L5d_GgIFtmYNZH9yQIDlpxPLNQ59IYFmjLtUFtnUGjFaVgRwQ-xYD1jgeV28EjUG_)

---

### Nitelikler (Değişklenler - Variables)

Syntax :

```uml
<Görünürlük><İsim>: <Tür><Multiplicity> = <Varsayılan Değer>
```

* **Görünürlük (Visibility):** Niteliğin dışarıdan erişim ilkesinin ne olduğunu belirtir. Eğer bir sınıfın niteliği public ise buraya “+“, private ise buraya “–“, protected ise buraya “#” işareti konulur.
* **İsim (Name):** Niteliğe ait isimlendirme yapılır.
* **Tür (Type):** Bir niteliğin veri tipini belirtir.
* **Varsayılan Değer (Default Value):** Niteliğin, ilk değerini belirtir.

### Davranışlar (Metotlar - Methods)

Syntax :

```uml
<Görünürlük><isim(<Parametreler>)> : <Geri Dönüş Tipi>

```

* **Görünürlük (Visibility):** Bu davranışın dışarıdan erişim ilkesinin ne olduğunu belirtir. Alabileceği değerler niteliklerde olduğu gibidir.
* **İsim (Name):** Metoda ait isimlendirme yapılır.
* **Parametre Listesi (Parameter List):** Programlamada metodun aldığı parametreler tür bilgileri ile birlikte buraya yazılır.
* **Geri Dönüş Türü (Return Type):** Metodun geri dönüş tipini belirtir.

![UML2](http://www.plantuml.com/plantuml/png/TSj1oi8m40NWVKynF_z6aOBhWb3GhIiFK68pc60o0vc9fOXtjwqG1V6jXlU-QKLDqXn3zQSE8u9SKNitrfmrUC8AflJ1YC0-YtB41FUvNB81CX4RE6doT2drFtXBt80d_Q36seGYNxg6o8JZmc47sp9qNJd5yN2SrMhTm8szVIz8zhNCxoPo9ftCcJaKCtXrXsI67-HHjKWsn_04)

## Sınıflar Arası İlişkiler

Yazılımlar çoğu zaman tek sınıftan oluşmazlar. Küçük programlar bile çoğu zaman birden fazla sınıfa ihtiyaç duymaktadır. Bir yazılımda sınıf sayısı arttıkça programın tasarlanması da karmaşıklaşır. Bu yüzden UML diyagramlar kullanılarak, bu karmaşıklığı daha olayın en başında minimuma indirip maliyeti azaltmaktır. Sınıflar birbirleriyle ilişki içerisinde olan yapılardır. Bu ilişkileri UML diyagramlarında da göstermek gerekir. Elbette ilişkinin türüne göre gösterim de değişiklik gösterecektir.

* Bağlantı İlişkisi (Association)
* Genelleme/Kalıtım İlişkisi (Generalization/Inheritance)
* Bağımlılık İlişkisi (Dependency) (Aggregation, Composition)
* Gerçekleştirim İlişkisi (Realization)

![Örnek](https://patika-prod.s3-eu-central-1.amazonaws.com/content/modules/oop/lessons/uml-class-diagram/KhNZmcdH84qJtKutw)

### Bağıntı İlişkisi (Association Class)

Sınıflar arasındaki ilişkiler çizgi ile gösterilir ve çizginin üstüne ilişki şekli yazılır. Sınıflar arası ilişkiler bire bir, bire çok, bire n gibi olabilir.

![UML3](http://www.plantuml.com/plantuml/png/DOfB2W8n44JtEKMPbOfPU8E1EO1U8KmQHamdq9-5Y7SNmgGM1LNlBMfPpBc6a-t417sJRVidTRVwQXJMcbMnkbfdac_0aPQPnlYDdWBYFI8XNYEUqejlDl1vyjkyBqW93oaaOQ5MdEiV)

Bu örnekte ise bir müşteri n tane ürün olabileceği gösterilmiştir. İki sınıf arasında yalnızca tek bir bağıntı çizilmesi gibi bir kısıt yoktur. En temel bağıntı ilişki tipleri aşağıdaki gibi listelenebilir;

* Bire-bir (1-1)
* Bire-çok (1-*)
* Çoka bir (* - 1)
* Bire-sıfır (1-0)
* Bire-Beş yada Bire-sekiz (1-5 veya 1-8)

Diğer bir ilişki türü ise bir sınıfın kendisiyle kurduğu ilişkidir. Bu tür ilişkiler genellikle bir sınıfın sistemde birden fazla rolü varsa ortaya çıkar. Bu tür ilişkilere **"reflexive associations"** denir.

![Reflexive Associations](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/uml-class-diagram/figures/c5.jpg)

### Sınıflar arasında Türetme (Inheritance) ve Genelleme (Generalization) İlişkisi

Nesne yönelimli programlamanın en önemli parçası türetme (inheritance)'dir. Türetme yoluyla bir sınıf başka bir sınıfın var olan özelliklerini alarak, o sınıf türünden başka bir nesneymiş gibi kullanılabilir. Bir sınıfın işlevleri türetme yoluyla genişletilecekse, türetmenin yapılacağı sınıfa taban sınıf **(super class)**, türetilmiş olan sınıfa da türemiş sınıf **(sub class)** denir. Şekilsel olarak türemiş sınıftan taban sınıfa bir ok olarak belirtilir.

![UML](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuL8ioKZDJLKepaujISwerCqlBSd9p4lbKW02vvp4ucA5e_DIipDpSbAB5Ag1eX2WhP2N2DHafH1SKfIPbmuMhmMJ2DKsDRgw2jw9HI1bgHKbgNafnTXKk6HcfnpULbIIdfg7Nw5ZJicHZQYg780aq0y0)

Bu örnekte "Şekiller" sınıfına ait tüm özellikler altında üretilmiş olan, diğer sınıflara aktarılmıştır.

### Bağımlılık ilişkisi (Dependency) ve Birleştirme (Aggregation, Composition)

Birden fazla parçadan oluşan sınıflar arasındaki ilişkiye **"Aggregation"** denir. Aggregation ilişkisini 'bütün parça' yukarıda olacak şekilde ve bütün parçanın ucuna içi boş elmas yerleştirecek şekilde gösteririz. İçi boş elmas ile gösterilen ilişkilerde her bir parça ayrı bir sınıftır ve tek başlarına anlam ifade ederler.

Örneğin Araba sınıfını 1 Motor, 5 Koltuk ve 4 Lastik sınıflarının oluşturduğunu düşünürsek aralarındaki ilişki aşağıdaki gibi gösterilir.

![UML](http://www.plantuml.com/plantuml/png/VSuX3W8n48LXtrCywYj8mA2M8853333fDjlj99rNmUqXmQt0_U8J_-IKph7MiEEigy8NvND-9nkifMcuL777kSj30e1VmL92t4VSZTPnWkJSDGkBjQqwHbojSYp_sI7Y9iwoPPEsrtVl0m00)

Asıl sınıf üretildiğinde parçaları da üretilecek ise bu ilişkiye Composite denir. Eğer Araba sınıfı oluşturulduğunda Motor, Koltuk ve Lastik sınıfları da oluşturulacak ise içi dolu dörtgen dolu olarak gösterilir.

### Gerçekleştirim (Realization) İlişkisi

Gerçekleştirim ilişkisi en çok kullanıcı arayüzlerinin **(user interface)** modellenmesinde kullanılır. Arayüz yalnızca method adlarını ve bunların parametrelerini içermektedir. Program yazarken, yalnızca arayüzlerin kullanılması ve arayüzü gerçekleştiren sınıfın diğer sınıflardan ayrı tutulması, yazılımın geliştirilmesi ve bakımında önemli kolaylık sağlar.

![UML](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuL8ioKZDJLKepaujISwerCqlBSd9p4lbyimhIIrAIqnELV3EF3e_CoUrIA6QIm4Aj1KIKuBpAnDJ5AmKWakAClFImLArOFBmj2FpYrBpaZCLTADJ4eipKbDYTVCHfY2fASbDpSEg2Ap6iJWJw4WS2XnIyrA0hWS0)

### Kaynak

[Univera](https://univera-ng.blogspot.com/2009/10/uml-ve-modelleme-bolum-1.html)

---

## Sınıf Diyagram Örnekleri

### Sipariş İşlemleri Sınıf Tasarımı

![Sipariş işlemleri Sınıf Tasarımı](http://www.plantuml.com/plantuml/png/ZPB9QiCm48RlVegfJrrGQAuz1P9BBrreNq1u9l4GBKOQKKpekxTE7A9WcTO7BzzlIVy_CwieEaYofhgHbYn1t9CqRQzy4iEEghNHCS8wHV6M0Xmg6Ay7O8GdO2SPSjhIBumIsEqohX43nLYIkjQxkJMtTzat8SiLG38aDABlu_tazZNWtrRFaPutizBBJ9ekU4oD55PgwvEJ2KOjmqORBVJ9blA2qTVHxJGfEm76QRWFySqU3l-oyvwqiFIb3CxdVnSBRZtojX-CN8x8zKY66YdfkT-tapHfn_NPNU1cAD7MU9rpwRlvuIXxPIoQpAivF2upNI_lQr1A1TwreXJKZul5ieRJ65K0unjuXUeSPy1ZAxmA5xmYXycQ7m00)

* 0 veya 1 müşterinin (Customer) en az 1 veya daha fazla siparişi (Order) olabilir.

* Siparişin(Order) ürünü (Product) vardır.

* Stoğun (Stock) ürünü (Product) vardır.

### Banka Yönetim Sistemi Sınıf Tasarımı

![Örnek](http://www.plantuml.com/plantuml/png/fLF1hjCm4BptAqnE3r2GuFWEgALmB1Vw0rjxbLYDrvMzReaG_uvZHBIfemgfkLYQyUxCpiRRo10ukM7pXdjqgE8PMVVZHkLlFq2CwWlGMVqgmFIzLzeRLA_A4Wjmy1hOUif4v62fcxbMEI3eCBwypUJLMoFA8keKB8zBxhUGtwV8tc5OM21mM2bb78m96ECQPOtpbMiDmNnFxeIXeYvP_EQ3MSpOMIfEJzuFbTFTyI1Drf48pdd2yKwpLP2ud_kBsno08kZIRE9NWzffxHFnCgVrsKum06ciS8CN7os_P5I1cxgjcBbPxas0cxZrs7AzMv7OKOmcdLjJkmEUB7_DXnGQBnFwZP8Jw5zViiMggzKz7i3Ilp3n9oEPETmdilslG7x0rL9NYp-xsGVYvPWVMPjQNrxy7HpQpzEsbcZpiL5jcuyFdvhPvAlg8PQkCoIQ2hHKXrp-hhdx4Sgr38d2pHR993Vy0G00)

* Bankanın (Bank) ATM, Müşteri (Customer), Hesap (Account) sınıfları vardır.
* 1 müşterinin (Customer) en az 1 en çok 2 hesabı (Account) olabilir.
* 1 hesap (Account) 0 veya daha fazla ATM işlemi yapabilir.
* Hesap (Account) sınıfına ait iki tane alt sınıf vardır, Ana Hesap (Main Account) ve Birikim Hesabı (Saving Account).

### Şirket Yönetim Sistemi Sınıf Tasarımı

![Uml](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/class-diagram-example/figures/company-systems.jpg)

*Şirketin (Company) 0 veya daha fazla departman (Department) ve ofisi (Office) vardır.
*Şirket (Company) olmadan departman (Department) ve ofis (Office) olamaz.
*Bir departmanın (Department) en az bir çalışanı (Employee) olmalıdır.
*Bir departman (Department) bir çalışan (Employee) tarafından yönetilir.
*Ofise (Office) ait bir merkez ofis (Headquarter) olabilir.

### Okul Yönetim Sistemi Sınıf Tasarımı

![uml](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/class-diagram-example/figures/school.jpg)

* 1 okulun (School) en az bir veya daha fazla departmanı (Department) olabilir.
* En az 1 veya daha fazla okulun (School) birden fazla öğrencisi (Student) olabilir.
* 0 veya daha fazla öğrenci (Student) , en az 1 veya daha fazla ders (Subject) alabilir.
* En az 1 veya daha fazla dersin (Subject), en az 1 veya daha fazla öğretmeni (Instructor) olabilir.
* Bir departmanın (Department) en az 1 veya daha fazla dersi (Subject) olabilir.
* Bir veya daha fazla departmana (Department), 1 veya daha fazla öğretmen (Instructor) atanabilir.

### Sipariş Yönetim Sistemi Sınıf Tasarımı

![uml](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/class-diagram-example/figures/order.jpg)

* Bir müşterinin 0 veya daha fazla siparişi olabilir.
* Bir siparişe ait sipariş detayı ve ürünleri olur.
* 1 siparişin birden fazla ödemesi olabilir.
* Nakit , Çek ve Kredi Kartı ödeme yöntemleridir.

## Ödev

### Üniversite Yönetim Sistemi

1 - Üniversiteye ait sınıflıklar, çalışma ofisleri ve departmanlar vardır.

2 - Departmanlara ait ofisler vardır.

3 - Üniversiteye ait çalışanlar vardır. Bu çalışanlar profesör veya memur olabilir.

4 - Her çalışan bir ofiste çalışır.

Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.

Not : Sınıflara ait nitelik ve davranışların belirtilmesine gerek yoktur.

![Cevap](http://www.plantuml.com/plantuml/png/ROrDgi9048JtSuf-sy1Su2qae2vSwSO334aD2SvFwEu80G-lZWGIaar3ytrLLOiwrZ46ywST8gXppGDiZi69q3trJx3qEXaYMhoKRMkfI9npbFzFJhQEfQltVODzNZfE61nhHD9zgVfAvpY4F045bhE8xUzSaeAzQx0EtpXxY6GMigDz7TRqrx9b1SuVMRRLF6Xgf7QCuGq0)
