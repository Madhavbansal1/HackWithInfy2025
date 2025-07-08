class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        return print(s, 0, s.length() - 1,dp);
    }

    public static int print(String ques, int i, int j,int[][] dp){
        if (i > j) {
            return 0;
        }
        
        if (i == j) {
            return 1;
        }
        if(dp[i][j] != 0) return dp[i][j];
        if (ques.charAt(i) == ques.charAt(j)) {
            return dp[i][j] = 2 + print(ques, i + 1, j - 1,dp);  
        } else {
            int withoutFirstCharacter = print(ques, i + 1, j,dp);
            int withoutLastCharacter = print(ques, i, j - 1,dp);
            return dp[i][j]=Math.max(withoutFirstCharacter, withoutLastCharacter);  
        }
    }
}
