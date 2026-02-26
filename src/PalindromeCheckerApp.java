/*
UC1 PALINDROME CHECKER APP;
Description:
This class displays the entry point of the
Palindrome Checker Management System.
AUTHOR: Geetika k
 */


import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "noon";
        Stack<Character> stack  = new Stack<>();
        for(char c: input.toCharArray()){
            stack.push(c);
        }
        boolean isPalindrome = true;
        for(char c: input.toCharArray()){
            if(c != stack.pop()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
