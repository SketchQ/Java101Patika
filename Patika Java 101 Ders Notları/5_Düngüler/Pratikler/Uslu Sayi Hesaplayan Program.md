# Uslu Sayi Hesaplayan Program

Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

```java

import java.util.Scanner; 

public class UsluSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,n;
        System.out.print("Ussu Alinacak Sayi : ");
        n = input.nextInt();
        System.out.print("Us olacak sayi : ");
        k = input.nextInt();

        // 3^4 = 3 * 3 * 3 * 3
        int i = 1;
        int total = 1;
        while ( i <= k){
            total *= n;
            i++;
        }
        System.out.println(" Result : " + total);
        
        // For Dongusu ile yazmak
        int total2 = 1;
        for ( int x = 1; x <= k; x++){
            total2 *= n;
        }
        System.out.println("For Loop Result : " + total2);
        input.close();
    }
}
```
