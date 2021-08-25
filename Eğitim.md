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

### Kaynak

>[Java Temel Bilgiler](https://medium.com/gokhanyavas/java-temel-bilgiler-b1f82b9fed99)
