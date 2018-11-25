package codility;

import java.util.Arrays;

public class countingelem {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);

        for(int i=0; i< A.length; i++) {
            if(A[i] != i+1)
                return 0;
        }
        return 1;
    }
}
