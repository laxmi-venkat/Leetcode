class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int currentSum = 0;

        // Compute the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        // Sliding window technique
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];  // Slide the window
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / (double) k; // Return max average
    }
}
