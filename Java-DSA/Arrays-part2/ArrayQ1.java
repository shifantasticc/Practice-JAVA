public class ArrayQ1 {
    // Q-1
    public static boolean SimilarInArray(int num[]) {
        // Using Brute Force
        for (int i=0; i<num.length; i++) {
            for (int j=i+1; j<num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(SimilarInArray(num));
        
    }
}
