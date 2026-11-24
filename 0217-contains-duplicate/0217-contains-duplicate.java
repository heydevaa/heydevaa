class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int element : nums){
            if(ans.contains(element)){
                return true;
            }
            ans.add(element);
        }
        return false;
    }
}