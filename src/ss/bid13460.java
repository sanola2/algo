package ss;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bid13460 {
    static String[][] map;
    static int cnt = 0;
    static int[] dx = {-1, 1, 0, 0}; // 위, 아래, 왼, 오
    static int[] dy = {0, 0, -1, 1};
    static Point ball = new Point();
    static boolean[][][][] check = new boolean[10][10][10][10];
    static int answer = -1;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int hx = 0, hy = 0;
        map = new String[x][y];

        for(int i=0; i< x; i++) {
            st = new StringTokenizer(br.readLine());
            String[] words = st.nextToken().split("");
            for(int j=0; j< y; j++) {
                map[i][j] = words[j];
                if(map[i][j].equals("R")) {
                    ball.rx = i;
                    ball.ry = j;
                }
                if(map[i][j].equals("B")) {
                    ball.bx = i;
                    ball.by = j;
                }
                if(map[i][j].equals("O")) {
                    hx = i;
                    hy = j;
                }
            }
        }

        Queue<Point> queue = new LinkedList();
        queue.offer(ball);
        check[ball.rx][ball.ry][ball.bx][ball.by] = true;

        while (!queue.isEmpty()) {
            Point cPoint = queue.poll();
            if(ball.depth > 10) {
                break;
            }
            if(ball.rx == hx && ball.ry == hy) {
                answer = ball.depth;
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = cPoint.rx + dx[i];
                int ny = cPoint.ry + dy[i];
                if (map[nx][ny].equals(".")) {
                    move(i, nx, ny, 0);
                }
                int nbx = cPoint.bx + dx[i];
                int nby = cPoint.by + dy[i];
                if (map[nbx][nby].equals(".")) {
                    move(i, nbx, nby, 1);
                }

                if(ball.rx == ball.bx && ball.ry == ball.by) {
                    switch(i) {
                        case 0:
                            if(cPoint.rx > cPoint.bx)
                                ball.rx++;
                            else
                                ball.bx++;
                            break;
                        case 1:
                            if(cPoint.rx > cPoint.bx)
                                ball.bx--;
                            else
                                ball.rx--;
                            break;
                        case 2:
                            if(cPoint.ry > cPoint.by)
                                ball.ry++;
                            else
                                ball.by++;
                            break;
                        case 3:
                            if(cPoint.ry > cPoint.by)
                                ball.by--;
                            else
                                ball.ry--;
                            break;
                    }
                }
                if(!check[ball.rx][ball.ry][ball.bx][ball.by]) {
                    check[ball.rx][ball.ry][ball.bx][ball.by] = true;
                    ball.depth++;
                    queue.add(ball);
                    System.out.println(" rx : " + ball.rx);
                    System.out.println(" ry : " + ball.ry);
                    System.out.println(" bx : " + ball.bx);
                    System.out.println(" by : " + ball.by);
                }
            }
        }
        System.out.println(answer);
    }
    static void move(int direction, int x, int y, int flag) {
        while (true) {
            if (flag == 0) {
                ball.rx += dx[direction];
                ball.ry += dx[direction];

                if (map[ball.rx][ball.ry].equals("#")) {
                    ball.rx -= dx[direction];
                    ball.ry -= dx[direction];
                    break;
                } else if (map[ball.rx][ball.ry].equals("O"))
                    break;
            }
            if (flag == 1) {
                ball.bx += dx[direction];
                ball.by += dx[direction];

                if (map[ball.bx][ball.by].equals("#")) {
                    ball.bx -= dx[direction];
                    ball.by -= dx[direction];
                    break;
                } else if (map[ball.bx][ball.by].equals("O"))
                    break;
            }
        }
    }
    static class Point {
        int depth, rx, ry, bx, by;
    }
}
