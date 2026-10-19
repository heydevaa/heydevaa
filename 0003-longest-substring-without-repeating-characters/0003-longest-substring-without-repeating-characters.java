class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int count = 0;
        int max= 0;
        HashSet<Character> ans = new HashSet<>();
        while(j<s.length()){
            char a=s.charAt(j);
            while(ans.contains(a)){
                char b=s.charAt(i);
                ans.remove(b);
                count--;
                i++;
            }
            ans.add(a);
            count++;
            j++;
            if(count>=max){
            max=Math.max(max,count);
            }
        }
        return max;
    }
}