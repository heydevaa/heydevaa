class Solution {
    public int reverseDegree(String s) {
        int reverseddegree = 0;
        for(int i=0; i<s.length();i++){
            char ch =s.charAt(i);
            int value = 26-(ch - 'a');
            int product= value*(i+1);
            reverseddegree+=product;
        } 
        return reverseddegree;
    }
    
}