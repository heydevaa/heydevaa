class Solution {
    public int countGoodSubstrings(String s) {
        int i = 0, j= 0;
        int count = 0;
        int k = 3;
        while(j<s.length()){
            if(j-i+1<k){
                j++;
            }
            while(j<s.length() && j-i+1==k){
                char a = s.charAt(i);
                char b = s.charAt(i+1);
                char c = s.charAt(j);
                if(a!=b && b!=c && c!=a){
                    count++;
                }
                i++;
                j++;
            }
        }
        return count;
    }
}
