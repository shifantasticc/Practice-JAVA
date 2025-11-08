public class ArrayQ4 {
    // Q.4
    public static int calcWater(int height[]) {
        int n = height.length;

        // left max value
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // right max valve
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // loop
        int trappedWater = 0;
        for (int i=0; i<n; i++) {
            // waterlvl = min(leftMax, rightMax)
            int waterlvl = Math.min(leftMax[i], rightMax[i]);

            // trappedwater = waterlvl - height[i]
            trappedWater += waterlvl - height[i];
        }

       return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped water is : " + calcWater(height));
        
    }
}
