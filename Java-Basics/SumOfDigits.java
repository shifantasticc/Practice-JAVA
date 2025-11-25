import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Sum of digits of a number
        System.out.println("Enter a number : ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

     public static int sumDigits(int n) {
        int sumofDigits = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            sumofDigits += lastDigit;
            n /= 10;
        }
 
        return sumofDigits;
        
    }
}
