class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i = 0, j=0;
        int sum1 = 0;
        int sum2 = 0;
        int max = Integer.MIN_VALUE;
        while(j<grumpy.length){
            if(grumpy[j]==1){
                sum1+=customers[j];
            }
            if(grumpy[j]==0){
                sum2+=customers[j];
            }
            while(j-i+1>minutes){
                if(grumpy[i]==1){
                    sum1-=customers[i];
                }
                i++;
            }
            if(j-i+1==minutes){
                max=Math.max(max,sum1);
            }
            j++;
        }
        return max+sum2;
    }
}