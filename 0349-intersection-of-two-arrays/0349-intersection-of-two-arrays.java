class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans = new HashSet<>();
        for(int element1 : nums1){
            for(int element2 : nums2){
                if(element1==element2){
                    ans.add(element1);
                }
            }
            
        }
        int[] result = ans.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
        