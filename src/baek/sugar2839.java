package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sugar2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int modFive = num %5;
        int numThree = 0;
        int cntFive = num /5;


        if(modFive == 0 && cntFive >= 1) {
            System.out.print(cntFive);
            return;
        }
        if(modFive % 3 == 0) {
            System.out.println(cntFive + 1);
            return;
        }

        int cnt = cntFive;
        for(int i=0; i< cntFive; i++) {
            modFive += 5;
            cnt--;
            if(modFive % 3 == 0) {
                numThree += modFive/3;
                System.out.println(cnt + numThree);
                return;
            }
        }
        System.out.println(-1);
    }
}
