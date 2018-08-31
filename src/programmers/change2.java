package programmers;

public class change2 {
    public static void main(String[] args) {
        int n = 5;
        int[] money = {1,2,5};

        int answer;
        int[][] dp = new int [money.length][n+1];

        for(int i=0; i<= n; i++) {
            dp[0][i] = i%money[0]==0?1:0;
        }

        for(int i=1; i< money.length; i++) {
            for(int j=0; j<= n; j++) {
                dp[i][j] = dp[i-1][j];
                //시간초과 3중 포문 없애야..
                if(j >= money[i])
                    dp[i][j] += dp[i][j-money[i]];
                dp[i][j] %= 1000000007;
            }
        }
        answer = dp[money.length-1][n];
        System.out.println(dp[money.length-2][n]);
    }
}
