/** @author Erim Serdönmez -- 02/09/2021
 *  Siralama.java -- Girilen 3 sayıyı büyükten küçüğe ve küçükten büyüğe sıralayan program
 */
package Pratikler;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan sayıları alma
        int x, y, z;

        System.out.print("Lütfen ilk sayınızı Giriniz: ");
        x = input.nextInt();

        System.out.print("Lütfen ikinci sayınızı Giriniz: ");
        y = input.nextInt();

        System.out.print("Lütfen üçüncü sayınızı Giriniz: ");
        z = input.nextInt();

        // Kullanıcaya küçükten büyüğe mi yoksa büyükten küçüğemi diye sormak.
        int secim;
        while (true) {
            System.out.println(
                    "Lütfen sayıları küçükten büyüğe mi, yoksa Büyükten küçüğe mi sıralamak istediğinizi belirtiniz.\nKüçükten büyüğe için '1'\nBüyükten küçüğe için '2' ye basınız.");
            secim = input.nextInt();

            if (secim == 1) {
                if ((x > y) && (x > z)) {
                    if ((y > z)) {
                        System.out.println("Sıralama " + z +"<"+ y +"<"+ x);
                    } else {
                        System.out.println("Sıralama " + y +"<"+ z +"<"+ x);
                    }
                    break;
                } else if ((y > x) && (y > z)) {
                    if ((x > z)) {
                        System.out.println("Sıralama " + z +"<"+ x +"<"+ y);
                    } else {
                        System.out.println("Sıralama " + x +"<"+ z +"<"+ y);
                    }
                    break;
                } else if ((z > y) && (z > x)) {
                    if ((y > x)) {
                        System.out.println("Sıralama " + x +"<"+ y +"<"+ z);
                    } else {
                        System.out.println("Sıralama " + y +"<"+ x +"<"+ z);
                    }
                    break;
                }
            }
            if (secim == 2) {
                if ((x > y) && (x > z)) {
                    if ((y > z)) {
                        System.out.println("Sıralama " + x +">"+ y +">"+ z);
                    } else {
                        System.out.println("Sıralama " + x +">"+ z +">"+ y);
                    }
                    break;
                } else if ((y > x) && (y > z)) {
                    if ((x > z)) {
                        System.out.println("Sıralama " + y +">"+ x +">"+ z);
                    } else {
                        System.out.println("Sıralama " + y +">"+ z +">"+ x);
                    }
                    break;
                } else if ((z > y) && (z > x)) {
                    if ((y > x)) {
                        System.out.println("Sıralama " + z +">"+ y +">"+ x);
                    } else {
                        System.out.println("Sıralama " + z +">"+ x +">"+ y);
                    }
                    break;
                }
            } else {
                System.out.println("Lütfen Tercihinizi yapınız.");
            }
        }
        input.close();
    }
}
