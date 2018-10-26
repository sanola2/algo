package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class pandaDpDfs1937 {
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int answer = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] array = new int[num][num];
        int[][] check = new int[num][num];

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j< num; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i< num; i++) {
            for(int j=0; j< num; j++) {
                if(check[i][j] == 0)
                    dfs(check, array, i, j);
            }
        }
        System.out.println(answer);
    }
    static int dfs(int[][] check, int[][] array, int x, int y) {
        int num = 1;
        int max = 0;
        for(int i=0; i< 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(0<= nx && nx < array.length && 0<= ny && ny < array[0].length && array[nx][ny] > array[x][y]) {
                if(check[nx][ny] != 0) {
                    num += check[nx][ny];
                } else
                    num += dfs(check, array, nx, ny);
            }
            if(answer < num)
                answer = num;
            if(num > check[x][y])
                check[x][y] = num;
            if(max < num)
                max = num;
            num = 1;
        }
        return max;
    }
    int betterDfs(int[][] dp, int[][] a, int x, int y) {
        if (dp[x][y] !=0 ) return dp[x][y];
        dp[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (a[x][y] < a[nx][ny])
                dp[x][y] = max(dp[x][y], dfs(dp, a, nx, ny) + 1);
        }
        return dp[x][y];
    }
}
