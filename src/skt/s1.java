package skt;

import java.util.Arrays;

public class s1 {
	public static void main(String[] args) {
		System.out.println(solution("aabbb")); // t
		System.out.println(solution("ba")); // f
		System.out.println(solution("aaa")); //t
		System.out.println(solution("b")); //t
		System.out.println(solution("abba")); //f
	}

	public static boolean solution(String S) {
		char[] chars = S.toCharArray();
		Arrays.sort(chars);
		if (S.equals(String.valueOf(chars))) {
			return true;
		}
		return false;
	}
}
