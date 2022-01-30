package Odevler;

// Dizideki elemanları küçükten büyüğe sıralayan Java Programı
// Dizi boyutunu ve elemanlarını kullanıcıdan alın.

/*
 * @author Erim Serdönmez
 */

import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        // Scanner sınıfı oluşturma
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan boyutu alma ve array oluşturma
        System.out.println("Dizi boyutunu giriniz: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        // Kullanıcıdan elemanları alma ve array'e atama
        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        // Array'i küçükten büyüğe sıralama
        Arrays.sort(array);
        // Array'i ekrana yazdırma
        System.out.println("Sıralama: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
