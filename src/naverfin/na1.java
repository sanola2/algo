package naverfin;

import java.util.ArrayList;
import java.util.List;

public class na1 {
	public static void main(String[] args) {
		System.out.println(solution("acb"));
		System.out.println(solution("hot"));
		System.out.println(solution("codility"));
		System.out.println(solution("aaaa"));
	}

	public static String solution(String S) {
		List<String> tempStrings = new ArrayList<>();

		for (int i = 0; i < S.length(); i++) {
			StringBuilder sb = new StringBuilder(S);
			if (i != 0 && sb.charAt(i) == sb.charAt(i - 1)) {
				continue;
			}
			tempStrings.add(sb.deleteCharAt(i).toString());
		}
		return tempStrings.stream().sorted().findFirst().get();
	}
}
