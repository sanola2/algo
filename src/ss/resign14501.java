package ss;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class resign14501 {
    static int[] T;
    static int[] P;
    static int max = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        T = new int[num];
        P = new int[num];

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i< num; i++) {
            if(T[i] <= T.length-i)
                dfs(0, i);
        }
        System.out.println(max);
    }

    static void dfs(int earnedMoney, int start) {
        int money = P[start] + earnedMoney;
        for(int i= start+T[start]; i< T.length; i++) {
            if(T[i]<= T.length-i) {
                dfs(money, i);
            }
        }
        if(max < money) {
            max = money;
        }
    }
}
