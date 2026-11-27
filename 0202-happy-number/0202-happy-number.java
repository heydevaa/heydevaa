class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ans = new HashSet<>();
        while(n!=1){
            int sum = 0;
            if(ans.contains(n)){
                return false;
            } else {
                ans.add(n);
                while(n>0){
                    int digit = n%10;
                    sum = sum + digit*digit;
                    n = n/10;
                }
                n = sum;
            }
        }
        return true;
    }
}