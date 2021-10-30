package Pratikler;

public class Operatorler {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;

        // == Operatörü
        System.out.println(A == B);// False
        System.out.println(A == C);// True
        System.out.println(C == D);// False

        // != Eşit Değil Operatörü
        System.out.println(A != D); // True
        System.out.println(A != C); // False
        System.out.println(C != B); // True

        // > Operatörü
        System.out.println(A > D); // False
        System.out.println(D > C); // True
        System.out.println(C > B); // False

        // >= Operatörü
        System.out.println(A >= D); // False
        System.out.println(A >= C); // True
        System.out.println(C >= B); // False

        // < Operatörü
        System.out.println(A < D); // True
        System.out.println(D < C); // False
        System.out.println(C < B); // True
        
        // <= Operatörü
        System.out.println(A <= D); // True 
        System.out.println(A <= C); // True
        System.out.println(C <= B); // True
    }
}
