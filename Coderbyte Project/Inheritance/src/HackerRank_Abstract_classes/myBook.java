package HackerRank_Abstract_classes;

public class myBook implements Book{

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
    
