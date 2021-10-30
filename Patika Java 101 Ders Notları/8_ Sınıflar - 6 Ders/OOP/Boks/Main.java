package Boks;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Mark", 15, 100, 90, 10);
        Fighter alex = new Fighter("Alex", 20, 100, 95, 10);
        Ring r = new Ring(marc, alex, 75, 120);
        r.run();
    }
}
