class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rowst=0;
        int rowend=m-1;
        int colst=0;
        int colend=n-1;
        List<Integer> ans = new ArrayList<>();
        while(rowst<=rowend && colst<=colend){
            for(int col=colst; col<=colend;col++){
                ans.add(matrix[rowst][col]);
            }
            rowst++;
            for(int row=rowst; row<=rowend; row++){
                ans.add(matrix[row][colend]);
            }
            colend--;
            for(int col=colend; col>=colst;col--){
                if(rowst<=rowend){
                ans.add(matrix[rowend][col]);
                }
            }
            rowend--;
            for(int row=rowend; row>=rowst; row--){
                if(colst<=colend){
                ans.add(matrix[row][colst]);
                }
            }
            colst++;
        }
        return ans;
    }
}

        