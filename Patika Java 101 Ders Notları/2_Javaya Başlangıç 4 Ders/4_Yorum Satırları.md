# Yorum Satırları

## // ile yapılan yorumlar

Tek satırlık comment için o satırın başına // işareti yazılır.

```java
// bu bir yorum satırıdır
int number = 10; // number değişkenine 10 değeri atandı.
```

## /\*...\*/ ile yapılan yorumlar

Birden fazla satıra comment yazılma isteniyorsa /\* ve \*/ işaretleri kullanılır.

```java
/*
Birden fazla satırdan oluşan yorum satırlarıdır. Ancak yorumların bu şekilde ifade edilebilmesi için birden fazla satırdan oluşmaşına gerek yoktur.
*/
int number = 10; // Number değişkenine 10 değeri atandı.
```

## /\*\*...\*/ ile yapılan Açılamalar

Çoğu zaman uygulamaların raporlarının oluşturulması gerekir. Kod yazıldıktan sonra kodun içine yazılan açıklamalardan bir belge oluşturarak bu belgeyi raporun sonuna eklemek programcının yükünü hafifletecektir. İşte şimdi bahsedeceğimiz üçüncü yöntem bu amaçla kullanılır. /** ve */ işaretleri arasına yazılan açıklamalar bir takım özel etiketler içerebilir. Kod içi belgeleme, bu etiketleri tanıyan ve etiketlerden faydalanarak belge üreten bir aracın yardımı ile belgeye dönüştürülebilmektedir.
  
Bu tarzda yazılan açıklamalara Javadoc adı verilmektedir.Aşağıda bazı örnekleri verilmiştir:

![Javadoc](..\Eklentiler\Javadoc.png)

```java
/**
 * @author Erim Serdönmez - 27/08/2021
 */
public class AciklamaSatiriOrnegi{
    /**
     * Verilen sayının karekökünü bularak döndürür.
     * Sayının sıfırdan küçük olmadığını varsayar.
     * 
     * @param sayı karekökü alınacak sayı
     * @return Sayının karekökü
     */
    public double karekok(double sayi){
        double kkok = 0;
        // burada karekök bulma algoritmasının çalıştığını kabul edelim.
        return kkok;
    }
}
```
