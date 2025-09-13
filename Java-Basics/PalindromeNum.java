import java.util.*;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Palindrome number
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if(isPalindrome(number)) {
            System.out.println("The number is " + number + " " + "is a Palindrome");
        } else {
            System.out.println("The number is " + number + " " + "is not a Palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int num = number;
        int reverse = 0;

        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if (number == reverse) {
            return true;
        }
         return false;
    }
}
