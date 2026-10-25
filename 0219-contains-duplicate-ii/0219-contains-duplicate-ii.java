class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0 ){ return false;}
        int i=0,j=0;
        HashSet<Integer> ans = new HashSet<>();
        while(j<nums.length){
            while(ans.contains(nums[j])){
                return true;
            }
            if(j-i+1>k){
                ans.remove(nums[i]);
                i++;
            }
            ans.add(nums[j]);
            j++;
        }
        return false;
    }
}