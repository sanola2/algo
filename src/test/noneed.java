package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class noneed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        if(Character.getNumericValue(num.charAt(0)) == 0) {
            System.out.println(0);
            return;
        }
        long[] dp = new long[num.length()+1];
        int mod = 1000000;

        dp[0] = 1;
        for(int i=1; i<= num.length(); i++) {
            if(1<= Character.getNumericValue(num.charAt(i-1)) && Character.getNumericValue(num.charAt(i-1)) <= 9)
                dp[i] += dp[i-1];
            if(i == 1)
                continue;
            if(Character.getNumericValue(num.charAt(i-2)) ==0)
                continue;
            int number = Character.getNumericValue(num.charAt(i-2)) * 10 + Character.getNumericValue(num.charAt(i-1));
            if(number>= 10 && number<= 26) {
                dp[i] += dp[i-2];
                dp[i] %= mod;
            }
        }
        System.out.println(dp[num.length()]%mod);
    }
}
