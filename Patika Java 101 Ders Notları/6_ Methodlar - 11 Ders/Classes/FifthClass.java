package Classes;

public class FifthClass {
    static int f(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    static int recursiveF(int n){
        System.out.println("N => " + n);
        if(n == 1){
            return 1;
        }
        int result = recursiveF(n - 1 ) + n;
        System.out.println("Result: " + result);
        return result;
    }

    static int basamaklarToplami(int sayi){
        if(sayi == 0){
            return 0;
        }else{
            return sayi % 10 + basamaklarToplami(sayi / 10);
        }
    }
    static void recursiveMethod(int num){
        num--;
        if(num == 0){
            return;
        }
        System.out.print(num + ",");
        recursiveMethod(num);
    }
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(recursiveF(10));
        System.out.println("Basamak Toplamı " + basamaklarToplami(45612));
        recursiveMethod(4);
        /** f(2) = 1 + 2
         * f(3) = 1 + 2 + 3
         * f(4) = 1 + 2 + 3 + 4
         * f(n) = f(n-1) + n
         */
    }
}
