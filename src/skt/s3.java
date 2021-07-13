package skt;

import java.util.HashSet;
import java.util.Set;

public class s3 {
	// 각 자리숫자 하나씩만 바꿔서 3으로 나눠지도록 만들면 총 몇개의 숫자를 반환할까

	public static void main(String[] args) {
		System.out.println(solution("23")); //7
		System.out.println(solution("0081")); //11
		System.out.println(solution("022")); //9
	}

	public static int solution(String S) {
		char[] chars = S.toCharArray();
		char temp;
		Set<Integer> result = new HashSet<>();

		for (int i = 0; i < S.length(); i++) {
			temp = chars[i];
			for (int j = 0; j < 10; j++) {
				chars[i] = Character.forDigit(j, 10);
				int changedNumber = Integer.parseInt(String.valueOf(chars));
				if (changedNumber % 3 == 0) {
					result.add(changedNumber);
				}
			}
			chars[i] = temp;
		}

		return result.size();
	}
}
