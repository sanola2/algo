package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class graphBfs4963 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.valueOf(st.nextToken());
            int h = Integer.valueOf(st.nextToken());
            if(w==0 && h==0)
                return;
            int[][] array = new int[h][w];
            boolean[][] check = new boolean[h][w];
            int cnt = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    array[i][j] = Integer.valueOf(st.nextToken());
                }
            }

            for(int i=0; i< h; i++) {
                for(int j=0; j< w; j++) {
                    if(!check[i][j] && array[i][j] == 1) {
                        bfs(check, array, i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    static void bfs(boolean[][] check, int[][] array, int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};

        queue.add(new Point(x, y));
        check[x][y] = true;
        while(!queue.isEmpty()) {
            Point now = queue.poll();
            for(int i=0; i< 8; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(0 <= nx && nx < array.length && 0 <= ny && ny < array[0].length) {
                    if(!check[nx][ny] && array[nx][ny] == 1) {
                        queue.add(new Point(nx, ny));
                        check[nx][ny] = true;
                    }
                }
            }
        }
    }
}
class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
