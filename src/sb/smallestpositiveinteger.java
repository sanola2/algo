package sb;

import java.util.Arrays;

public class smallestpositiveinteger {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
	}

	public static int solution(int[] A) {
		A = Arrays.stream(A).sorted().distinct().toArray();

		if (A[A.length - 1] < 0) {
			return 1;
		}

		int aa = 1;
		for (int i = 0; i < A.length; i++) {
			if (aa != A[i]) break;
			aa++;
		}
		return aa;
	}
}
