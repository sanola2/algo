package codility;

public class array {
	public static void main(String[] args) {
		//solution1(new int[]{}, 0 );
		solution(new int[]{1, 2, 3, 1});
	}

	public static int[] solution1(int[] A, int K) {
		if (A == null || A.length == 0)
			return A;
		int cycle = K % A.length;
		int[] answer = new int[A.length];

		int k = 0;
		for (int i = A.length - cycle; i < A.length; i++) {
			answer[k] = A[i];
			k++;
		}
		for (int i = 0; i < A.length - cycle; i++) {
			answer[k] = A[i];
			k++;
		}
		return answer;
	}

	public static int solution(int[] A) {
		int answer = 0;

        for (int j : A) {
            answer = answer ^ j;
        }
		System.out.println(answer);
		return answer;
	}

}
