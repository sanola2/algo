import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dp {
    public static void main(String[] args) {

    }

    public void modPivonacci() {
        int n = 5;
        int mod = 1234567;
        int p = mod*15;
        long[] dp = new long[n];

        dp[0]=1;
        dp[1]=1;

        for(int i=2; i< n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
            dp[i] %= mod;
        }

        System.out.println(dp[n-1%p]);
    }

    public void biggestRectangle() {
        // int[][] board = new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        int[][] board = new int[][]{{0,0,1,1},{1,1,1,1}};
        int x=board.length, y=board[0].length;
        int[][] dp = new int[x+1][y+1];
        System.out.println(x +""+ y);
        for(int i=0; i< x; i++) {
            for(int j=0; j< y; j++) {
                if(board[i][j] == 1) {
                    dp[i+1][j+1] = 1;
                }
            }
        }

        for(int i=0; i<= x; i++) {
            for(int j=0; j<= y; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println("");
        }


        for(int i=1; i<= x; i++) {
            for(int j=1; j<= y; j++) {
                if(dp[i][j] != 0)
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]), dp[i][j-1]) + 1;
            }
        }

        for(int i=0; i<= x; i++) {
            for(int j=0; j<= y; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println("");
        }

        int big = 0, temp = 0 ;
        for(int i=1; i<= x; i++) {
            temp = Arrays.stream(dp[i]).max().getAsInt();
            if(big < temp)
                big = temp;
        }

        System.out.println(big*big);
    }
}
