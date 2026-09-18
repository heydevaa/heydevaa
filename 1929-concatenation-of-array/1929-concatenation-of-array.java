class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] nums={1,2,1};
        int[] result=getConcatenation(nums);
        for(int i=0;i<result.length;i++){
            System.out.print("Ans :"+result[i]);
        }
    }
}