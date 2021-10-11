# Harmonik Seri Bulan Program

Java ile girilen sayinin harmonik serisini bulan program yazacagiz.

## Harmonik Seri Formulu

![Harmonik Seri](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/pratik-harmonic/figures/harmonic_series.gif)

```java
import java.util.Scanner; 

public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n = input.nextInt();
        input.close();
        double result = 0;

        for(double i = 1 ; i <= n ; i++){
            result += ( 1 / i);
        }

        System.out.println(n + " Sayisinin harmonik degeri " + result);
    }
}

```
