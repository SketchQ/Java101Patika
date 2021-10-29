
public class FourthClass {

    static void sum(int n1, int n2){
        int x = 20;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 5;

        if (a < 10) {
            int b = 20;
            System.out.println(b); // Lokal olarak çalıır
        }
        // System.out.println(b); // Bu kod lokal olmadığı için çalışmaz

        do {
            int b = 20;
        } while (a < 10);

        // System.out.println(b); Bu örnek yine aynı şekilde hata verir.

        int x = 10;
        int y = 30;

        sum(x,y);
        System.out.println(x);
        System.out.println(y);
    }

}
