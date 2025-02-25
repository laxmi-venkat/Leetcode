class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int s, int e) {
        if (s > e) { // Base case: element not found
            return -1;
        }

        int mid = s + (e - s) / 2; // Prevents overflow

        if (nums[mid] == target) { // Found target
            return mid;
        }

        if (target < nums[mid]) {
            return binarySearch(nums, target, s, mid - 1); // Search left half
        } else {
            return binarySearch(nums, target, mid + 1, e); // Search right half
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int index = solution.search(nums, target);
        System.out.println("Index of " + target + ": " + index); // Expected Output: 4
    }
}
