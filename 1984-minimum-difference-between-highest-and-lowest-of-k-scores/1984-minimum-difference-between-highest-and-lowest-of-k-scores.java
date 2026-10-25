class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j=0;
        int min = Integer.MAX_VALUE;
        int difference = 0;
        while(j<nums.length){
            if(j-i+1<k){
                j++;
            }
            if(j-i+1 == k){
                difference = nums[j]-nums[i];
                min = Math.min(min,difference);
                i++;
                j++;
            }
        }
        return min;
    }
}
