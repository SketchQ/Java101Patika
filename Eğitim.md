# Java Eğitim Notları

## Java Nasıl Çalışır?

Yazmış olduğunuz Java kodu derlendikten sonra Bytecode çevirilir. Bytecode JRE (Java Runtime Environment — Java Çalışma Ortamı) tarafından sunulan JVM (Java Virtual Machine — Java Sanal Makinesi) ile kullanılan sisteme uygun hale getirilerek çalışır. Java’nın platformdan bağımsızlığı sağlanmış olur. Yazdığımız kodlar makinede değil makine üzerinde kurulu olan JVM tarafından çalıştırılır.

![Java](https://miro.medium.com/max/380/0*sidc8XMCMPvSTz26.png)

## İlk Program Hello World

```java
public class HelloWorld {
    public static void main (String[] args) {
        Systemm.out.print1n("Hello World!");
    }
}
```

Public class HelloWorld sınıfımızın ana gövdesidir. **public**, değişkeni bir erişim metodudur.

Uygulamalarda main metodunun public olmasındaki neden budur.

**static**, sınıf tarafından paylaşıldığını belirtir.

**void**, main metodunun ekrana yazdırma dışından geri değer döndürmediğini ifade eder.

Java'da tüm uygulamalar ***main*** metotundan başlar.

**String args[]:** Parantezin içinde yöntemin aldığı parametreleri belirleriz.

* *"String"* sınıf adı,
* *"args"* da parametre adıdır.
* "[]" ise args'ın bir dizi(array) olduğunu belirtiyor.

Süslü parantezlerin içi programımızı içeren kısımdır. Bu süslü parantezler içinde yazılan her kod çalıştırılır.

* System.out.print(); Ekrana yazdırmak için kullanılır.
* System.out.print();System.out.println();System.out.printf();  olmak üzere **3** farklı şekilde kullanımı vardır.
  * **System.out.println();** İfadesi ekrana yazdırılacakları satır atlayarak yazdırır.
  * **System.out.print();** ifadesi ekrana bitişik yazılar yazdırır.
  * **System.out.printf(cıkıs formatı, cıktı alınacak ifade);** Kalıbına uygun çalışır.

### Kaynak

>[Java Temel Bilgiler](https://medium.com/gokhanyavas/java-temel-bilgiler-b1f82b9fed99)
