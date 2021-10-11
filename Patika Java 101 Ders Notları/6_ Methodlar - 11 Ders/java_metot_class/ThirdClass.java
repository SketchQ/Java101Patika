public class ThirdClass {

    // First Metot
    static void print(){
        System.out.println("Parametresiz Metot...");
    }

    // İlk Overloading metot
    static void print(int a ){
        System.out.println("Parametre " + a);
    }
    // Double Overloading metot
    static void print(double x){
        System.out.println("Parametre Double " + x);
    }
    // Geri Dönüşlü overloading metot
    static int print(int a, int b){
        return a + b;
    }
    // Geri Dönüşlü ikinci overloading metot
    static int print(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        print();
        print(12);
        print(12.0);
        System.out.println(print(5,2));
        System.out.println(print(5,2,6));
    }
}
