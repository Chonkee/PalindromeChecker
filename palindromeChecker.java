import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        
        String reversedInput = ("");
        int inputLength = input.length();

        for (int i = (inputLength - 1); i >= 0; i--) {
          reversedInput = reversedInput + input.charAt(i);
        }
        
        if (input.toLowerCase().equals(reversedInput.toLowerCase())) {
          System.out.println(input + " is a Palindrome!");
        } else {
          System.out.println(input + " is not a Palindrome!");
        }
    }
}
