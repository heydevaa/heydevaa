class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0;
        int zeros = 0;
        int max = Integer.MIN_VALUE;
        while(j<nums.length){
            if(nums[j]==0){
                zeros++;
            }
            while(zeros>1){
                if(nums[i]==0){
                    zeros--;
                }
                i++;
            }
            if(zeros<=1){
                max=Math.max(max,j-i);
            }
            j++;
        }
        return max;
    }
}