# Karşılaştırma Operatörleri

| Operatör | Açıklama | Örnek |
| -------- | -------- | ------|
|   ==     |  Eşittir | a == b|
|   !=     |  Eşit değildir | a != b|
|   >     |  Büyüktür | a > b|
|   <     |  Küçüktür | a < b|
|   >=     | Büyük eşittir | a >= b|
|   <=     |  Küçük Eşittir | a <= b|

## Örnek

```java
// Operatörlerden bahsetmeden önce 4 adet değişken tanımlayıp, bunlara değere atayalım ve ilişkisel ifalerimizi bu değişkenler üzerinden karşılaştıralım.
//Bu karşılaştırmaları yaparken matematiksel ifademizi cümle haline getirip bu cümlenin doğruluğunu ve yanlışlığını test edeceğiz.

int A = 10;
int B = 20;
int C = 10;
int D = 40;

```

## == (Eşitlik Operatörü)

```java
/** ( A == B); Matematiksel ifademizi cümle haline getirelim. (10 eşittir 20) bu cümle yanlış bir cümledir. 10 sayısı 20 sayısına eşit olamayacağından sonucumuz yanlış yani false'tur.

Aynı cümleleri diğer matematiksel ifadelerimiz içinde yazalım.
*/
(A == C) ;// (10 Eşittir 10) evet bu cümle doğrudur.
( C == D) ; // (10 Eşittir 40) bu cümle yanlıştır ve cevabımız false.
```

## != (Eşit Değil Operatörü)

```java
(A != D) ; /** (10 eşit değildir 40) Evet 10 sayısı 40'a eşit değildir. Bu yüzden bu işlemin sonucu True.
*/
(A != C); // (10 eşit değildir 10) Bu cümle doğru değildir ve işlemin sonucu False.
( C != B); // (10 eşit değildir 20) True.
```

## > (Büyüktür Operatörü)

```java
(A > D); // (10 büyüktür 40) False.
(D > C); // (40 büyüktür 10) True.
(C > B); // (10 büyüktür 20) False.
```

## >= (Büyük Eşittir Operatörü)

```java
( A >= D); // (10 büyük eşittir 40) False.
( A >= C); // (10 büyük eşittir 10) True.
( C >= B); // (10 büyük eşittir 20) False.
```

## < (Küçüktür Operatörü)

```java
( A < D ); // (10 küçüktür 40) True.
( D < C); // ( 40 küçüktür 10) False.
( C < B); // (10 küçüktür 20) True.
```

## <= (Küçük eşittir Operatörü)

```java
( A <= D); // (10 küçük eşittir 40) True.
( A <= C); // (10 küçük eşittir 10) True.
( C <= B);// (10 küçük eşittir 20) True.
```
