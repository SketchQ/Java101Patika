# Mantıksal Operatörler

![Mantıksal Operatörler](https://evirtualguru.com/wp-content/uploads/2016/02/Java-fundamentals-operator-6.png)

## Doğruluk Tabloları

![Tablo](https://i.pinimg.com/originals/ce/43/b7/ce43b76b06f2e3e515d779950dc3c2a2.gif)

## Soru İşareti Operatörü

? işareti operatörü ile Java'da mantıksal kıyaslama yapılabilir. ? ifadesi Java'daki "if-else" yapısı yerine kullanılabilir. Tek satırda bunu yapabilmemizi sağlar. Kullanımı ise if'in içerisinde yer alacak ifadeyi soru işaretinden önce yazılır, ifadenin doğru olması durumunda yapılacak işlemler soru işareti ile iki nokta arasına yazılır. İfadenin yanlış olması durumunda yapılacaklar ise iki noktadan sonra yazılır.

### Kullanımı

```text
( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar
```

### Örnek

```java
public class Test{
    public static void main(String[] args){
        int a , b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b  = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);
    }
}
```

### Sonuç

```text
Value of b is : 30
Value of b is : 20
```

### Açıklama

b = (a == 1) ? 20: 30; => ifadesini incelenirse, (a == 1) ? 20: 30 ifadesinden başlamak daha doğru olacaktır. a'nın 1 olması durumunda 20 değeri, a'nın 1'den farklı olması durumunda 30 değeri dönecektir. b'nin değeri buradan dönen değere göre belirlenecektir. Kodda a değeri 10 olarak verildiği için b'nin değeri 30 olarak atanmaktadır.

b = (a == 10) ? 20: 30; => ifadesi incelenirse, yine yukarıdaki açıklamaya benzer olarak a değerinin 10 olması durumunda 20, a değeri 10'dan farklı olması durumunda ise 30 değeri geriye dönecektir. Bu durumda a değeri kodda 10 olduğu için b değeri de 20 olarak atanacaktır.
