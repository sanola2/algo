package codility;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{100000}));
	}

	public static int solution(int[] A) {
		int[] sortedA = Arrays.stream(A).distinct()
				.sorted()
				.toArray();

		int min = sortedA[0];
		for (int a : sortedA) {
			if (min < a && min > 0) {
				return min;
			} else {
				if (min < 0) {
					min = a;
				} else {
					min++;
				}
			}
		}
		return min < 0 ? 1 : min;
	}
}
