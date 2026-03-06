/*
 ==================================================
 MAIN CLASS - UseCase12PalindromeCheckerApp
 ==================================================
*/

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";   // Hardcoded input (no user input)

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/*
 ==================================================
 INTERFACE - PalindromeStrategy
 ==================================================
*/

interface PalindromeStrategy {
    boolean check(String input);
}

/*
 ==================================================
 CLASS - StackStrategy
 ==================================================
*/

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}