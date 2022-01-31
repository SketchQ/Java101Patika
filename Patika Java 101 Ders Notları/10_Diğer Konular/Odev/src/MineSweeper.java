/* 
    Oyun metin tabanlıdır.

    Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
    
    Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
    
    Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. 
    Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. 
    Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
    
    Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
    
    Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
    
    Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
    
    Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) 
    ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
    
    Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

    @author: Erim Serdönmez
*/

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    // Variables
    int row, col;
    String[][] mine;
    String[][] board;

    // Constructor
    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // Run Method
    public void run() {
        this.board = new String[this.row][this.col];

        makeMine(this.row,this.col);
        makeBoard(this.row, this.col);
        callMines(this.board);
    }
    // Methods
    // Main Body
    public void callMines(String[][] board) {
        int gameRow, gameCol, marker = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Mayınların Konumu");
        printBoard(this.mine);
        System.out.println("====================");
        System.out.println("Mayın Tarlası oyununa hoşgeldiniz !");

        while (true) {

            printBoard(board);

            do {
                if (marker == 1) {
                    System.out.println("\nDizi sınırlarnı dışında sayı girişi yaptınız. Tekrar giriniz.");
                }
                System.out.println("Satır Giriniz :");
                gameRow = input.nextInt();
                System.out.println("Sütun Giriniz :");
                gameCol = input.nextInt();
                marker = 1;
            } while (mine.length <= gameRow || mine[0].length <= gameCol || gameCol < 0 || gameRow < 0);
            marker = 0;

            if (mine[gameRow][gameCol].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===================");
                break;
            } else {
                board[gameRow][gameCol] = countMines(gameRow, gameCol);
            }
            if (isWin()) {
                System.out.println();
                System.out.println("Oyunu Kazandınız !");
                break;
            }
            System.out.println("====================");
        }
        input.close();
    }

    // Board oluşturma
    public void makeBoard(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.board[i][j] = "-";
            }
        }
    }

    // Mayınları oluşturma
    public void makeMine(int row, int col) {
        int rand, mines = 0;
        int mineNumber, numberOfMines = (row / col / 4);
        Random random = new Random();

        this.mine = new String[row][col];

        do {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    rand = random.nextInt(3);
                    if (rand == 1 && (numberOfMines != mines)) {
                        this.mine[i][j] = "*";
                        mines++;
                    } else {
                        this.mine[i][j] = "-";
                    }
                }
            }

            mineNumber = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (this.mine[i][j].equals("*")) {
                        mineNumber++;
                    }
                }
            }
        } while (mineNumber < numberOfMines);

    }

    // Count the Mines
    public String countMines(int row, int col) {
        int n = 0;

        if (row - 1 >= 0) {
            if (this.mine[row - 1][col].equals("*")) {
                n++;
            }
        }
        if (row + 1 < this.mine.length) {
            if (this.mine[row + 1][col].equals("*")) {
                n++;
            }
        }
        if (col - 1 >= 0) {
            if (this.mine[row][col - 1].equals("*")) {
                n++;
            }
        }
        if (col + 1 < this.mine[0].length) {
            if (this.mine[row][col + 1].equals("*")) {
                n++;
            }
        }
        if (row - 1 >= 0 && col - 1 < this.mine[0].length && col - 1 >= 0) {
            if (this.mine[row - 1][col - 1].equals("*")) {
                n++;
            }
        }
        if (row + 1 < this.mine.length && col + 1 < this.mine[0].length) {
            if (this.mine[row + 1][col + 1].equals("*")) {
                n++;
            }
        }
        if (row - 1 >= 0 && col + 1 < this.mine[0].length) {
            if (this.mine[row - 1][col - 1].equals("*")) {
                n++;
            }
        }
        if (row + 1 < this.mine.length && col - 1 < this.mine[0].length && col - 1 >= 0) {
            if (this.mine[row + 1][col - 1].equals("*")) {
                n++;
            }
        }

        return Integer.toString(n);

    }

    // if the game is won or not
    public boolean isWin() {
        int number = 0;
        for (String[] str : this.board) {
            for (int j = 0; j < this.board[0].length; j++) {
                if (str[j].equals("-")) {
                    number++;
                }
            }
        }
        return number - (this.row * this.col / 4) == 0;
    }

    // print the board
    public void printBoard(String[][] arr) {
        for (String[] str : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(str[j] + " ");
            }
            System.out.println();
        }
    }

}
