import java.util.*;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Average of 3 nums.
        System.out.println("Enter 3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int avg = (n1+n2+n3)/3;
        System.out.println("Average of 3 no. is : " + avg);
        System.out.println();

        //Area of a square
        System.out.println("Enter side of a square");
        int  side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of square is : " + area);
        System.out.println();

        //Print the bill
        System.out.println("Enter cost of a pencil, a pen and an eraser");
        float  pencil = sc.nextFloat();
        float  pen = sc.nextFloat();
        float  eraser = sc.nextFloat();
        float bill = pencil+pen+eraser;
        System.out.println("Bill is : " + bill);

            //Add on with 18% tax
        float newBill = bill + (0.18f * bill);
        System.out.println("Tax amount : " + (0.18f * bill));
        System.out.println("Bill with 18% tax : " + newBill);
        System.out.println();

        // //Result of this code?
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

            // // Double bcuz of type conversion
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
