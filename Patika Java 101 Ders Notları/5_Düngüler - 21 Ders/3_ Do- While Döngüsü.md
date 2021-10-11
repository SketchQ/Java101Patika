# Do - While Döngüsü

**Do- while** döngüsünde koşul false olsa bile döngü en az 1 kere çalışacaktır.  
Bunun dışında çalışma mantığı **while** döngüsü ile aynıdır.

## Syntax

```java
do{
    //Code Block
}while(Condition);
```

```java
int year = 2021;

do{
    System.out.println("Döngü işletiliyor..");
    year ++;
    }while ( year < 2021);
```

Çıktısı:

```text
Döngü İşletiliyor..
```

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        int pass;
        boolean isTrue = true;
        do{
            System.out.println("Şifrenizi Giriniz : ");
            pass = nextInt();
            if ( pass == 123){
                System.out.println("Doğru");
                isTrue = false;
            }else{
                Sytem.out.println("Yanlış");
            }while(isTrue);
        }
    }
}
```
