/*
UC1 PALINDROME CHECKER APP;
Description:
This class displays the entry point of the
Palindrome Checker Management System.
AUTHOR: Geetika k
 */


public class PalindromeCheckerApp {
    public static void main(String[] args){
        String word = "madam";
        boolean isPalindrome = true;
        int n = word.length() -1;
        int start =0;
        for (int i = n; i > 0; i--) {
            if (word.charAt(i) != word.charAt(start)) {
                isPalindrome = false;
                break;
            }
            start++; ;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
