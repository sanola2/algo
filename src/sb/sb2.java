package sb;

import java.util.Stack;
import java.util.stream.Collectors;

public class sb2 {
	public static void main(String[] args) {
		System.out.println(solution("CBACD"));
		System.out.println(solution("CABABD"));
		System.out.println(solution("ACBDACBD"));
		System.out.println(solution("ACBDACBDCDCDADABAABCDCDCD"));
	}

	public static String solution(String S) {
		Stack<Character> stack = new Stack<>();

		stack.push(S.charAt(0));
		for (int i = 1; i < S.length(); i++) {
			char character = S.charAt(i);

			switch (stack.peek()) {
				case 'A':
					if (character == 'B') {
						stack.pop();
						break;
					}
					stack.push(character);
					break;
				case 'B':
					if (character == 'A') {
						stack.pop();
						break;
					}
					stack.push(character);
					break;
				case 'C':
					if (character == 'D') {
						stack.pop();
						break;
					}
					stack.push(character);
					break;
				case 'D':
					if (character == 'C') {
						stack.pop();
						break;
					}
					stack.push(character);
					break;
			}
		}

		return stack.stream().map(String::valueOf)
				.collect(Collectors.joining());
	}
}
