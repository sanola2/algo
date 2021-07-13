package skt;

import java.util.LinkedList;
import java.util.Queue;

public class s4 {
	public static void main(String[] args) {
		System.out.println(solution(2, new int[][]{{0, 0, 0, 0}, {0, 0, 1, 0}, {1, 0, 0, 1}})); // 2
		System.out.println(solution(1, new int[][]{{0, 1}, {0, 0}})); // 2
		System.out.println(solution(4, new int[][]{{0, 0, 0, 1}, {0, 1, 0, 0}, {0, 0, 1, 0}, {1, 0, 0, 0}, {0, 0, 0, 0}})); // 8
	}

	public static int solution(int K, int[][] A) {
		int xLength = A.length;
		int yLength = A[0].length;
		int count = 0;
		int houseNumber = 0;

		int[][] storeLocation = new int[xLength][yLength];

		for (int i = 0; i < xLength; i++) {
			for (int j = 0; j < yLength; j++) {
				if (A[i][j] == 1) {
					houseNumber++;
					bfs(storeLocation, A, K, i, j);
				}
			}
		}

		for (int i = 0; i < xLength; i++) {
			for (int j = 0; j < yLength; j++) {
				if (storeLocation[i][j] == houseNumber) {
					count++;
				}
			}
		}

		return count;
	}

	static void bfs(int[][] storeLocation, int[][] array, int K, int x, int y) {
		boolean[][] check = new boolean[array.length][array[0].length];

		Queue<XY> queue = new LinkedList<>();
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		int depthSize = 1;

		queue.add(new XY(x, y));
		check[x][y] = true;
		while (!queue.isEmpty()) {
			int queueSize = queue.size();

			for (int j = 0; j < queueSize; j++) {
				XY now = queue.poll();
				for (int i = 0; i < 4; i++) {
					int nx = now.x + dx[i];
					int ny = now.y + dy[i];

					if (0 <= nx && nx < array.length && 0 <= ny && ny < array[0].length && depthSize <= K) {
						if (!check[nx][ny]) {
							queue.add(new XY(nx, ny));
							check[nx][ny] = true;
							storeLocation[nx][ny]++;
						}
					}
				}
			}
			depthSize++;
		}
	}
}

class XY {
	int x, y;

	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}