package naverfin;

import java.util.List;
import java.util.stream.Collectors;

public class n2 {
	public static void main(String[] args) {
		System.out.println(solution("acbcbba"));
		System.out.println(solution("axxaxa"));
		System.out.println(solution("aaaa"));
	}

	public static int solution(String S) {
		List<Character> characterList = S.chars().mapToObj(it -> (char) it).collect(Collectors.toList());
		for (int i = 0; i < characterList.size(); i++) {
			for (int j = i + 1; j < characterList.size(); j++) {
				if (characterList.get(i) == characterList.get(j)) {
					characterList.remove(j);
					characterList.remove(i);
					i--;
				}
			}
		}
		return characterList.size();
	}
}
