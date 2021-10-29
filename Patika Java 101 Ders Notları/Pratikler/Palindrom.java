package Pratikler;

import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;        }
        if(reverseNumber == number)
                return true;
        else
                return false;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom Sayı olup olmadığını kontrol etmek için bir sayı giriniz: ");
        int n  = input.nextInt();
        input.close();
        if(isPalindrom(n))
                System.out.println(n + " Palindrom bir Sayıdır.");
        else
                System.out.println(n + " Palindrom Sayı Değildir.");
    }
}
