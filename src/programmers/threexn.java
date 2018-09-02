package programmers;

public class threexn {
    static public void main(String[] args) {
        int n =40;

        if(n%2 ==1) System.out.println(0);
        long[] dp = new long[n+1];
        long sum = 1;

        dp[0] = 0;
        dp[1] = 3;

        for(int i=3; i< n; i+=2) {
            dp[i] = dp[i-2]*3 + 2*sum;
            sum += dp[i-2];
            dp[i] %= 1000000007;
        }
        System.out.println(dp[n-1]);
    }
}
