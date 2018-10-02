package baek.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dpstair2579 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) + 1;
        int[] array = new int[num];
        int[] dp = new int[num];

        for(int i=1; i< num; i++)
            array[i] = Integer.parseInt(br.readLine());

        dp[1] = array[1];
        dp[2] = array[1] + array[2];
        for(int i=3; i< num; i++)
            dp[i] = Math.max(dp[i-2] + array[i], dp[i-3] + array[i-1] + array[i]);
        System.out.println(dp[num-1]);
    }
}
