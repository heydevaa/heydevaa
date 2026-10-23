class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i = 0;
        int j = 0;
        int count1 = 0;
        int count2 = 0;
        int max = Integer.MIN_VALUE;
        while(j<answerKey.length()){
            char a = answerKey.charAt(j);
            if(a == 'T'){
                count1++;
            }
            if(a == 'F'){
                count2++;
            }
            while(count1>k && count2>k){
                char b = answerKey.charAt(i);
                if(b == 'T'){
                    count1--;
                } else if(b == 'F'){
                    count2--;
                }
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        } 
        return max;
    }
}