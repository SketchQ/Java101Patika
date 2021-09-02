/** @author Erim Serdönmez -- 02/09/2021
 *  Burc.java -- Kullanıcının Burcunu bulan program
 */
package Pratikler;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcının doğum gününü öğrenme
        int day, month;

        System.out.print("Lütfen Doğum gününüzü giriniz (1 ve 31 arasında bir sayı giriniz): ");
        day = input.nextInt();

        System.out.print("Lütfen Doğduğunuz ayı sayı olarak giriniz. (1 ve 12 arasında bir sayı giriniz.): ");
        month = input.nextInt();

        System.out.println("Burcunuzu hesaplıyorum...");
        // Koç Burcu ( 21 Mart - 20 Nisan)
        if (month == 3) {
            if ((day >= 1) && (day <= 31)) {
                if (day >= 21) {
                    System.out.println("Koç Burcusunuz.");
                } else {
                    System.out.println("Balık Burcusunuz.");
                }
            } else {
                System.out.println("Geçersiz bir gün girdiniz");
            }
        } else if (month == 4) {
            if ((day >= 1) && (day <= 30)) {
                if (day >= 21) {
                    System.out.println("Boğa Burcusunuz.");
                } else {
                    System.out.println("Koç Burcusunuz.");
                }
            } else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
        } else if (month == 5) {
            if ((day >= 1) && (day <= 31)) {
                if (day >= 22) {
                    System.out.println("İkizler Burcusunuz.");
                } else {
                    System.out.println("Boğa Burcusunuz.");
                }
            } else {
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        } else if (month == 6) {
            if ((day >= 1) && (day <= 30)) {
                if (day >= 23) {
                    System.out.println("Yengeç Burcusunuz.");
                } else {
                    System.out.println("İkizler Burcusunuz.");
                }
            } else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
        } else if (month == 7) {
            if (day >= 23) {
                System.out.println("Aslan Burcusunuz.");
            } else {
                System.out.println("Yengeç Burcusunuz.");
            }
        } else if (month == 8) {
            if (day >= 23) {
                System.out.println("Başak Burcusunuz.");
            } else {
                System.out.println("Aslan Burcusunuz.");
            }
        } else if (month == 9) {
            if ((day >= 1) && (day <= 30)) {
                if (day >= 23) {
                    System.out.println("Terazi Burcusunuz.");
                } else {
                    System.out.println("Başak Burcusunuz.");
                }
            } else {
                System.out.println("Geçersiz bir gün girdiniz.");
            }
        } else if (month == 10) {
            if (day >= 23) {
                System.out.println("Akrep Burcusunuz.");
            } else {
                System.out.println("Terazi Burcusunuz.");
            }
        } else if (month == 11) {
            if ((day >= 1) && (day <= 30)) {
                if (day >= 22) {
                    System.out.println("Yay Burcusunuz.");
                } else {
                    System.out.println("Akrep Burcusunuz.");
                }
            } else {
                System.out.println("Geçersiz bir Tarih Girdiniz.");
            }
        } else if (month == 12) {
            if (day >= 22) {
                System.out.println("Oğlak Burcusunuz.");
            } else {
                System.out.println("Yay Burcusunuz.");
            }
        } else if (month == 1) {
            if (day >= 22) {
                System.out.println("Kova Burcusunuz.");
            } else {
                System.out.println("Oğlak Burcusunuz.");
            }
        } else if (month == 2) {
            if ((day >= 1) && (day < 29)) {
                if (day >= 20) {
                    System.out.println("Balık Burcusunuz.");
                } else {
                    System.out.println("Kova Burcusunuz.");
                }
            } else {
                System.out.println("Geçersiz bir tarih girdiniz.");
            }
        } else {
            System.out.println("Geçerli gün veya ay girmediniz.");
        }
        input.close();
    }
}