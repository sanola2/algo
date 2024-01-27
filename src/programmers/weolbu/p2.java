package programmers.weolbu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2 {
	public static void main(String[] args) {
		System.out.println(solution("abcabcdefabc"));
		System.out.println(solution("abxdeydeabz"));
		System.out.println(solution("abcabca"));
		System.out.println(solution("ABCabcA"));
		System.out.println(solution("aabasdgcdeaaAA"));
		System.out.println(solution("aabbCc"));
	}

	public static String solution(String interview) {
		String result = interview;

		interview = interview.toLowerCase();
		Map<String, Integer> patternCount = new HashMap<>();

		int maxCount = 0;

		for (int len = 1; len <= interview.length(); len++) {
			for (int i = 0; i <= interview.length() - len; i++) {
				String pattern = interview.substring(i, i + len);
				int count = patternCount.getOrDefault(pattern, 0) + 1;
				patternCount.put(pattern, count);
				maxCount = Math.max(maxCount, count);
			}
		}

		List<String> mostFrequentPatterns = new ArrayList<>();

		for (String pattern : patternCount.keySet()) {
			if (patternCount.get(pattern) == maxCount) {
				mostFrequentPatterns.add(pattern);
			}
		}

		mostFrequentPatterns.sort((String s1, String s2) -> s2.length() - s1.length());

		for (String pattern : mostFrequentPatterns) {
			result = result.replaceAll("(?i)" + pattern, "");
		}

		return result;
	}
}
