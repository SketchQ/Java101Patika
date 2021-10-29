package Pratikler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        int n1 = input.nextInt();
        System.out.print("Please enter the second number : ");
        int n2 = input.nextInt();
        input.close();

        int ebob = 1;
        if (n1 > n2) {
            // Ekok Bulma
            for(int j = 1; j <= (n1 * n2); j++){
                if(j % n1 == 0 && j % n2 == 0){
                    break;
                }
            }
            // Ebob Bulma
            System.out.println("------");
            // İlk yöntem küçükten başlayan
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    //System.out.println("İlk Yöntem EBOB : " + ebob);
                }
            }
            System.out.println("---------");
            // İkinci Yöntem Büyükten başlayıp küçüğe doğru
            for(int k = n1; k >=1 ; k--){
                if(n1 % k == 0 && n2 % k == 0){
                    ebob = k;
                    //System.out.println("İkinci Yöntem EBOB : " + ebob);
                    break;
                }
            }
        } else {
            // Ekok Bulma
            for(int j = 1; j <= (n1 * n2); j++){
                if(j % n1 == 0 && j % n2 == 0){
                    break;
                }
            }
            // EBOB bulma
            System.out.println("--------");
            // İlk yöntem küçükten başlayan
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                   // System.out.println("İlk Yöntem EBOB : " + ebob);
                }
            }
            System.out.println("--------");
            // İkinci Yöntem Büyükten başlayıp küçüğe doğru
            for(int k = n1; k >=1 ; k--){
                if(n1 % k == 0 && n2 % k == 0){
                    ebob = k;
                    //System.out.println("İkinci Yöntem EBOB : " + ebob);
                    break;
                }
            }
        }
        int ekok = (n1 * n2) / ebob;
        System.out.println("Genel Ebob : "+ ebob);
        System.out.println("Genel Ekok : " + ekok);
    }
}
