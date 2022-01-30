package Odevler;

// Dizideki elemanların kaç kez tekrar edildiğini bulan Java Programı

/*
 * @author Erim Serdönmez
 */

public class Frekans {

    static boolean isFind(int[] arr, int val) {
        for (int i : arr) {
            if (i == val)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 0) {
                if (!isFind(duplicate, array[i])) {
                    System.out.println(array[i] + " is repeated " + count + " times");
                    duplicate[i] = array[i];
                }
                count = 0;
            }
        }

    }
}
