/** @author Erim Serdonmez -- 14/09/2021
 *  Armstrong sayilari bulan program ve sayinin basamaklarini toplayip hesaplayan program
 */
package Pratikler;

import java.util.Scanner; 

public class Armstrong {
    public static void main(String[] args) {
        // 3 Basamakli sayilardaki Armstrong sayilarini bulmak
        int basValue, reSult, total = 0;
        for (int i = 100; i <= 999; i++) {
            int tempI = i;
            total = 0;
            while (tempI != 0) {
                basValue = tempI % 10;
                reSult = 1;
                for (int k = 1; k <= 3; k++) {
                    reSult *= basValue;
                }
                total += reSult;
                if(i == total){
                    System.out.println(total + " Armstrong Sayidir " + i);
                    continue;
                }else{
                    tempI /= 10;
                    continue;
                }
                
            }
        }

        // Bir sayının basamak sayılarının toplamı 
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Basamaklarinin toplanmasini istediginiz bir sayi Giriniz : ");
        number = input.nextInt();
        input.close();
        int tempNumber = number;

        int basvalue, result = 0;

        while (tempNumber != 0) {
            basvalue = tempNumber % 10;
            result += basvalue;
            tempNumber /= 10;
        }

        System.out.println(number + " Sayisinin basamaklari Toplami : " + result);

    }
}
