package Giris;

public class Operatorler{
    public static void main(String[] args) {
        int a = 5;
        int b = 6;  
        int c = 5;
        // += Operatörü
        int atama = (a += b);
        System.out.println(atama);
        // -= Operatörü
        int eksileme = (a -= c);
        System.out.println(eksileme);
        // *= Operatörü
        int carpma = (a *=b);
        System.out.println(carpma);
        // ve ==> && veya ==> ||
        a = 5;
        b = 6;
        c = 5;
        boolean sonuc = (a == b) && (a == c);
        System.out.println(sonuc);
        boolean sonuc2 = a == c;
        System.out.println(sonuc2);
        // Koşul Operatörü
        String word = (a == 1) ? "Ne Diyon?":"Ne mi diyom?";
        System.out.println(word);
    }
}
