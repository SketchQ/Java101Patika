package Pratikler;

// Çok Boyutlu diziler ile A Harfi Yazdıran program

/*
 * @author Erim Serdönmez
 */

public class A_Harfi {
    public static void main(String[] args) {
        String[][] matrix = new String[6][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0 || row == 2) {
                    matrix[row][col] = "*";
                }
                if (col == 0 || col == 3) {
                    matrix[row][col] = "*";
                }
                if (matrix[row][col] == null) {
                    matrix[row][col] = " ";
                }

            }

        }
        // ekrana yazdırma
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "  ");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        // Ödev -- Ekrana 'B' harfi yazdırma

        String[][] letter = new String[7][4];

        for (int row = 0; row < letter.length; row++){
            for (int col = 0; col < letter[row].length; col++){
                if (row == 0 || row == 3 || row == 6){
                    letter[row][col] = "*";
                }else if (col == 0 || col == 3) {
                    letter[row][col] = "*";
                }else {
                    letter[row][col] = " ";
                }
            }
        }

        // Ekrana Yazdırma
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
