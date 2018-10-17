package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 원래 맵 저장 할 array, 증식시켜가면서 거리 구하고 시작지점마다 초기화 될 함수속 array와 같은 array
 * 그리고 거리 저장할 dist 배열들 필요(땅은 0, 바다는 -1) 거리구하는 시작점은 땅인 점들 큐에 넣어놓기.
 */
public class island2146 {
    static Queue<Dot> points = new LinkedList<>();
    static int answer = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());
        int[][] array = new int[num][num];
        int[][] dist = new int[num][num];
        boolean[][] check = new boolean[num][num];
        int cnt = 1;

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j< num; j++) {
                array[i][j] = Integer.valueOf(st.nextToken());
                dist[i][j] = -1;
                if(array[i][j] > 0) {
                    dist[i][j] = 0;
                    points.offer(new Dot(i, j));
                }
            }
        }

        for(int i=0; i< num; i++) {
            for(int j=0; j< num; j++) {
                if(!check[i][j] && array[i][j] != 0) {
                    bfs(check, array, i, j, cnt);
                    cnt++;
                }
            }
        }

        for(Dot point : points) {
            makeBridge(array, dist, point.x, point.y);
        }
        System.out.println(answer);
    }

    static void bfs(boolean[][] check, int[][] array, int x, int y, int index) {
        Queue<Dot> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        array[x][y] = index;
        check[x][y] = true;
        queue.offer(new Dot(x, y));

        while (!queue.isEmpty()) {
            Dot xy = queue.poll();

            for(int i=0; i< 4; i++) {
                int nx = xy.x + dx[i];
                int ny = xy.y + dy[i];

                if(0<= nx && nx < array.length && 0<= ny && ny < array[0].length) {
                    if(!check[nx][ny]) {
                        if(array[nx][ny] != 0) {
                            array[nx][ny] = index;
                            check[nx][ny] = true;
                            queue.offer(new Dot(nx, ny));
                        }
                    }
                }
            }
        }
    }
    static void makeBridge(int[][] array2, int[][] dist, int x, int y) {
        Queue<Dot> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int[][] array = new int[array2.length][array2[0].length];

        for(int i=0; i< array.length; i++) {
            for(int j=0; j< array[0].length; j++) {
                array[i][j] = array2[i][j];
            }
        }
        queue.offer(new Dot(x, y));

        while (!queue.isEmpty()) {
            Dot xy = queue.poll();

            for(int i=0; i< 4; i++) {
                int nx = xy.x + dx[i];
                int ny = xy.y + dy[i];

                if(0<= nx && nx < array.length && 0<= ny && ny < array[0].length) {
                    if(array[nx][ny] != 0 && array[nx][ny] != array[xy.x][xy.y]) {
                        if(answer == 0 || answer > dist[xy.x][xy.y])
                            answer = dist[xy.x][xy.y];
                    }
                    if(array[nx][ny] == 0) {
                        dist[nx][ny] = dist[xy.x][xy.y] +1;
                        array[nx][ny] = array[xy.x][xy.y];
                        queue.offer(new Dot(nx, ny));
                    }
                }
            }
        }
    }
}

class Dot {
    int x, y;
    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}