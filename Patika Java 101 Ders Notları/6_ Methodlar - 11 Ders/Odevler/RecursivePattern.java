package Odevler;

import java.util.Scanner; 

public class RecursivePattern {

    static int pattern(int n1, int n2, int n3){
        System.out.print(n1 + " ");

        if(n1 > 0 && n3 == 1){
            return pattern(n1 - 5, n2, 1);
        }else if(n1 <= 0 && n3 == 1 && n1 < n2){
            return pattern(n1 + 5 , n2, 2);
        }else if(n1 > 0 && n3 == 2 && n1 < n2){
            return pattern(n1 + 5, n2, 2);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int num = input.nextInt();
        input.close();
        System.out.print("Çıktısı : ");
        pattern(num, num, 1);
    }
}
