# Kullanıcı Girişi

Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapımı

## Ödev

Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

```java
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        String kullanici_adi,sifre,kullanici_adi2,sifre2,sifre3;
        int sifir;
        // Sisteme ilk giriş
        System.out.println("Lütfen ilk kayıt için kullanıcı adınızı ve şifrenizi belirleyin...");
        System.out.print("Kullanıcı Adınız : ");
        kullanici_adi = input.nextLine();
        System.out.print("Şifreniz : ");
        sifre = input.nextLine();
        // Intermission
        System.out.println("Teşekkürler Kullanıcı adınız ve şifreniz belirlenmiştir.\nSisteme giriş yapmak için lütfen 'Enter' tuşuna basınız.");
        input.nextLine();

        // Sisteme ikinci giriş ve teyit
        System.out.print("Lütfen Kullanıcı adınızı Giriniz :");
        kullanici_adi2 = input.nextLine();
        if(kullanici_adi.equals(kullanici_adi2)){
            System.out.println("Hoşgeldiniz " + kullanici_adi);
            System.out.print("Lütfen Şifreinizi giriniz : ");
            sifre2 = input.nextLine();
            if (sifre.equals(sifre2)){
                System.out.println("Şifreniz kabul edilmiştir.");
                System.out.println("Giriş sağlandı.");
            }
            else{
                System.out.print("Şifrenizi yanlış girdiniz.\nŞifrenizi unuttuysanız sıfırlamak için '1' (bir) e,\nDevam etmek için ise '2' (iki) ye basınız.");
                sifir = input.nextInt();
                if(sifir == 1){
                    System.out.print("Lütfen yeni şifrenizi giriniz. (Yeni girdiğiniz şifre ile eski şifreniz aynı olmamalıdır!)");
                    input.nextLine();
                    sifre3 = input.nextLine();
                    if (sifre3.equals(sifre)){
                    System.out.println("Eski şifreniz ile aynı şifreyi girdiniz....\nYeni şifreniz oluşturulamamıştır!");
                    }
                    else{
                    System.out.println("Yeni şifreniz kaydedilmiştir.");
                    System.out.println(sifre3 + sifre);   
                    }
                }
                else{
                    System.out.println("Teşekkürler " + kullanici_adi);
                } 
            }
        }
        else{
            System.out.println("Yanlış bir kullanıcı adı girdiniz.");
        }
        input.close();
    }
}
```
