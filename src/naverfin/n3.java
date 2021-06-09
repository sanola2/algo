package naverfin;

public class n3 {
	public static void main(String[] args) {
		int[][] array;
		array = new int[][]{{4, 3, 4, 5, 3}, {2, 7, 3, 8, 4}, {1, 7, 6, 5, 2}, {8, 4, 9, 5, 5}};
		solution(array);
	}

	public static int solution(int[][] A) {
		int x = A.length;
		int y = A[0].length;

		int rectangleSize = Math.min(x, y);
		int result = 1;

		for (int k = rectangleSize; k > 0; k--) {
			int sum = 0;
			for (int i = 0; i < rectangleSize; i++) {
				int xSum = 0;
				int ySum = 0;
				for (int j = 0; j < rectangleSize; j++) {
					xSum += A[i][j];
					ySum += A[j][i];
				}

				if (sum == 0) {
					sum = xSum;
				} else {
					if(sum != xSum || sum != ySum) {
						continue;
					}
				}
				return rectangleSize;
			}
		}

		return result;
	}
}
