# Diziler

## Arrays Sınıfı ve Metotları

Java.util paketindeki Arrays sınıfı, Java Collection Framework'ün bir parçasıdır. Bu sınıf, Java dizilerini dinamik olarak oluşturmak ve bunlara erişmek için statik metotlar sağlar. Yalnızca statik metotlar ve Object sınıfının metotlarından oluşur. Bu sınıfın metotları, sınıf adının kendisi tarafından kullanılabilir.

```java
import java.util.Arrays;
```

### Arrays.toString()

Diziye ait elemanları ekrana basmak için kullanılır.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {3, 5 ,79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi));
    }
}

// Çıktısı
// [3, 5, 79, 12, 25, -3, 66, 82, -49, 152] 

```

### Arrays.fill()

Bu metot ile dizilerimizin belirli bölümlerine değerler atayabiliriz.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        // Çıktısı
        // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7); // 3. index'den 5. index'e kadar 7 değerini atar.
        System.out.println(Arrays.toString(liste2));

        // Çıktısı
        // [15, 1, 99, 7, 7, -22, 11, 2, -49, 52]

    }
}
```

### Arrays.sort()

Arrays.sort() metodu, dizi elemanlarını sıralamak için kullanılır. Küçükten büyüğe sıralar.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
    }
}
// Çıktısı
// [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]
```

### Arrays.binarySearch()

Elemanın indis değerini bulmak için binarySearch() metodu kullanılır. Ancak dizinin sıralı olması gerekir.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        // Çıktısı
        // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]

        int index = Arrays.binarySearch(liste, 33);
        System.out.println(index);

        // Çıktısı
        // 8
    }
}
```

### Arrays.copyOf() ve Arrays.copyOfRange() Metotu

Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır

Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.

```java
import java.utiil.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));

        // Çıktısı
        // [6, 1, 55]

        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0, 5);
        System.out.println(Arrays.toString(copyOfRangeArray));

        // Çıktısı
        // [6, 1, 55, 21, 33]
    }
}
```

### Arrays.equals() Metotu

Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println(Arrays.equals(list1, list2)); // True
        System.out.println(Arrays.equals(list1, list3)); // False
    }
}
```
