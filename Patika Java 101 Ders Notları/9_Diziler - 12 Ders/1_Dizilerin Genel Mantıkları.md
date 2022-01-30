# Diziler

## Dizilerin Genel Mantıkları

Java'da Diziler (Array), her değer için ayrı değişkenler oluşturmak yerine, birden çok değeri tek bir değişkende depolamak için kullanılır.

Dizileri aynı türden elemanları gruplamak için kullanırız.(data type)

Dizinin içersindeki elemanlara indeks numarasıyla ulaşır ve değiştiririz.

Çok boyutlu dizilerde mevcuttur. 2 boyutlu dizilere matris denir.

Diziler sabit boyutludur ve tanımlanırken boyutlarını belirtmek zorundayız.

![Array](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/array/figures/array.jpg)

Yukarıdaki örnek 10 eleman boyutunda "Integer" veri tipi tutan bir dizidir. Dizilerdeki herhangi bir elemana ulaşmak için indis numaraları kullanılır. Dizi indisleri her zaman 0'dan başlar o yüzden dizinin son elemanının değeri, dizi boyutuna eşit değildir ve bu dikkat edilmesi gereken bir konudur.

Diziler Heap Hafıza bölgesinde yer kaplarlar.

```java
double[] myList; // Tercih edilen yol

// veya

double myList[]; // bir başka yol

```

Diziler veri tipi ve [] parantezler ile belirtilir. Yukarıda iki farklı tanımı görülmektedir. Hafızadan yer alıp diziye alan ayırabilmek için "new" anahtar kelimesi kullanılır.

```java
double[] myList = new double[10];

```

Yukarıda maksimum 10 eleman alabilen "double" veri tipinde olan bir dizi oluşturulmuştur.

Java'da dizilere değer vermek

```java
// Java'da diziye ilk değerler süslü parantez içerisinde verilir.
double[] myList = {1.0, 2.0, 3.0, 4.0, 5.0};

// For döngüsü kullanarak listeye eleman ekleme
int[] list = new int[10];
for (int i = 0; i < list.length; i++) {
    list[i] = (i*10) + 10;
}

// While döngüsü kullanarak listeye eleman ekleme
int[] newList = new int[10];
while (newList.length > 0) {
    newList[newList.length - 1] = newList.length * 10;
    newList = Arrays.copyOf(newList, newList.length - 1);
}
}

// tüm dizi elemanlarını arada boşluk bırakarak yazdırır.
for (int i = 0; i < myList.length; i++) {
    System.out.print(myList[i] + " ");
}

```

### Dizileri Fonksyiyonlara Parametre olarak Gösterme

```java
// Static bir fonksiyon içerisine int veri tipinde bir dizi input edelim.
public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}

```

Java'da tüm değişkenler "Pass by Value" yöntemiyle geçilir. Bu şu demektir. Sizin tanımladığınız değişkenin, nesnenin veya dizinin birebir kopyası oluşturulur. Bu kopya değer fonksiyona yerel değişken olarak gider.

### Dizileri Fonksiyonlardan Geri Döndürmek

Fonksiyonlar belli bir işi yapıp sonucunda değer dönebilen veya dönmeyen kod bloklarıdır. Fonksiyonlar için altın kural, her fonksiyonun tek bir işi olmalıdır. Örneğin: dizi ortalaması alma işi yapan bir fonksiyon dizileri ekrana yazdırma işini yapmamalıdır. Veya dizilerin ortalamasını alma işi ile dizileri toplama işlemi aynı fonksiyon içinde olmamalıdır. Her biri ayrı fonksiyonlar olmalıdır.

```java
// Parametre olarak array alıp tersine çeviren metot(fonksiyon) yazalım.
public static int[] reverse(int[] list) {
    // girilen dizinin boyutu kadar yeni bir dizi oluşturalım.
    int[] result = new int[list.length];

    // For döngüsünde 1 den fazla değer atayabiliriz
    for (int i = 0, j =list.Lenght - 1; i < list.length; i++, j--) {
        result[i] = list[j];
    }

    return result;
}

```

#### Test

**Soru 1/3**  
Diziler hakkında hangisi yanlıştır?  
**Cevap**: Dizilerin içerisinde farklı veri tipleri tutabilir.  
**Soru 2/3**  
Dizilerde indis numarası nerden başlar?  
**Cevap**: 0'dan başlar.  
**Soru 3/3**  
Java'da bir değişkenin dizi olduğunu hangi sembol ile belirtiriz?  
**Cevap**: []  

## Tek Boyutlu Diziler
