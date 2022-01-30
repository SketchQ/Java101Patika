package Pratikler;

// Dizideki Elemanların Ortalamasını Bulan Program

/*
*   @author Erim Serdönmez
*/
public class Ortalama {
    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double sum = 0;

        for (int i : list) {
            sum += i;
        }

        double average = sum / list.length;
        System.out.println("Ortalama: " + average);

        // Harmonik ortalamasını yazan program
        double harmonicSum = 0;

        for (int i : list) {
            harmonicSum += 1 / (double) i;
        }

        double harmonicAverage = list.length / harmonicSum;

        System.out.println("Harmonik Ortalama: " + harmonicAverage);

    }
    
}
