/** @author Erim Serdönmez -- 05/09/2021
 * TekSayiToplamBulma.java -- Java Döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eder ve girilen değerlerden tek sayıları toplayıp ekrana basar.
 * Java Döngüler iletek bir sayı girilene kadar kullanıcıdan girişleri kabul eder ve girilen değerlerden çift ve 4'ün katlarını toplar. 
 */
package Pratikler;

import java.util.Scanner;

public class TekSayiToplamBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Negatif bir Değer girilene kadar kullanıcıdan sayı kabul etme
        int prompt, sum = 0;
        do {
            System.out.print("Lütfen Bir Sayı giriniz: ");
            prompt = input.nextInt();
            // Girilen değerlerden tek sayıları belirleme
            if (prompt % 2 == 1) {
                sum += prompt;
            } else {
                continue;
            }
        } while (prompt > 0);
        {
            System.out.println("Lütfen Pozitif bir sayı giriniz.");
        }
        // Genel Toplamı kullanıcıya yansıtma
        System.out.println("Tek Sayıların Toplamı : " + sum);
        

        //Kullanıcı Tek bir sayı girene kadar kullanıcıdan veri alma
        // Alınan sayılardan çift ve 4'ün katlarını bulup toplama.

        Scanner inp = new Scanner(System.in);

        sum = 0;

        do{
            System.out.print("Sayı Giriniz : ");
            prompt = inp.nextInt();
            // çift ve 4'ün katlarını bulma.
            if ((prompt %4 == 0) && (prompt % 2 == 0)){
                sum +=prompt;
            }else{
                continue;
            }
        }while (prompt %2 == 0);{
            System.out.println("Tek Sayı girdiğiniz için liste sonlandırılmıştır.");
        }
        System.out.println("Toplam : " + sum);
        inp.close();
        input.close();
    }
}
