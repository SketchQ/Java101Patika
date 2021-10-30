# Gelişmiş Hesap Makinası

Java ile kullanıcın seçtiği işlemleri yapan hesap makinasi yapıyoruz.

Hesap Makinasının Fonksiyonları :

```txt
1 - Toplama İşlemi
2 - Çıkarma İşlemi
3 - Çarpma İşlemi
4 - Bölme İşlemi
5 - Üslü Sayı Hesaplama
6 - Faktöriyel Hesaplama
7 - Mod Alma
8 - Dikdörtgen alan ve Çevre Hesabı
```

```java
import java.util.Scanner;  

public class HesapMak {
    
    static int sum(int n1, int n2){
        int result = n1 + n2;
        System.out.println("Toplama İşlemi Sonuç : " + result);
        return result;
    }
    
    static int minus(int n1, int n2){
        int result = n1 - n2;
        System.out.println("Çıkartma İşlemi Sonuç : " + result);
        return result;
    }

    static int multiply(int n1,int n2){
        int result = n1 * n2;
        System.out.println("Çarpma İşlemi Sonuç : " + result);
        return result;
    }

    static int divide(int n1, int n2){
        if(n2 == 0){
            System.out.println("İkinci sayı 0'dan farklı bir değer olmalı.");
            return 0;
        }
        int result = n1 / n2;
        System.out.println("Bölme İşlemi Sonuç : " + result);
        return result;
    }

    static int power(int n1, int n2){
        int result = 1;
        for(int i = 1; i <= n2; i++){
            result *= n1;
        }
        return result;
    }

    static int mod(int n1,int n2){
        int result = n1 % n2;
        return result;
    }

    static void factorial(int n1, int n2){
        int result = 1;
        for(int i = 1; i < n2; i++){
            result *= i;
        }
        System.out.println(n2 + " Sayısının Faktöriyeli : " + result);
    }

    static void calc(int n1, int n2){
        System.out.println("Çevresi : " + (2 * ( n1 + n2)));
        System.out.println("Alanı : " + (n1 * n2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu =  "1 - Toplama İşlemi\n"
                    +  "2 - Çıkartma İşlemi\n"
                    +  "3 - Çarpma İşlemi\n"
                    +  "4 - Bölme İşlemi\n"
                    +  "5 - Üslü Sayı Hesaplama\n"
                    +  "6 - Mod Alma\n"
                    +  "7 - Dikdörtgen Alan ve Çevre Hesaplama\n"
                    +  "8 - Faktöriyel Hesaplama\n"
                    +  "0 - Çıkış Yap";
        System.out.println(menu);
        while(true){
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();
            
            if(select == 0){
                System.out.println("Çıkış Yapılıyor.");
                scan.close();
                break;
            }
            
            System.out.print("İlk Sayıyı Giriniz : ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayıyı Giriniz : ");
            int b = scan.nextInt();
            
            switch(select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesap Sonuç : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod İşlem Sonuç : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                case 8:
                    factorial(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir veri girdiniz:");

            }
        }
    }
    
}
```

## Ödev

Aynı Projeye mod almak ve dikdörtgen alan çevre hesabını yapan metotları yazıp menüde işlevsel hale getiriniz.

### Kaynak

[Patika](https://app.patika.dev/moduller/java101/pratik-hesap-mak-2)
