class Solution {
    public int maxVowels(String s, int k) {
        int i=0,j=0;
        int count = 0;
        int max = 0;
        while(j<s.length()){
            char b=s.charAt(j);
            while(j-i+1>k){
                char a=s.charAt(i);
                if("aeiou".indexOf(a)!=-1){
                    count--;
                }
                i++;
            }
            if("aeiou".indexOf(b)!=-1){
                count++;
            }
            if(j-i+1==k){
                max=Math.max(max,count);
            }
            j++;
        }
        return max;
    }
}