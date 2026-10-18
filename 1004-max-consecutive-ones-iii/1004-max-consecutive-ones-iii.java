class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int zeros = 0;
        int max = Integer.MIN_VALUE;
        while(j<nums.length){
            if(nums[j]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[i]==0){
                    zeros--;
                }
                i++;
            }
            if(zeros<=k){
                max=Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}