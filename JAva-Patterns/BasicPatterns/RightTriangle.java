public class RightTriangle {

    public static void main(String []args) {
        int row = 4;
        int col = 5;
        int n = 9;

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
