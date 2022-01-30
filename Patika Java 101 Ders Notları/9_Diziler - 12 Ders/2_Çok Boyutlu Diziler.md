# Diziler

## Çok Boyutlu Diziler

Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve **matris** olarak adlandırılırlar. Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken, matrisler **tablo** şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek satır ve sütun sayısını girmemiz yeterli olacaktır.

İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar. Dizide tutulacak veri tipleri aynı olmak **zorundadır** farklı veri tiplerini aynı matriste tutamayız.

3x3 boyutunda bir matris örneği :

![3x3 Matris](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/2D-array/figures/matris.png)

Şehirler arasındaki mesafeyi gösteren bu tabloyu uzaklık değişkenimizde sakladık.

Mesafe Tablosu(KM):

![Mesafe Tablosu](https://patika-prod.s3-eu-central-1.amazonaws.com/content/modules/java101/lessons/2D-array/99XX9zDLm2CCLNvCc)

```java
// Yukardaki tablonun kod içerisindeki yazılımı
int[][] uzaklik = {
    {0 , 453 , 939 , 243 , 783 , 891},
    {453 , 0 , 490 , 384 , 620 , 439},
    {939 , 490 , 0 , 839 , 863 , 423},
    {243 , 384 , 839 , 0 , 544 , 823},
    {783 , 620 , 863 , 544 , 0 , 1045},
    {891 , 439 , 423 , 823 , 1045 , 0}
};
```

### İki Boyutlu Dizi Tanımlama Yöntemleri

```java
// İki boyutlu dizi tanımlama yöntemleri
// 1. Yöntem
// VariableType[][] arrayName;
int matrix[][];

// Ya Da
// VariableType arrayName[][]; Bu yöntem tercih edilmez.

// 2. Yöntem
// İki boyutlu dizi tanımlarken değer atayabiliriz.
int[][] array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// 3. Yöntem
int matrix[][] = new int[3][4]; // 3 satırlı 4 sütünlü bir matris oluşturur.

// Ya Da

matrix = new int[3][4]; // 3 satırlı 4 sütünlü bir matris oluşturur.

// Oluşturulan matriks değişlenin default değeri aşağıdaki gibidir.

[0][1][2][3]
[0] 0  0  0 
[0] 0  0  0
[0] 0  0  0

```

Yukarıdaki matrisin indeks numaraları aşağıdaki gibidir.

![Index](https://patika-prod.s3-eu-central-1.amazonaws.com/content/modules/java101/lessons/2D-array/xFvw37BFpnfMqPEi3)

```java
matrix[1][2] ; // 2. satırın 3. sütünün değeri
matrix[0][3] ; // 1. satırın 4. sütünün değeri
matrix[2][0] ; // 3. satırın 1. sütünün değeri

// 2.satırın ve 3.sütunun değerini 7 yapalım

matrix[1][2] = 7;
```

Şimdi güzel bir örnek yapalım. 3 satırdan ve 4 sütundan oluşan bir matris yaratalım ve bu matrisin elemanlarını sırayla 1’den başlayacak şekilde dolduralım.

```java
int matrix[][] = new int[3][4];
int number = 1;

for (int x = 0; x < matrix.lenght; x++) {
    for (int y = 0; y < matrix[x].length; y++) {
        matrix[x][y] = number;
        number++;
    }
}

// Burada önemli olan matris elemanlarına ulaşmak için iç içe 2(iki) adet for döngüsü kullanılır.
```

Yukardaki Kod çalıştığında output olarak şu şekilde bir matris elde edilir.

![Output](https://patika-prod.s3-eu-central-1.amazonaws.com/content/modules/java101/lessons/2D-array/EXJKTWeXr89EButRY)

### İç İçe döngülerler dizilere erişim ve dizi işlemleri

```java
// Aşağıdaki kod matrisi ekrana nasıl yazdıracağımızı gösterir
for (int row = 0; row < matrix.lenght; row++) {
    for (int column = 0; column < matrix[row].length; column++) {
        System.out.print(matrix[row][column] + " ");
    }
    System.out.println();
}
```

### İki boyutlu dizilerin Uzunlukları

Örneğin x = new int[3][4] arrayinin x[0], x[1], x[2] değerleri tek boyutlu dizidir. Ve her biri aşağıdaki şekilde gösterildiği gibi 4 elemanı vardır. x.length değeri 3'tür, yani bize sahip olduğu 3 satırın değerini verir. Sütun sayısına ise her hangi bir satır değerinin uzunluğu kadardır. x[2].length değeri 4'tür.

![Matrix uzunluk](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java/java-101/matris-islemleri/figures/matrices_5.PNG)

```java
public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {
    // firstMatrix.lenght ile ilk matrisin satır sayısını buluyoruz.
    // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz.

    // C Matrisi olacak olan matrisi tanımlıyoruz

    double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

    // Matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
    for (int row = 0; row < result.lenght; row++) {
        for (int col = 0; col < result[row].lenght; col++){
            result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
        }
    }
    
    return result;
}

double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
    // A matrisin satırı ile B matrisin sütunu çarpma işlemi.
    /*
    row = 3, col = 4 olarak gelecektir.
    i = 0 ise
    firstMatrix[3][0] * secondMatrix[0][4]
    i = 1 ise
    firstMatrix[3][1] * secondMatrix[1][4]
    i = 2 ise
    firstMatrix[3][2] * secondMatrix[2][4]
    şeklinde i değişerek satır ve sütun çarpılır.
    */
    double cell = 0;
    for (int i = 0; i < firstMatrix[row].length; i++) {
        cell += firstMatrix[row][i] * secondMatrix[i][col];
    }
    return cell;
}
```

Yukarıdaki “multiplyMatrices” fonksiyonu iki tane matrisi girdi olarak alır. Fonksiyon matrislerin çarpım sonucunu matris olarak döndürür.

“multiplyMatrices” fonksiyonu içinde bir başka fonksiyon daha çağrılmıştır. “multiplyMatricesCell” bu fonksiyon ise iki matrisin satır ve sütununu çarpıp sonucu double tipte bir değer döndürür.

### Sütun kapasiteleri Farklı Matris Oluşturmak - Düzensiz Diziler (**Ragged Array**)

Yukarıdaki örneklerde matrisin sütun sayısını 4 olarak belirledik. Bu şekilde oluşturulursa matrisin bütün satırları 4 elemanlı olur. Fakat bu zorunlu değildir. Matris oluştururken sütun sayısı belirlemezsek, her bir satırdaki dizilerin kapasitesi farklı olabilir.

```java
int[][] matrix = new int[3][];
matrix[0] = new int[4];
matrix[1] = new int[5];
matrix[2] = new int[6];
```

Burada önce 3 satırdan oluşan bir matris belirttik, fakat sabit bir sütun sayısı vermedik. Sonra her bir satır için ayrı ayrı sütun sayısı belirledik.
Çok boyutlu dizi oluştururken, yalnızca ilk boyutun (en soldaki) kapasitesini belirlemeniz yeterlidir. Diğer boyutların kapasitesini dinamik olarak belirleyebilirsiniz.

Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.

```java
// matrix oluşturma ve Scanner sınıf alma
int matrix[][] = new int[5][5];
Scanner scanner = new Scanner(System.in);
// Asking the user for the matrix values
System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns");
// Filling the matrix
for (int i = 0; i < matrix.lenght; i++) {
    for (int j = 0; j < matrix[i].lenght; j++){
        matrix[i][j] = scanner.nextInt();
    }
}
```

İstediğiniz boyutta matris oluşturarak matris değerlerine 0 - 99 arası random sayılar üreterek matrise atama yapınız.

```java
int matrix[][] = new int[5][5];
for (int i = 0; i < matrix.lenght; i++) {
    for (int j = 0; j < matrix[i].lenght; j++){
        matrix[i][j] = (int)(Math.random() * 100);
    }
}
```

Aşağıdaki kod bloğunun çıktısı nedir?

```java
int[][] array = {
    {1 , 2},
    {3 , 4},
    {5 , 6}
}

for (int i = array.lenght - 1; i >= 0; i--){
    for (int j = array[i].lenght - 1; j >= 0; j--){
        System.out.print(array[i][j] + " ");
    }
    System.out.println();
}

// Cevap

/* 6 5 
   4 3
   2 1 
*/
```

#### Test

**Soru 1/3**  
Çok boyutlu dizilerde satır ve sütun indis (index) numaraları ___ ile başlar.
**Cevap**: 0
**Soru 2/3**  
Aşağıdaki Programın Çıktısı Nedir?

```java
int[][] numbers;
numbers = new int[3][];
numbers[0] = {1, 2};
System.out.println(numbers[0][1]); 
// hata Verir
```

**Soru 3/3**  
Aşağıdaki Programın Çıktısı Nedir?

```java
public class PatikaDev {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        int sum = 0;
        for (int i = 0; i &lt;3; ++i) {
            for (int j = 0; j &lt; i + 1; ++j) {
                arr[i][j] = j + 1;
            }
        }
        for (int i = 0; i &lt; 3; ++i) {
            for (int j = 0; j &lt; i + 1; ++j) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum); 

    }
}
// 10
```
