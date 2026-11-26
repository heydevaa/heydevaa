class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i =0,j=0;
        int count=0;
        int max= Integer.MIN_VALUE;
        while(j<nums.length){
            if(nums[j]==1){
                count++;
            } else if (nums[j]==0){
                count=0;
            }
            max=Math.max(max,count);
            j++;
        }
        return max;
    }
}
       

