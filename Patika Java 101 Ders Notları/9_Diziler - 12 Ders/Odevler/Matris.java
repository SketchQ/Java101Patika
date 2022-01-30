package Odevler;

import java.util.Arrays;

// Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

/*
* @author: Erim Serdönmez
*/

public class Matris {

    static int[][] Transpose(int[][] arr) {
        int[][] transposed = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    static void Print(int[][] arr) {
        System.out.println("Matrix is : " + Arrays.deepToString(arr));
        System.out.println();

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n-------------------------------------------------\n");
        System.out.println("Transposed Matrix is : " + Arrays.deepToString(Transpose(arr)));
        System.out.println();

        for (int[] i : Transpose(arr)) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Print(matrix);
        
        

    }
}
