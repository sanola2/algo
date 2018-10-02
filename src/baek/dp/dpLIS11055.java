package baek.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dpLIS11055 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) + 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[num];
        int[] dp = new int[num];

        for(int i=1; i< num; i++)
            array[i] = Integer.parseInt(st.nextToken());

        for(int i=1; i< num; i++) {
            dp[i] = array[i];
            for(int j=1; j< i; j++) {
                if(array[j] < array[i]) {
                    if(dp[i] < dp[j] + array[i])
                        dp[i] = dp[j] + array[i];
                }
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
