package offer10_1;
/*
dp的方法，自底向上
 */
public class Solution2 {
    public int fib(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        if(n>0) dp[1] = 1;
        for(int i=2; i<n+1; ++i){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];
    }
}
