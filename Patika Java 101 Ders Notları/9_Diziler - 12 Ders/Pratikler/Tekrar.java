package Pratikler;


// Dizideki Tekrar eden Sayıları Bulan Java Programı

/* 
* @author Erim Serdönmez
*/

public class Tekrar {
    static boolean isFind(int[] arr, int val) {
        for (int i : arr) {
            if (i == val)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1 };
        int[] tekrar = new int[dizi.length];
        int startIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j]) {
                    if (!isFind(tekrar, dizi[i])) {
                        tekrar[startIndex++] = dizi[i];
                    }
                    break;

                }
            }
        }

        for (int i : tekrar) {
            if (i != 0)
                System.out.print(i + " ");
        }

        System.out.println("\n------------------");

        // Ödev -- Sayı dizisindeki tekrar eden çift sayılaı belirten bir program yazınız.
        int[] array = {6, 40, 5, 20, 6, 8, 45, 20, 40, 5, 8, 45};
        int[] duplicate = new int[array.length];
        int start = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                if ( (i != j && array[i] == array[j]) && array[i] %2 == 0 ) {
                    if (!isFind(duplicate, array[i])) {
                        duplicate[start++] = array[i];
                    }
                    break;
                }
            }
        }



        for (int i : duplicate) {
            if (i != 0)
                System.out.print(i + " ");
        }

    }
}
