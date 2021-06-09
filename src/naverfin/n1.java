package naverfin;

import java.util.Arrays;

public class n1 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 6, 1, 1}, new int[]{4, 2, 5, 3, 6}));
		System.out.println(solution(new int[]{4, 2, 5, 3, 6}, new int[]{1, 6, 1, 1}));
		System.out.println(solution(new int[]{4, 2, 5, 3, 7}, new int[]{1, 6, 1, 1}));
		System.out.println(solution(new int[]{2, 1}, new int[]{3, 3}));
	}

	static int incorrectSolution(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int i = 0;
		for (int k = 0; k < n; k++) {
			if (i < m - 1 && B[i] < A[k])
				i += 1;
			if (A[k] == B[i])
				return A[k];
		}
		return -1;
	}

	static int solution(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int i = 0;
		for (int k = 0; k < n; k++) {
			if (i < m - 1 && B[i] < A[k])
				i += 1;
			for (int j = 0; j < m; j++)
				if (A[k] == B[j])
					return A[k];
		}
		return -1;
	}
}

