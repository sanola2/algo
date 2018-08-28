package baek;

import java.util.Scanner;

public class ninezeroninefive {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i< num; i++) {
            int a = sc.nextInt();
            int[] dp = new int[a+3];

            dp[0] = 1;
            dp[1] = 2;
            dp[2] = 4;
            if(a > 3) {
                for (int j = 3; j < a; j++) {
                    dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
                }
            }
            System.out.println(dp[a-1]);
        }
    }
}
