package nhn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nhn11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cards = Integer.parseInt(br.readLine());
        int[] card = new int[cards];
        for(int i=0; i< cards; i++)
            card[i] = i+1;
        int shuffleNum = Integer.parseInt(br.readLine());

        for(int i=0; i< shuffleNum; i++) {
            int[] temp = new int[cards];
            int n = Integer.parseInt(br.readLine());
            int cnt;
            int dot = 0;
            int tt, ii = 1;

            while (cards - dot > (n*2)) {
                cnt = 0;
                for (int j = 0; j < n; j++) {
                    temp[cards - 1 - cnt - dot] = card[cards - 1 - j - dot];
                    cnt++;
                }
                for (int j = 0; j < n; j++) {
                    temp[cards - 1 - cnt - dot] = card[n - 1 - j];
                    cnt++;
                }
                tt = ii * (2*n);
                for (int j = 0; j < cards - tt; j++) {
                    temp[cards -1 - cnt - dot] = card[cards - 1 - n - j - dot];
                    cnt++;
                }
                dot += 2*n;
                ii++;
                for(int j=0; j< cards; j++)
                    card[j] = temp[j];
            }
        }
        for(int i=0; i< 5; i++)
            System.out.println(card[i]);
    }
}
