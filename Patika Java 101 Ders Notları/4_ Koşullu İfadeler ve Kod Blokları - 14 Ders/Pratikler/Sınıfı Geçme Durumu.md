# Sınıf Geçme Durumu

Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

## Ödev

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

```java
package Pratikler;

import java.util.ArrayList;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Dersler : Matematik,Fizik,Türkçe,Kimya,Müzik
        int mat, fiz, tur, kim, muz, answer;
        boolean flag = true;
        ArrayList<Integer> ort = new ArrayList<Integer>();

        // Making Sure that we have a legit variable
        while (ort.size() < 5) {
            while (flag) {
                System.out.print("Lütfen Matematik notunuzu giriniz: ");
                answer = input.nextInt();
                if ((0 <= answer) && (answer <= 100)) {
                    mat = answer;
                    ort.add(mat);
                    break;
                } else {
                    System.out.println("Notunuz '0' ile '100' arasında olmalıdır.");
                }
            }
            while (flag) {
                System.out.print("Lütfen Fizik notunuzu giriniz: ");
                answer = input.nextInt();
                if ((0 <= answer) && (answer <= 100)) {
                    fiz = answer;
                    ort.add(fiz);
                    break;
                } else {
                    System.out.println("Notunuz '0' ile '100' arasında olmalıdır.");
                }
            }
            while (flag) {
                System.out.print("Lütfen Türkçe notunuzu giriniz: ");
                answer = input.nextInt();
                if ((0 <= answer) && (answer <= 100)) {
                    tur = answer;
                    ort.add(tur);
                    break;
                } else {
                    System.out.println("Notunuz '0' ile '100' arasında olmalıdır.");
                }
            }
            while (flag) {
                System.out.print("Lütfen Kimya notunuzu giriniz: ");
                answer = input.nextInt();
                if ((0 <= answer) && (answer <= 100)) {
                    kim = answer;
                    ort.add(kim);
                    break;
                } else {
                    System.out.println("Notunuz '0' ile '100' arasında olmalıdır.");
                }
            }
            while (flag) {
                System.out.print("Lütfen Müzik notunuzu giriniz: ");
                answer = input.nextInt();
                if ((0 <= answer) && (answer <= 100)) {
                    muz = answer;
                    ort.add(muz);
                    break;
                } else {
                    System.out.println("Notunuz '0' ile '100' arasında olmalıdır.");
                }
            }
            
        }
        input.close();
        // Not Ortalaması Hesaplama
        int result = 0, ortalama;
        System.out.println("Not Ortalamanız Hesaplanıyor.");
        for (int i = 0; i < ort.size(); i++) {
            result += ort.get(i);
        }
        ortalama = result / 5;
        System.out.println("Not Ortalamanız :" + ortalama);

    }
}

```
