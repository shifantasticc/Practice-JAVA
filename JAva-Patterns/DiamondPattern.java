public class DiamondPattern {
    public static void main(String []args) {
        int n = 4;

        System.out.println("Butterfly Pattern");
        // 1st half
        for (int i=1; i<=n; i++) {

            // Spaces i
            for (int j=1; j<=n-i; j++) { 
                System.out.print(" ");
            }

            // Stars (2*i)-1
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 2nd half
        for (int i=n; i>=1; i--) {

            // Spaces i
            for (int j=1; j<=n-i; j++) { 
                System.out.print(" ");
            }

            // Stars (2*i)-1
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
