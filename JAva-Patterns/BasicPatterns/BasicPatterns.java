public class BasicPatterns {
    public static void main(String []args) {
        int n = 4;
        char ch = 'A';

        //left Triangle Pattern
        System.out.println("left Triangle Pattern");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted left Triangle
        System.out.println("Inverted left Triangle Pattern");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //left number Triangle Pattern
        System.out.println("left Number Triangle Pattern");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //left Alphabet Triangle Pattern
        System.out.println("left Alphabet Triangle Pattern");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}