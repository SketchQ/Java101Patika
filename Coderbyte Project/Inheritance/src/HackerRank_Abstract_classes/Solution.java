package HackerRank_Abstract_classes ;

import java.util.Scanner;

abstract  interface Book {
        
    void display();
     
}

class myBook implements Book{

    private String title;
    private String author;
    private int price;

    myBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

} 

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        String author = scan.nextLine();
        int price = scan.nextInt();
        scan.close();

        Book book = new myBook(title, author, price);
        book.display();
    }
}
