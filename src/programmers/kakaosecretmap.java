package programmers;

import java.util.Stack;

public class kakaosecretmap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] aa = new int[n];
        Stack stack = new Stack();

        for(int i=0; i< n; i++) {
            aa[i] = arr1[i] | arr2[i];
            for(int j=0; j< n; j++) {
                if(aa[i] % 2 == 1)
                    stack.push('#');
                else
                    stack.push(' ');
                aa[i] /= 2;
                answer[i] = "";
            }
            while (!stack.empty())
                answer[i] += stack.pop();
        }

        return answer;
    }
    public static void main(String[] args) {
        kakaosecretmap a = new kakaosecretmap();

        System.out.println(a.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}));
    }
}
