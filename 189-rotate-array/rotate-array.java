class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;//[123456]
        int n = nums.length;
        reverseArray(nums,0,n-1);//reverse[654321]
        reverseArray(nums,0,k-1);//reverse[456321]
        reverseArray(nums,k,n-1);//reverse[456123]
    }
        public static void reverseArray(int[]nums,int start,int end){
            while(start<end){
                int temp =nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
    }
