class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[grid.length-1][grid[0].length-1] == 1) return 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return func(grid,0,0,grid.length,grid[0].length,dp);
    }
    public int func(int[][] grid, int i, int j,int n, int m,int[][] dp){
        if(i == n-1 && j == m-1) return 1;
        if(i >= n || j >= m) return 0;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1)return dp[i][j];
        int r=0;
        int c=0;
        if(grid[i][j] != 1){
            r = func(grid,i+1,j,n,m,dp);
            c = func(grid,i,j+1,n,m,dp);
        }

        return dp[i][j] = r+c;
        
    }
}
