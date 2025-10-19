public class isPrime {

    // for no. n>=2
    public static boolean isPrime(int n) {
        // corner cases
        //2
        if( n == 2) {
            return true;
        }

        for (int i=2; i<=(n-1); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Optimized ver using square root
    public static boolean isPrimeNum(int n) {

        if (n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    // print all primes in range
    public static void primesInRange(int n) {
        for (int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]) {
        System.out.println(isPrimeNum(12));
        primesInRange(20); // 2 to 20
    }
}
