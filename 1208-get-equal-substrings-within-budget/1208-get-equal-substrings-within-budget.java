class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0, j =0;
        int cost = 0;
        int max = 0;
        while(j<s.length()){
            char a = s.charAt(j);
            char b = t.charAt(j);
            cost += Math.abs(a-b);
            while(cost>maxCost){
                char c = s.charAt(i);
                char d = t.charAt(i);
                cost -= Math.abs(c-d);
                i++;
            }
            if(cost<=maxCost){
                max = Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}