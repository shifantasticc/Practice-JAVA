public class KadanesSum {
    // H.W If all values are -ve in an array
     public static void SubarraySum(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<number.length; i++) {
            if (number[i] < 0) {
                currSum = currSum + number[i];
            } else { // if there is a +ve number
                if (currSum < 0) {
                    currSum = 0;
                }
                currSum = currSum + number[i];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum is : " + maxSum);
    }

     // MAX subarray sum -3 Kadane's Sum
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum is : " + maxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int number[] = {-1, -3, -6, -4, -5,}; // If all values are in -ve
        SubarraySum(number);
        maxSubarraySum(numbers);
    }
}
