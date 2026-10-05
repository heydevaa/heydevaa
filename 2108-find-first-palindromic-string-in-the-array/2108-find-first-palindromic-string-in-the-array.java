class Solution {
    public String firstPalindrome(String[] words){
        for(int k = 0; k<words.length; k ++){
            int i = 0, j = words[k].length()-1;
            boolean isboolean = true;
            while(i<j){
                char left = words[k].charAt(i);
                char right = words[k].charAt(j);
                if(left==right){
                    i++;
                    j--;
                } else { 
                    isboolean = false;
                    break;
                }
            }
            if(isboolean){
                return words[k];
            }
        }
        return "";
    }
}