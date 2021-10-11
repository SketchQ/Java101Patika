# While Döngüsü

**While** döngüsü yazıldıktan sonra parentez açılıp kapatılır ve bu parantezler arasına **boolean** bir değer girilir.  
Boolean değer **doğru** olduğu sürece **while** döngüsü devam eder.

## While Döngüsü Syntax

```java
while (condition){
    //Code Block
}
```

Eğer döngüye girecek kod tek satırdan oluşuyorsa **;** kullanabilinir.

```java
int i = 1;
while (i <= 5){
    System.out.println(i + ',' );
    i++;
}
```

Çıktısı:

```java
1,2,3,4,5
```

Döngülerin içeriği olması zorunlu değildir. Bazı durumlarda döngüye girecek kod olmasa bile döngüye girebiliriz.

```java
int left = 100, right = 200;
while ( ++left < --right);
System.out.println("100 ile 200'ün ortası: " + left);
```

Çıktısı:

```java
100 ile 200'ün çıktısı : 150
```

## Input Verification

```java
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = "12345";
        boolean passwordSuccesfull = false;

        while (!paswordSuccesfull){

            System.out.println("Lütfen Şifrenizi Giriniz: ");
            String typedPassword = input.nextLine();

            if ( password.contentEquals(typedPassword)){
                System.out.println("Sisteme Giriş Başarılı");
                passwordSuccesfull = true;
            }
        }
    }
}
```
