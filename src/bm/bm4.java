package bm;

public class bm4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-12, -11, -10, -5, 0, 1, 2,3}, -10));
        System.out.println(solution(new int[]{-1, 1,2,5,9,9,10,11}, 11));
    }

    static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else if(A[m] < X) {
                l = m + 1;
            } else {
                l = m;
                break;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

}
