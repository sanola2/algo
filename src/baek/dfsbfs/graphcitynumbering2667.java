package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class graphcitynumbering2667 {
    static int cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine()) + 2;
        int[][] array = new int[num][num];
        boolean[][] check = new boolean[num][num];
        ArrayList answer = new ArrayList();

        for(int i=1; i< num-1; i++) {
            String st = br.readLine();
            String[] sst = st.split("");
            for(int j=1; j< num-1; j++) {
                array[i][j] = Integer.valueOf(sst[j-1]);
            }
        }

        for(int i=1; i< num-1; i++) {
            for(int j=1; j< num-1; j++) {
                if(array[i][j] != 0 && !check[i][j]) {
                    cnt = 0;
                    dfs(check, array, i, j);
                    answer.add(cnt);
                }
            }
        }
        System.out.println(answer.size());
        answer.stream().sorted().forEach(System.out::println);
    }

    static void dfs(boolean[][] check, int[][] array, int x, int y) {
        if(check[x][y])
            return;
        cnt++;
        check[x][y] = true;

        if (array[x + 1][y] != 0 && !check[x + 1][y])
            dfs(check, array, x + 1, y);
        if (array[x - 1][y] != 0 && !check[x - 1][y])
            dfs(check, array, x - 1, y);
        if (array[x][y + 1] != 0 && !check[x][y + 1])
            dfs(check, array, x, y + 1);
        if (array[x][y - 1] != 0 && !check[x][y - 1])
            dfs(check, array, x, y - 1);
    }
}
