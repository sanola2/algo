package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {
	public static void main(String[] args) {
		int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
		System.out.println(solution(maps));
	}

	public static int solution(int[][] maps) {
		int[][] check = new int[maps.length][maps[0].length];

		return bfs(check, maps);
	}

	private static int bfs(int[][] check, int[][] array) {
		Queue<Point> queue = new LinkedList<>();
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		queue.add(new Point(0, 0));
		check[0][0] = 1;

		while (!queue.isEmpty()) {
			Point now = queue.poll();
			int x = now.x;
			int y = now.y;

			if (x == array.length - 1 && y == array[0].length - 1) return check[x][y];

			for (int i = 0; i < 4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];

				if (0 <= nx && nx < array.length && 0 <= ny && ny < array[0].length) {
					if (check[nx][ny] == 0 && array[nx][ny] == 1) {
						check[nx][ny] = check[x][y] + 1;
						queue.add(new Point(nx, ny));
					}
				}
			}
		}

		return -1;
	}
}

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
