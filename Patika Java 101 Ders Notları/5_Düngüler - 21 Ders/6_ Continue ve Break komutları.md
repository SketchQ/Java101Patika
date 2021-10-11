# Continue ve Break Komutları

## Continue

Döngü içerisindeki koşul oluştuğunda o döngüyü tamamlamadan döngünün başına geçer ve koşulu yeniden kontrol eder.

```java
int i = 0;
while ( i <10){
    i++;
    if ( i == 5){
        continue;
    }
    System.out.println(i);
}
```

Eğer i = 5 ise, i değişkenini ekrana print etmez.

## Break

Döngü break komutuna geldiğinde, döngü sonlandırılır ve koda kaldığı yerden devam edilinir.

```java
for ( int i = 0; i < 10 ; i++){
    if ( i == 5){
        break;
    }
}System.out.println(i);
```

I değişkeni 5'e eşit olduğunda döngü sonlandırılır ve devam etmez.
