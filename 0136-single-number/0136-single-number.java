class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int element : nums){
            if(ans.contains(element)){
                ans.remove(element);
            } else {
                ans.add(element);
            }
        }
        int result = ans.iterator().next();
        return result;
    }
}