package naverfin;

import java.util.*;

public class na3 {
	public static void main(String[] args) {
		System.out.println(solution(200));
	}

	public static int solution(int N) {
		Set<Long> temp = new HashSet<>();

		for (int i = 0; i < 30; i++) {
			temp.add(Math.round(Math.pow(2, i)));
		}

		for (int i = 0; i < 30; i++) {
			temp.add(Math.round(Math.pow(3, i)));
		}

		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				temp.add(Math.round(Math.pow(2, i) * Math.pow(3, j)));
			}
		}

		List<Long> sortList = new ArrayList<>(temp);
		Collections.sort(sortList);
		return sortList.get(N).intValue();
	}
}
