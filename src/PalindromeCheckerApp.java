/*
UC1 PALINDROME CHECKER APP;
Description:
This class displays the entry point of the
Palindrome Checker Management System.
AUTHOR: Geetika k
 */


import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "refer";
        Deque<Character> queue  = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
        }
        boolean isPalindrome = true;
        while (queue.size() > 1) {
            char first = queue.removeFirst();
            char last = queue.removeLast();

            if (first != last) {
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
