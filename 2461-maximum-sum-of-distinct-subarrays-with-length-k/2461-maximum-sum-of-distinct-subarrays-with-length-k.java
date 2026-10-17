class Solution {
    public long maximumSubarraySum(int[] nums, int k){
        int i=0,j=0;
        long sum=0;
        long max=Long.MIN_VALUE;
        HashSet<Integer> ans = new HashSet<>();
        while(j<nums.length){
            while(ans.contains(nums[j])){
                ans.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            ans.add(nums[j]);
            sum+=nums[j];
            if(j-i+1==k && ans.size()==k){
                max = Math.max(max,sum);
                sum-=nums[i];
                ans.remove(nums[i]);
                i++;
            }
        j++;
        }
        if(max==Long.MIN_VALUE){
            return 0;
        } else {
            return max;
        }
    }
}