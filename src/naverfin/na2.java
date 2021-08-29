package naverfin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class na2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{3, 2, 4, 3}, 2, 4));
		System.out.println(solution(new int[]{1, 5, 6}, 4, 3));
		System.out.println(solution(new int[]{1, 2, 3, 4}, 4, 6));
		System.out.println(solution(new int[]{6, 1}, 1, 1));
		System.out.println(solution(new int[]{1}, 100000, 2));
	}

	public static int[] solution(int[] A, int F, int M) {
		int sumOfKnownRollResult = Arrays.stream(A).sum();
		int totalRollsNumber = A.length + F;
		int leftTotalNumber = M * totalRollsNumber - sumOfKnownRollResult;

		if (6 * F < leftTotalNumber) {
			return new int[]{0};
		}

		if (F > leftTotalNumber) {
			return new int[]{0};
		}

		List<Integer> forgotNumbers = new ArrayList<>();
		for (int i = 0; i < F; i++) {
			forgotNumbers.add(1);
			leftTotalNumber--;
		}

		int idx = 0;
		while (leftTotalNumber > 0) {
			int num = forgotNumbers.get(idx);

			if (leftTotalNumber >= 5) {
				forgotNumbers.set(idx, num + 5);
				leftTotalNumber -= 5;
			} else {
				forgotNumbers.set(idx, num + leftTotalNumber);
				leftTotalNumber = 0;
			}
			idx++;
		}

		return forgotNumbers.stream().mapToInt(i -> i).toArray();
	}
}
