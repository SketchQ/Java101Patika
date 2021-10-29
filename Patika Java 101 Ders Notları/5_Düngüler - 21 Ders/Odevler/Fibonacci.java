package Odevler;

import java.util.Scanner; 

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        input.close();

        int n1 = 0,n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for(int i = 2; i <= n; i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
