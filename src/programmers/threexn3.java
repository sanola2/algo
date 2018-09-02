package programmers;

public class threexn3 {
    static public void main(String[] args) {
        int n = 40;

        if(n%2 ==1) System.out.println(0);
        n /= 2;
        long[] dp = new long[n+1];
        long sum = 1;

        dp[0] = 3;

        for(int i=1; i< n; i++) {
            dp[i] = dp[i-1]*3 + 2*sum;
            sum += dp[i-1];
            dp[i] %= 1000000007;
        }
        System.out.println(dp[n-1]);
    }
}
