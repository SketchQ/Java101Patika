# Main Metodu ve Kullanımı

Java'da bir program çalışacağı zaman, kodlar ilk olarak main metodu içerisinden başlar. Main metodu sayesinde derleyiciye, programı buradan başlatılması konusunda referans oluşturulur.

```java
public class JavaPatika{
    public static void main(String[]args){
        System.out.println("Hello World!");
    }
}
```

Artık program çalıştığında derleyici ilk olarak **main metodu** okuyup sonrasında gerekli işlemleri yapıcaktır.

Main metodu yazılırken, args yerine başka bir isimlendirme yapılabilir. Ancak genellikle args sözcüğü kullanılır.  
Arguments ile ifade edilen kısım, sınıf çalıştırılırken JVM tarafından bu sınıfa verilen parametrelerdir.

## Kaynak

> [Main Metodu](https://app.patika.dev/moduller/java101/main-metodu)
