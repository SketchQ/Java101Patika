# Değişken ve Veri Tipleri

Değişkenler = Variables

* Değişkenlerin 4 özelliği bulunur;  
  * **Veri Tipi**
    * **Sayılar,Sözcükler ve programatik** olabilir.
  * **İsim**
    * Her değişkenin bir ismi vardır.
  * **Değer**
    * Her değişkenin değerini biz atarız.
  * **Adres**
    * Hafızada tutulan bir adresi vardır.

* Değişkenlerin 2 adet veri tipi vardır;
  * **İlkel Tipler (primitive)**
    * Java'da varsayılan olarak tanımlıdır.
    * Herzaman bir değere sahiptir.
    * Veri tipleri boyutu alacağı veri tipine bağlıdır.
  * **İlkel olmayan (non-primitive)**
    * Kullanıcının tanımladığı tiplerdir.
    * Değeri "null" (boş) olabilir.
    * Tümü aynı boyuta sahiptir.

## Java Değişken Tanımlama

```text
-veri tipi- -değişken ismi- = veri (değer)
```

İlk önce değişkenin veri tipini ve değişkenin ismini yazarız ve istenirse "=" eşittir ile değerini atarız.

```java
int number;
// number isminde, int veri tipinde bir değişken tanımlanmış
```

Veri tipleri aynı olan değişkenleri aynı satırda tanımlayabiliriz.

```java
int a,b,c;
// int veri tipinde 3 tane değişken tanımlanmış
```

Değişkeni tanımladıktan sonra, atma operatörü (Assign operator) "=" ile değişkene değer atayabiliriz.

```java
double pi; // ilk başta double türünde bir değişken tanımladık.
pi = 3.14; // Daha sonra bu değişkene bir değer atadık.
```

Yukardaki işlemi tek bir satırda da yapabiliriz.

```java
double pi = 3.14; // Hem tanımlama hemde değer atandı.
```

Aynı satırda, aynı türden birden fazla değişkene değer atanabilinir.

```java
int a = 1, b = 2;
// aynı satırda 2 adet int türünde değişken tanımlanıp ikisinede farklı değerler atandı.
```

**Değişkene verilen değer sonrasında değiştirilebilir, ama aynı isimde ikinci bir değişken oluşturulamaz ve hata alırız.**

*Hatalı Kullanım:*

```java
int a = 5; // a isminde bir değişken tanımlanmış
int a = 1; // Bu satır hataya neden olur, a değişkeni zaten var.
```

*Doğru Kullanım:*

```java
int a = 5; // a isminde bir değişken tanımlanıp değer atandı.
a = 1; // a değişkenin değeri değiştirildi.
```

## Java'daki İlkel Veri Tipleri

* **Tam Sayılar**
* **Byte**
* **Short**
* **Integer**
* **Long**
* **Float**
* **Double**
* **Char**(Strings)
* **Boolean**

### Kaynak

> [Değişkenler ve Veri Tipleri](https://app.patika.dev/moduller/java101/degiskenler-veri-tipleri)
