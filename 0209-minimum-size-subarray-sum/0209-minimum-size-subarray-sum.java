class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int sum = 0;
        int minL = Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            j++;
            while(sum>=target){
                minL = Math.min(minL,j-i);
                sum-=nums[i];
                i++;
            }
        }
        if(minL==Integer.MAX_VALUE){
                return 0;
            } else {
                return minL;
            }
    }
}
