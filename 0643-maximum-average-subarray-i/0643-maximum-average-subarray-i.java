class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        int sum = 0;
        int maxS= Integer.MIN_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1==k){
                maxS= Math.max(maxS,sum);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return (double) maxS/k;
    }
}