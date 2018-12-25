package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class quicks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[10001];

        for(int i=0; i< n; i++) {
            int num = Integer.parseInt(br.readLine());
            array[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i< 10001; i++) {
            for(int j=0; j< array[i]; j++) {
                sb.append(i);
                sb.append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}
