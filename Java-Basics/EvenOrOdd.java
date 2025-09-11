import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print whether the num is positive or negative.
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "Is a positive number.");
        } else {
            System.out.println(num + " " +"Is a negative number.");
        }

    }
}
