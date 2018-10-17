package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class maze2178 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());
        int[][] maze = new int[x][y];

        for(int i=0; i< x; i++) {
            String[] nums = br.readLine().split("");
            for(int j=0; j< y; j++) {
                maze[i][j] = Integer.valueOf(nums[j]);
            }
        }
        bfs(maze);

        System.out.println(maze[x-1][y-1]);
    }

    static void bfs(int[][] maze) {
        Queue<Point> queue = new LinkedList<>();
        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};
        queue.offer(new Point(0, 0));

        while (!queue.isEmpty()) {
            Point xy = queue.poll();

            for(int i=0; i< 4; i++) {
                int dx = xy.x + x[i];
                int dy = xy.y + y[i];

                if(0<= dx && dx < maze.length && 0<= dy && dy < maze[0].length) {
                    if(maze[dx][dy] == 1 || maze[dx][dy] > maze[xy.x][xy.y] +1) {
                        maze[dx][dy] = maze[xy.x][xy.y] + 1;
                        queue.offer(new Point(dx, dy));
                    }
                }
            }
        }
    }
}
