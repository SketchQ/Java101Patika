package Pratikler;

// Dizideki Maksimum ve Minimum değerleri bulan program

/*
 *   @author Erim Serdönmez
 */

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        // Sort Metotu ile Bulma
        int[] list = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Arrays.sort(list);

        System.out.println("Maksimum: " + list[list.length - 1]);
        System.out.println("Minimum: " + list[0]);

        // Uzun Yöntem
        int[] array = { -52, 5, 11, 54, 26, -54, 23, 10, 5 };

        // min
        for (int i : array) {
            if (i < array[0]) {
                array[0] = i;
            }
        }
        System.out.println("Minimum: " + array[0]);
        // max
        for (int i : array) {
            if (i > array[array.length - 1]) {
                array[array.length - 1] = i;
            }
        }
        System.out.println("Maximum: " + array[array.length - 1]);

        // --------------------------------------------------

        // Ödev -- Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en
        // büyük sayıyı bulan programı yazınız

        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        input.close();

        // Add the input to the list
        dizi = Arrays.copyOf(dizi, dizi.length + 1);
        dizi[dizi.length - 1] = sayi;
        Arrays.sort(dizi);

        int index = Arrays.binarySearch(dizi, sayi);

        System.out.println("En küçük sayı: " + dizi[index - 1]);
        System.out.println("En büyük sayı: " + dizi[index + 1]);


    }
}
