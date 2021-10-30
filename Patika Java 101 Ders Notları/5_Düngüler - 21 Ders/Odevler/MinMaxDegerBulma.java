package Odevler;

import java.util.Scanner; 

public class MinMaxDegerBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int maxNumber = 0, minNumber = 0;

        System.out.print("How Many Numbers will you enter? :");
        int n = input.nextInt();

        int[] numberArrays = new int[n];

        for(int i = 1; i <= n; i++){
            System.out.print(i + ". Number is : " );
            numberArrays[i - 1] = input.nextInt();
        }

        for(int j = 0; j < numberArrays.length; j++){
            if(numberArrays[j] < minNumber)
                minNumber = numberArrays[j];
            else if (numberArrays[j] > maxNumber)
                maxNumber = numberArrays[j];
        }
        input.close();
        System.out.println("Biggest Number is : " + maxNumber);
        System.out.println("Smallest Number is : " + minNumber);

    }
}
