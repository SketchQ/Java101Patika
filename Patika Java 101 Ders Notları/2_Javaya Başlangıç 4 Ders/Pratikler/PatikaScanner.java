package Giris;

import java.util.Scanner;

public class PatikaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.println("B sayısını Giriniz : ");
        b = input.nextInt();

        System.out.println("A sayısı : "+ a);
        System.out.println("B sayısı : "+ b);
        input.close();
    }
}
