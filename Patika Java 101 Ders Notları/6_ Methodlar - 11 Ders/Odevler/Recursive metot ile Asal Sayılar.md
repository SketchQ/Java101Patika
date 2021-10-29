# Recursive metot ile asal sayılar

Java Dilinde **"Recursive"** metot kullanarak, kullanıcıdan alınan sayının **"Asal"** sayı olup olmadığını bulan program yazın.

## Senaryo

```txt
Sayı Giriniz : 22
22 sayısı ASAL değildir!

Sayı Giriniz : 2
2 sayısı ASALDIR!

Sayı Giriniz : 39
39 sayısı ASAL değildir!

Sayı Giriniz : 17
17 sayısı ASALDIR!
```

```java
import java.util.Scanner; 

public class AsalSayilar {
    
    static boolean recursivePrime(int n1, int n2){
        if(n1 == n2 || n1 == 1)
            return true;
        if(n1 % n2 == 0)
            return false;
        return recursivePrime(n1, n2 + 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        input.close();
        int n2 = 2;
        System.out.println(recursivePrime(number, n2) ?  number + " Asal sayıdır" : number + " Asal sayı Değil");
    }
}
```

### Kaynak

[Patika](https://app.patika.dev/moduller/java101/odev-recursive-prime)
