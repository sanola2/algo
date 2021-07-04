package naverweb;

public class p3 {
	public static void main(String[] args) {
		System.out.println(solution("aabcbcd", "abc"));
		System.out.println(solution("aaaaabbbbb", "ab"));
	}

	public static int solution(String s, String t) {
		int result = 0;

		while (s.matches("(.*)" + t + "(.*)")) {
			s = s.replace(t, "");
			result++;
		}

		return result;
	}
}
