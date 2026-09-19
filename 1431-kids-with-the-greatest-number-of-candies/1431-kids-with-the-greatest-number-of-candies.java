class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        List<Boolean> result= new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int x= candies[i]+extraCandies;
            if(x >= max){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> result = kidsWithCandies(candies,extraCandies);
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");

        }
    }
}