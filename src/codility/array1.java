package codility;

public class array1 {
    public static void main(String[] args) {
        solution(new int[]{}, 0 );
    }

    public static int[] solution(int[] A, int K) {
        if(A == null || A.length == 0)
            return A;
        int cycle = K % A.length;
        int[] answer = new int[A.length];

        int k =0;
        for(int i= A.length- cycle; i< A.length; i++) {
            answer[k] = A[i];
            k++;
        }
        for(int i = 0; i< A.length - cycle; i++) {
            answer[k] = A[i];
            k++;
        }
        return answer;
    }
}
