package kakaocofe.wt;

import java.util.Arrays;

public class wt4 {
	public static void main(String[] args) {
		Arrays.stream(solution(15, new int[]{10,0,0,0,0,0,0,0,0,0})).forEach( it -> System.out.println(it));
	}

	static int[] ryanBoard;
	static int ryanScore;

	private static void findArrow(final int[] apeechArrow, int idx, int remainArrow, int[] ryansArrow) {
		if (idx == apeechArrow.length) {
			if (remainArrow != 0) {
				ryansArrow[ryansArrow.length - 1] = remainArrow;
			} else {
				ryansArrow[ryansArrow.length - 1] = 0;
			}
			int apeech = 0;
			int ryan = 0;
			for (int i = 0; i < apeechArrow.length; ++i) {
				if (apeechArrow[i] != 0 || ryansArrow[i] != 0) {
					if (ryansArrow[i] > apeechArrow[i]) {
						ryan += 10 - i;
					} else {
						apeech += 10 - i;
					}
				}
			}
			if (ryan > apeech) {
				if (ryanScore < ryan - apeech) {
					ryanScore = ryan - apeech;
					for (int i = 0; i < ryanBoard.length; ++i) {
						ryanBoard[i] = ryansArrow[i];
					}
				} else if (ryanScore == ryan - apeech) {
					boolean isChange = false;
					for (int i = apeechArrow.length - 1; i >= 0; --i) {
						if (ryanBoard[i] < ryansArrow[i]) {
							isChange = true;
							break;
						}
					}
					if (isChange) {
						for (int i = 0; i < ryanBoard.length; ++i) {
							ryanBoard[i] = ryansArrow[i];
						}
					}
				}
			}
			return;
		}
		int choice = apeechArrow[idx] + 1;
		if (remainArrow >= choice) {
			ryansArrow[idx] = choice;
			findArrow(apeechArrow, idx + 1, remainArrow - choice, ryansArrow);
			ryansArrow[idx] = 0;
		}
		findArrow(apeechArrow, idx + 1, remainArrow, ryansArrow);
	}

	public static int[] solution(int n, int[] info) {
		ryanBoard = new int[info.length];
		int[] ryanArrow = new int[info.length];
		ryanScore = -1;

		for (int i = 0; i < info.length; ++i) {
			ryanArrow[i] = 0;
			ryanBoard[i] = 0;
		}

		findArrow(info, 0, n, ryanArrow);

		if (ryanScore == -1) return new int[]{-1};
		return ryanBoard;
	}
}
