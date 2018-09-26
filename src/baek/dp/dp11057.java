package baek.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dp11057 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] dp = new int[num][10];

        for(int i=0; i< 10; i++)
            dp[0][i] = 1;

        for(int i=1; i< num; i++) {
            for(int j=0; j< 10; j++) {
                for(int k=0; k<= j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        long answer = 0;
        for(int i=0; i< 10; i++)
            answer += dp[num-1][i];
        answer %= 10007;
        System.out.println(answer);
    }
}
