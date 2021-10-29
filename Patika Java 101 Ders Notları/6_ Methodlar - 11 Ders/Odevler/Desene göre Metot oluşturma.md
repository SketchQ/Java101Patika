# Desene Göre Metot oluşturma

Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir **"Recursive"** metot yazın.

* **Kural**: Girilen sayo 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

## Senaryolar

```txt
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16

N Sayısı : 10
Çıktısı : 10 5 0 5 10

N sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25

N Sayısı : 5
Çıktısı : 5 0 5
```

```java
import java.util.Scanner; 

public class RecursivePattern {

    static int pattern(int n1, int n2, int n3){
        System.out.print(n1 + " ");

        if(n1 > 0 && n3 == 1){
            return pattern(n1 - 5, n2, 1);
        }else if(n1 <= 0 && n3 == 1 && n1 < n2){
            return pattern(n1 + 5 , n2, 2);
        }else if(n1 > 0 && n3 == 2 && n1 < n2){
            return pattern(n1 + 5, n2, 2);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int num = input.nextInt();
        input.close();
        System.out.print("Çıktısı : ");
        pattern(num, num, 1);
    }
}
```

### Kaynak

[Patika](https://app.patika.dev/moduller/java101/odev-recursive-pattern)
