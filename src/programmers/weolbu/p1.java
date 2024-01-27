package programmers.weolbu;

import java.util.HashMap;
import java.util.Map;

public class p1 {
	public static void main(String[] args) {
		String s1 = "tegsornamwaresomran";
		String pattern1 = "ransom";
		System.out.println(solution(s1, pattern1));  // 결과: 2

		String s2 = "wreawerewa";
		String pattern2 = "ware";
		System.out.println(solution(s2, pattern2));  // 결과: 4

		String s3 = "ababababababa";
		String pattern3 = "aabba";
		System.out.println(solution(s3, pattern3));

		String s4 = "abcde";
		String pattern4 = "abcde";
		System.out.println(solution(s4, pattern4));

		String s5 = "aabbccddee";
		String pattern5 = "abcde";
		System.out.println(solution(s5, pattern5));

		String s6 = "aaaaaa";
		String pattern6 = "a";
		System.out.println(solution(s6, pattern6));
	}

	public static int solution(String S, String pattern) {
		int result = 0;
		int patternLength = pattern.length();

		Map<Character, Integer> patternMap = new HashMap<>();

		for (char c : pattern.toCharArray()) {
			patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
		}

		Map<Character, Integer> windowMap = new HashMap<>();

		for (int i = 0; i < S.length(); i++) {
			char currentCharacter = S.charAt(i);
			windowMap.put(currentCharacter, windowMap.getOrDefault(currentCharacter, 0) + 1);

			if (i >= patternLength - 1) {
				if (windowMap.equals(patternMap)) {
					result++;
				}

				char leftCharacter = S.charAt(i - patternLength + 1);
				if (windowMap.get(leftCharacter) == 1) {
					windowMap.remove(leftCharacter);
				} else {
					windowMap.put(leftCharacter, windowMap.get(leftCharacter) - 1);
				}
			}
		}

		return result;
	}
}
