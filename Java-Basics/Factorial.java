public class Factorial {

    public static int fact(int n) {
        int f = 1;

        if(n==0) {
            return 1;
        } else {
            for(int i =1; i<=n; i++) {
                f = f*i;
            }
        }
        return f;
    }

    // Binomial Coefficient nCr = n! / (r! * (n-r)!)
    public static int binCoeff(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String args[]) {
        System.out.println("Factorial is: " + fact(5));
        System.out.println("Binomial Coefficient is: " + binCoeff(4, 2));
    }
}