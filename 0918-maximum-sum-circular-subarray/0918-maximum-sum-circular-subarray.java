class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxSum = Integer.MIN_VALUE;
        int maxCurrent = 0;

        int minSum = Integer.MAX_VALUE;
        int minCurrent = 0;

        for (int i = 0; i < nums.length; i++) {

            // Maximum subarray
            maxCurrent = maxCurrent + nums[i];
            maxSum = Math.max(maxSum, maxCurrent);

            if (maxCurrent < 0) {
                maxCurrent = 0;
            }

            // Minimum subarray
            minCurrent = minCurrent + nums[i];
            minSum = Math.min(minSum, minCurrent);

            if (minCurrent > 0) {
                minCurrent = 0;
            }

            total = total + nums[i];
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        } else {
            int circularSum = total - minSum;

            total=Math.max(maxSum, circularSum);
        }
        return total;
    }
}