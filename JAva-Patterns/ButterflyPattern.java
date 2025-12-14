public class ButterflyPattern {
    
    public static void main(String []args) {
        int n = 4;

        System.out.println("Butterfly Pattern");
        // 1st half
        for (int i=1; i<=n; i++) {

            // Stars i
            for (int j=1; j<=i; j++) { 
                System.out.print("*");
            }

            // Spaces 2 * (n-1)
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // Stars i
            for (int j=1; j<=i; j++) { 
                System.out.print("*");
            }
            System.out.println("");
        }

        // 2nd half
        for (int i=n; i>=1; i--) {

            // Stars i
            for (int j=1; j<=i; j++) { 
                System.out.print("*");
            }

            // Spaces 2 * (n-1)
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // Stars i
            for (int j=1; j<=i; j++) { 
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
