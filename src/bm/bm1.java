package bm;

public class bm1 {
    public static void main(String[] args) {
        solution("0100");
    }

    public static int solution(String S) {
        int num = Integer.parseInt(S, 2);
        int cnt = 0;

        while(num > 0) {
            if(num%2==0) {
                num /= 2;
                cnt++;
            } else {
                num -= 1;
                cnt++;
            }
        }

        System.out.println(cnt);
        return 0;
    }

}
