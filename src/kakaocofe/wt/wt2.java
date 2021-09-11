package kakaocofe.wt;

public class wt2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000000; i++) {
			for (int j = 3; j <= 10; j++) {
				System.out.println("i=" + i + "j=" + j + " result: " + solution(i, j));
			}
		}
	}

	public static int solution(int n, int k) {
		int answer = 0;

		StringBuilder s = new StringBuilder();
		while (n != 0) {
			s.append(n % k);
			n /= k;
		}
		if (s.length() >= 1) {
			String s1 = new StringBuilder(s.toString()).reverse().toString();

			String[] split = s1.split("[0]+");
			int cnt = 0;
			if (split.length > 0) {
				for (String s2 : split) {
					long i = Long.parseLong(s2);
					if (i == 1) continue;
					int a = 2;
					boolean flag = false;
					for (; (long) a * a <= i; ++a) {
						if (i % a == 0) {
							flag = true;
							break;
						}
					}
					if (!flag) cnt++;
				}
			}
			answer = cnt;
		}
		return answer;
	}
}
