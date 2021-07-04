package naverweb;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		solution(new int[][]{{1,4}, {3,4}, {3,10}});
	}


	public static int[] solution(int[][] v) {
		List<Integer> x = new ArrayList();
		List<Integer> y = new ArrayList();

		for (int i = 0; i < 3; i++) {
			if (!x.contains(v[i][0])) {
				x.add(v[i][0]);
			} else {
				x.remove(v[i][0]);
			}

			if (!y.contains(v[i][1])) {
				y.add(v[i][1]);
			} else {
				y.remove(v[i][1]);
			}
		}

		return new int[] {x.get(0), y.get(0)};
	}
}
