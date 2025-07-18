import java.util.*;

public class ContitionalState {
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

        //Print whether the given yearc is a leap year or not.
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        boolean x = (year % 4 ) == 0;
        boolean y = (year % 100 ) != 0;
        boolean z = ((year % 100 == 0 ) && (year % 400 == 0 ));

        if (x && (y || z)) {
            System.out.println(year + " " + "is a leap year");
        } else {
            System.out.println(year + " " + "is a not leap year");
        }


    }
}
