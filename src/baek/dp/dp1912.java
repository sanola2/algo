package baek.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dp1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[num];
        int[] dp = new int[num];

        for(int i=0; i< num; i++)
            array[i] = Integer.parseInt(st.nextToken());

        dp[0] = array[0];
        for(int i=1; i< num; i++) {
            dp[i] = array[i];
            if(dp[i-1] + dp[i] > dp[i])
                dp[i] = dp[i-1] + dp[i];
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
