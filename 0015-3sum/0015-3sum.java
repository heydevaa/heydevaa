class Solution {
    public void threeSumChecker(int k, int[] nums, List<List<Integer>> ans){
        int i=k+1,j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum>0){
                j--;
            } else if (sum<0){
                i++;
            } else {
                ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                i++;
                j--;
            while(i<j && nums[i]==nums[i-1]){
                i++;
            }
            while(i<j && nums[j]==nums[j+1]){
                j--;
            }
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        for(int k=0 ; k<nums.length; k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            threeSumChecker(k,nums,ans);
        }
        return ans;
    }
}


       