package Odevler;

import java.util.Scanner; 

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a base number");
        int n = input.nextInt();
        input.close();

        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < 2 * (n - i) ; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
