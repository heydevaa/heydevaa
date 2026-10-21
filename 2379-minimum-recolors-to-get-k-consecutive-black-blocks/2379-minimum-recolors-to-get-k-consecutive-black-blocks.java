class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0,j=0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        while(j<blocks.length()){
            char a = blocks.charAt(j);
            if(a=='W'){
                count++;
            }
            while(j-i+1>k){
                char b = blocks.charAt(i);
                if(b=='W'){
                    count--;
                }
                i++;
            }
            if(j-i+1==k){
                min = Math.min(min,count);
            }
            j++;
        }
        return min;
    }
}