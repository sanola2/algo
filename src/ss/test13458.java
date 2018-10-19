package ss;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test13458 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] studentNum = new long[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i< num; i++) {
            studentNum[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        long answer = num;

        for(int i=0; i< num; i++) {
            studentNum[i] -= B;
            if(studentNum[i] > 0)
                answer += Math.ceil((double)studentNum[i]/C);
        }

        System.out.println(answer);
    }
}
