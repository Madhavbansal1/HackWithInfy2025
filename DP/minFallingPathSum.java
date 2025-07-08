class Solution {
    public int minFallingPathSum(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        for(int[] a: dp){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) ans = Math.min(ans,func(arr,0,i,arr.length,arr[0].length,dp));

        return ans;
    }

    public int func(int[][] arr,int i,int j,int n,int m,int[][] dp){
        if(j<0 || j>=m) return Integer.MAX_VALUE;
        
        if(i == n-1) return arr[i][j];
        
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int ld = func(arr,i+1,j-1,n,m,dp);
        int rd = func(arr,i+1,j+1,n,m,dp);
        int down = func(arr,i+1,j,n,m,dp);

        return dp[i][j] =  Math.min(ld,Math.min(rd,down))+arr[i][j];
    }
}
