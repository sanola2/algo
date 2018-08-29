package programmers;

import java.util.Arrays;

public class bestset {
    static public int[] Solution(int n, int s) {
        int left = s / n;

        if(left == 0)
            return new int[]{-1};

        int[] answer = new int[n];
        int ll = s%n;

        for(int i=0; i< n; i++) {
            answer[i] = left;
        }

        for(int i=0; i< ll; i++) {
            answer[n-1-(i%n)] += 1;
        }
        return answer;
    }
    static public void main(String[] args) {
        int n = 2;
        int s = 1;

        Arrays.stream(Solution(n,s)).forEach(System.out::println);

    }
}
