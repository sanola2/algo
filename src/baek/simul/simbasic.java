package baek.simul;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class simbasic {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int max = 0;
        for(int i=0; i< 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num -= Integer.parseInt(st.nextToken());
            num += Integer.parseInt(st.nextToken());
            if (num > max)
                max = num;
        }
        System.out.print(max);
    }
}
