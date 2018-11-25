package bm;

import java.util.ArrayList;
import java.util.List;

public class bm3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{40, 40, 100, 80, 20}, new int[]{3, 3, 3, 2, 1}, 3, 5, 200));
        System.out.println(solution(new int[]{60, 80, 40, 180}, new int[]{2, 3, 5,4}, 5, 2, 200));
    }

    public static int solution(int[] A, int[] B, int M, int X, int Y) {
        int peopleNum = A.length;
        int n = 0;
        int answer = 0;

        while (n < peopleNum) {
            long weightSum = 0;
            List targetFloors = new ArrayList<Integer>();

            for(int i=0; i< X; i++) {
                if(n == peopleNum)
                    break;

                weightSum += A[n];
                if(weightSum > Y)
                    break;

                if(B[n] <= M && !targetFloors.contains(B[n]))
                    targetFloors.add(B[n]);
                n++;
            }
            answer += targetFloors.size() + 1;
        }

        return answer;
    }
}
