package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class graphtomato7576 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.valueOf(st.nextToken());
        int x = Integer.valueOf(st.nextToken());
        int[][] array = new int[x][y];
        LinkedList<Point> start = new LinkedList<>();

        for(int i=0; i< x; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j< y; j++) {
                array[i][j] = Integer.valueOf(st.nextToken());
                if(array[i][j] == 1)
                    start.add(new Point(i, j));
            }
        }

        for(Point xy : start) {
            bfs(array, xy.x, xy.y);
        }

        int max = 0;
        for(int i=0; i< x; i++) {
            for(int j=0; j< y; j++) {
                if(array[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                if(max < array[i][j])
                    max = array[i][j];
            }
        }
        System.out.println(max-1);
    }

    static void bfs(int[][] array, int x, int y) {
        Queue<Point> queue = new LinkedList();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        array[x][y] = 1;
        queue.add(new Point(x, y));

        while (!queue.isEmpty()) {
            Point xy = queue.poll();

            for(int i=0; i< 4; i++) {
                int nx = dx[i] + xy.x;
                int ny = dy[i] + xy.y;
                if(0<= nx && nx< array.length && 0<= ny && ny < array[0].length) {
                    if(array[nx][ny] == 0 || array[xy.x][xy.y]+1 < array[nx][ny]) {
                        array[nx][ny] = array[xy.x][xy.y]+1;
                        queue.add(new Point(nx, ny));
                    }
                }
            }
        }
    }

    static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
