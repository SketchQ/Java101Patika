package Odevler;

import java.util.Scanner; 

public class AsalSayilar {
    
    static boolean recursivePrime(int n1, int n2){
        if(n1 == n2 || n1 == 1)
            return true;
        if(n1 % n2 == 0)
            return false;
        return recursivePrime(n1, n2 + 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        input.close();
        int n2 = 2;
        System.out.println(recursivePrime(number, n2) ?  number + " Asal sayıdır" : number + " Asal sayı Değil");
    }
}
