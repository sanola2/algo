package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class noneed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[num];
        int[] array2 = new int[num];
        int[] dp = new int[num];
        int[] dp2 = new int[num];

        for(int i=0; i< num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            array2[num-1-i] = array[i];
        }
        for(int i=0; i< num; i++) {
            dp[i] = 1;
            dp2[i] = 1;
            for(int j=0; j< i; j++) {
                if(array[j] < array[i] && dp[i] < (dp[j]+1))
                    dp[i] = dp[j] + 1;
            }
            for(int j=0; j< i; j++) {
                if(array2[j] < array2[i] && dp2[i] < (dp2[j]+1))
                    dp2[i] = dp2[j] + 1;
            }
        }
        int[] answer = new int[num];
        for(int i=0; i< num; i++)
            answer[i] = dp[i] + dp2[num-1-i];
        System.out.println(Arrays.stream(answer).max().getAsInt() -1);
    }
}
