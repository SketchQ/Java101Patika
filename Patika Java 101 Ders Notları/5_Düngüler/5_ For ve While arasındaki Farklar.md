# For ve While arasındaki farklar

Tekrar adetini bilmediğimiz döngülerde örnek

```java
import.java.util.Scanner;

public class Test{
    public static void main(Strings[] args ){
        Scanner input = new Scanner(System.in);
        int sayi;

        // For Loop in unknown number of loops
        for ( isRun = true; isRun;){
            System.out.println("Sayı Giriniz :");
            sayi = nextInt();
            if ( sayi < 0){
                isRun = false;
            }
        }

        // While Loop
        System.out.println("Sayı Giriniz : ");
        sayi = input.nextInt();
        while ( sayi > 0){
            System.out.println("Sayı Giriniz : ");
            sayi = input.nextInt();
        }

        // do - while Loop

        do{
            System.out.println("Sayı Giriniz : ");
            sayi = input.nextInt();
            while ( sayi > 0);
        }
    }
}
```

Görüldüğü gibi tekrar adetini bilmediğimiz yerlerde While loop veya do - while loop kulanmak biraz daha raht.
