import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        if(isPalindrome(input)) {
            System.out.println("It's a Palindrome!");
        } else {
            System.out.println("It's not a Palindrome!");
        }
    }

    public static boolean isPalindrome(String input) {

        // Remove spaces and punctuation, and convert to lowercase

        StringBuilder cleanedInput = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                cleanedInput.append(Character.toLowerCase(c));
            }
        }

        // Compare the string with its reverse

        String reversedInput = cleanedInput.toString(); // Convert back to string
        String reversed = cleanedInput.reverse().toString();
        return reversedInput.equals(reversed);

    }
}
