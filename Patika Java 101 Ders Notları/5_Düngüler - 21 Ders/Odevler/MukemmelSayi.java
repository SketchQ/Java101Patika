package Odevler;

import java.util.Scanner;

public class MukemmelSayi {

    static boolean isPerfectNumber(int n1) {
        int sum = 0;
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                sum += i;
            } else
                continue;
        }
        if (sum == n1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = input.nextInt();
        input.close();

        System.out.println(
                (isPerfectNumber(number)) ? number + " is a Perfect Number" : number + " is not a Perfect Number");
    }
}
