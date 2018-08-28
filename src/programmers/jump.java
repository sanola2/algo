package programmers;

public class jump {
    public static void main(String args[]) {
        int n = 1;
        long[] dp = new long[n+1];

        dp[0] = 1;
        dp[1] = 2;
        for(int i=2; i< n; i++) {
            dp[i] = dp[i-2] +dp[i-1];
            dp[i] %= 1234567;
        }
        System.out.println(dp[n-1]);
    }
}
