package Giris;

import java.util.Scanner;

public class PatikaScanner2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // String Örneği
        String adSoyad = inp.nextLine();

        // Sayı Örnekleri
        int yas = inp.nextInt();
        double maas = inp.nextDouble();

        // Çıktılar
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yas: " + yas);
        System.out.println("Maas: " + maas);
        inp.close();
    }
}
