class Solution {
    public int[] decrypt(int[] code, int k) {
        int i = 0, j=0;
        int[] ans = new int[code.length];
        while(j<code.length){
            int sum = 0;
            for(int p =1; p<=Math.abs(k); p++){
                if(k>0){
                    sum+=code[(i+p)%code.length];
                } else if(k<0){
                    sum+=code[(i-p+code.length)%code.length];
                }
            }
            ans[i]=sum;
            i++;
            if(k==0){
                return ans;
            }
            j++;
        }
        return ans;
    }
}