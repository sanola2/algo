package naverweb;

import java.util.Arrays;

public class p1 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{13000, 88000, 10000}, new int[]{30, 20}));
		System.out.println(solution(new int[]{32000, 18000, 42500}, new int[]{50, 20, 65}));
	}

	public static int solution(int[] prices, int[] discounts) {
		Arrays.sort(prices);
		Arrays.sort(discounts);

		int j = prices.length - 1;
		for (int i = discounts.length - 1; i >= 0; i--) {
			prices[j] = (prices[j] * (100 - discounts[i])) / 100;
			j--;
		}

		return Arrays.stream(prices).sum();
	}
}
