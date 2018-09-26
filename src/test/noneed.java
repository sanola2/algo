package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class noneed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int col = Integer.parseInt(br.readLine());
            int[][] array = new int[col+1][2];

            for(int j=0; j< 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < col; k++) {
                    array[k][j] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] dp = new int[col+1][3];

            for(int j=1; j<= col; j++) {
                dp[j][0] = Math.max(dp[j-1][0], Math.max(dp[j-1][1], dp[j-1][2]));
                dp[j][1] = Math.max(dp[j-1][0], dp[j-1][2]) + array[j-1][0];
                dp[j][2] = Math.max(dp[j-1][0], dp[j-1][1]) + array[j-1][1];
            }

            System.out.println(Math.max(dp[col][0], Math.max(dp[col][1], dp[col][2])));
        }
    }
}
