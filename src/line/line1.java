package line;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class line1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int money = 20000;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num <4 || num > 178) {
                System.out.println(money);
                return;
            }
            money -= 720;

            if(num > 40) {
                int fee = ((num-40) / 8) + 1;
                if((num-40)%8 ==0)
                    fee--;
                money -= fee * 80;
            }
            if(money < 720) {
                System.out.println(money);
                return;
            }
        }
        System.out.println(money);
    }
}
