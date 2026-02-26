/*
UC1 PALINDROME CHECKER APP;
Description:
This class displays the entry point of the
Palindrome Checker Management System.
AUTHOR: Geetika k
 */


public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "radar";
        char[] chars = input.toCharArray();
        int start =0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end){
            if(chars[start] != chars[end]){
                isPalindrome = false;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
