# OOP Nedir? Sınıf ve Nesne Nedir?

## Nesne Yönelimli Programlama Nedir?

* Programlar, problemi çözen *araçlardır*.

* Problemi çözenler ise *insanlardır*.

        Bilgisayar Dili (Machine Code) ===== > İnsan Dili =====> Bilgisayar Dili

### Programlama Paradigmaları

1. Emirli Programlama --> Prosedürel --> Yapısal --> OOP

1. Bildirimli Programlama --> Fonksiyonel --> Mantıksal

### OOP Nedir?

**Nesne Yönelimli Programlama (Object Oriented Programming)**, sınıflar ve nesneler kavramına dayanan bir programlama yaklaşımıdır. Bu yaklaşımın amacı, ihtiyaç duyulan programı daha küçük parçalara bölerek, yönetilebilir ve yeniden kullanılabilir hale getirmektir. Her küçük parçanın kendine ait özelliği, verileri ve diğer küçük parçalarla nasıl iletişim kuracağı bilgileri bulunur.

NYP’de programlar, nesnelerin birbirileriyle etkileşime geçmeleri sağlanmasıyla tasarlanır. Bizler gerçek hayattaki karmaşıklığı bir şekilde modelleyerek bunu bilgisayarın anlamasını sağlamaktayız. Modelleme, insanın problem çözmek üzere eskiden beri kullandığı bir yöntemdir. Büyükçe bir problemin tamamını zihinde canlandırıp çözmeye çalışmak yerine, oluşturulacak model ya da modeller üzerinde hedef sistemin görünüşü, davranışı ya da bazı durumlarda verdiği tepkiler gözlemlenebilir.

Nesne Yönelimli Programlama ile bizler yapacağımız her şeyi bilgisayarın anlayacağı şekilde modelleyip, **“nesne”** halinde aktarıyoruz. Böylelikle gerçek hayatta bizim için geçerli olan nesneleri artık bilgisayarların anlayacağı hale getirmiş oluyoruz. Tabi ki kullanılan programlama dilinin bizlere verdiği imkanlar dahilinde. Böylelikle kodlayan kişi ile bilgisayar arasında dilden bağımsız bir anlaşma, bir felsefe ortaya çıkmış oluyor. Artık bizim için “araba” nesnesi ne anlama geliyorsa, bilgisayar için de aynı anlama geliyor.

    Object -> Class --> Inheritance ---> Polymorphism ----> Abstraction -----> Encapsulation

### Neden Nesne Yönelimli Programlama? (NYP == OOP)

* NYP, hızlı ve uygulaması kolay bir yaklaşımdır.
* NYP, programlar için net bir yapı sağlar.
* NYP, "Don't Repeat Yourself" yani "Kendini Tekrar Etme" ilkesini uygular ve kodun bakımını, düzenlenmesini ve hata ayıklamasını kolaylaştırır.
* NYP, daha az kod ve daha kısa geliştirme süresiyle, yeniden kullanılabilir uygulamalar oluşturmayı mümkün kılar.
* NYP, yapıya daha sonradan yeni özellikler ekleyerek genişletilebilirlik sağlar.
* NYP, problemleri gerçek hayattaki işlemlere göre modeller.

## Sınıf ve Nesne Kavramları

### Nesne (Object) Nedir?

Bildiğimiz gibi her nesnenin kendine ait *nitelikleri ve davranışları* vardır. Nesneler birbirlerinden farklıdır ve kendi varoluşlarına göre davranırlar ve kendi kimliklerine sahiptirler.

* **Nitelik :** Nitelik kavramı, bir nesnenin özellikleridir ve nesnenin mevcut durumunu tanımlar. Mesela bir ördeğin rengi ve ağırlığı o ördeğin nitelikleridir. Bir ördeğimizin rengi siyah, diğer ördeğimizin rengi beyazdır. Bu durumda her iki nesne (yani ördek) nitelikleri sebebi ile birbirilerinden bağımsızdırlar.

* **Davranış :** Bir nesnenin kendine özel yaptığı eylemlerdir. Yine ördek örneğine bakarsak, bir ördek uçabiliyorken diğer bir ördek fiziksel durumu gereği uçamayabilir.

### Sınıf(Class) Nedir?

NYP sınıflar ve nesneler üzerine kurulmuştur, *"Sınıflar"* bir problemi soyutlamak ve genelleştirmek için kullanılan yapılardır veya *kılavuzlardır*. Sınıflar, bir nesneye ait tüm özellikleri temsil eder. Bu özellikler nesnenin ne tür **nitelikleri ve davranışları** olacağını belirler.

Mesela **"Araba"** bir sınıftır. Arabalara ait nitelikler **renk, hız, vites sayısı, yakıt türü vb.** bir sürü nitelik olabilir. Park sensörü, oto pilot, hız sabitleme gibi arabaların kendilerine özel davranışları da olabilir. Bir araba üretilirken, bir yapım kılavuzuna ihtiyaç vardır. Programlama da bu kılavuzlara **"Sınıf (Class)"** denir.

![Class](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/sinif-ve-nesne-kavramlari/figures/car.png)

---

#### Örnek : Banka Sınıf Tasarımı

![Banka Sınıf](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/sinif-ve-nesne-kavramlari/figures/banka-class.jpg)

#### Örnek : Banka Nesne İlişkileri

![Nesne ilişkiler](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/oop/sinif-ve-nesne-kavramlari/figures/banka-object.jpg)
