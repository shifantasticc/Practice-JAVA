public class ArrayQ2 {
    // Q-2 use binary search method!!
    public static int printIndex(int nums[], int target) {
        int result = -1;
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println(printIndex(nums, target));
    }
}
