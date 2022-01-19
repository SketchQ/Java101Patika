package HackerRank_Scope;

import java.util.Scanner;

class Difference{
    private int[] elements;
    public int maximumDifference;
    public Difference(int[] elements){
        this.elements = elements;
    }
    public void computeDifference(){
        int max = elements[0];
        int min = elements[0];
        for(int i = 1; i < elements.length; i++){
            if(elements[i] > max){
                max = elements[i];
            }
            if(elements[i] < min){
                min = elements[i];
            }
        }
        maximumDifference = max - min;
    }
}


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        Difference d = new Difference(arr);
        d.computeDifference();

        System.out.print(d.maximumDifference);

        
    }
    
}
