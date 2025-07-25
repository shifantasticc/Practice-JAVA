public class AdvPatterns {

    public static void main(String []args) {
        int row = 4;
        int col = 5;
        int n = 9;

        //Hollow Rectangle Pattern
        // System.out.println("Hollow Rectangle Pattern");
        // for(int i=1; i<=row; i++) {
        //     for(int j=1; j<=col; j++) {
        //         if (i==1 || i==row || j==1 || j==col) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Right Triangle Pattern
        System.out.println("Right Triangle Pattern");
        for(int i=1; i<=n; i++) {
            // Spaces
            for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
