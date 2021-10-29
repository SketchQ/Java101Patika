package Odevler;

import java.util.Scanner;

public class UsluSayiHesaplama {

    static int recursivePower(int n1, int n2) {
        if (n1 == 1) {
            return 1;
        } else if (n2 == 0) {
            return 1;
        } else {
            return n1 * recursivePower(n1, n2 - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Çıkış için 'q' ye basınız: ");
            System.out.print("Taban Değeri giriniz : ");
            String tabaString = input.nextLine();
            if (tabaString.equalsIgnoreCase("q")){
                break;
            }
            System.out.print("Üs değeri giriniz : ");
            String uString = input.nextLine();
            if (uString.equalsIgnoreCase("q")){
                break;
            }
            int taban = Integer.parseInt(tabaString);
            int us = Integer.parseInt(uString);
            System.out.println("Hesaplanıyor...\nSonuç:  " + recursivePower(taban, us));
        }
        input.close();

    }
}
