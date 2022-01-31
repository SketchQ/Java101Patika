package Pratikler;
/*
    Java program to check if a string is palindrome or not

    @author: Erim Serdönmez
*/

public class Palindrome {
    public static void main(String[] args) {
        String input = "";
        String reverse = "";
        boolean isPalindrome = false;
        while (!isPalindrome) {
            System.out.print("Enter a word: ");
            input = System.console().readLine();
            for (int i = input.length() - 1; i >= 0; i--) {
                reverse += input.charAt(i);
            }
            if (input.equalsIgnoreCase(reverse)) {
                isPalindrome = true;
            } else {
                reverse = "";
            }
        }
        System.out.println("The word " + input + " is a palindrome.");
    }
}
