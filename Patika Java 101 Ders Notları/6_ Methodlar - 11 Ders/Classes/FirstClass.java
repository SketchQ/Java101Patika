package Classes;

public class FirstClass{

    // return değeri void olan bir metot tanımlama

    static void helloWorld(){
        System.out.println("Hello World!");
    }

    // Üst alma metot tanımı

    static int power(int base, int exp){
        int result = 1; 
        for(int i = 1; i <= exp ; i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        // Methotsuz üst alımı
        
        int base = 2, exp=3,result=1;
        for(int i =1 ; i <= exp ; i++){
            result *= base;
        }
        System.out.println(result);

        // Metot kullanarak üst alma işlemi
        System.out.println(power(4, 2));

        // Calling the helloWorld method
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
        // System.out.println(helloWorld();); Hatalı olucaktır.

    }
}