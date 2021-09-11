package kakaocofe.wt;

public class wt6 {
	public static void main(String[] args) {
		System.out.println(solution(new int[][]{{5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}},
				new int[][]{{1, 0, 0, 3, 4, 4}, {1, 2, 0, 2, 3, 2}, {2, 1, 0, 3, 1, 2}, {1, 0, 1, 3, 3, 1}}));
		// 10
		System.out.println(solution(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
				new int[][]{{1, 1, 1, 2, 2, 4}, {1, 0, 0, 1, 1, 2}, {2, 2, 0, 2, 0, 100}}));
		// 6
	}

	public static int solution(int[][] board, int[][] skill) {
		for (int i = 0; i < skill.length; i++) {
			int type = skill[i][0];
			int r1 = skill[i][1];
			int c1 = skill[i][2];
			int r2 = skill[i][3];
			int c2 = skill[i][4];
			int degree = skill[i][5];

			if (type == 1/*attacked*/) {
				for (int k = r1; k <= r2; k++) {
					for (int l = c1; l <= c2; l++) {
						board[k][l] -= degree;
					}
				}
			} else {
				for (int k = r1; k <= r2; k++) {
					for (int l = c1; l <= c2; l++) {
						board[k][l] += degree;
					}
				}
			}
		}

		int result = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] >= 1) {
					result++;
				}
			}
		}

		return result;
	}

	/*
			public static int solution(int[][] board, int[][] skill) {
		for (int i = 0; i < skill.length; i++) {
			int type = skill[i][0];
			int r1 = skill[i][1];
			int c1 = skill[i][2];
			int r2 = skill[i][3];
			int c2 = skill[i][4];
			int degree = skill[i][5];

			if (type == 1) {
		for (int k = r1; k <= r2; k++) {
			for (int l = c1; l <= c2; l++) {
				board[k][l] -= degree;
			}
		}
	} else {
		for (int k = r1; k <= r2; k++) {
			for (int l = c1; l <= c2; l++) {
				board[k][l] += degree;
			}
		}
	}
}

	int result = 0;
		for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board[0].length; j++) {
		if (board[i][j] >= 1) {
		result++;
		}
		}
		}

		return result;
		}
	 */
}
