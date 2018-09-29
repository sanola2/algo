package nhn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class nhn1 {
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
            int cnt = 0;
            int dot = 0;
            while((cards - dot) > (n*2)) {
                dot = cnt;
                cnt= 0 ;
                System.out.println("Tq : " + cnt);
                System.out.println("Tqdot : " + dot);

                for (int j = 0; j < n; j++) {
                    temp[cards - 1 - cnt] = card[cards - dot - 1 - j];
                    cnt++;
                }
                for (int j = 0; j < n; j++) {
                    System.out.println("언제? : " + (cards - 1 - cnt));
                    System.out.println("언제2? : " + (n - dot - 1 - j));
                    temp[cards - 1 - cnt] = card[n - dot - 1 - j];
                    cnt++;
                }
                for (int j = 0; j < cards - dot - (2 * n); j++) {
                    temp[cards - 1 - cnt] = card[cards - 1 - n - j - dot];

                }
                System.out.println("Tq2 : " + cnt);
            }

            for(int j=0; j< cards; j++)
                card[j] = temp[j];

            System.out.print("배열");
            Arrays.stream(card).forEach(System.out::print);
        }

       // System.out.println(temp[4]);
    }
}
