package sb;

import java.util.Arrays;

public class sb1 {
	// 스트로크 10억 초과 시 -1 반환
	// int 배열을 문자열로 바꾸고 0으로 split 을 해서 카운트를 세면?
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,2,1,2,1,5,3,3,4,2}));
	}

	public static int solution(int[] A) {
		int maxNumber = Arrays.stream(A).max().getAsInt();

		for(int i=0; i< maxNumber; i++) {


			for(int j=0; j< A.length; j++) {
				A[j]--;
			}
		}

		return 0;
	}
}
