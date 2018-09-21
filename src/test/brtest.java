package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class brtest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.print(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        System.out.println(st.nextToken());

        sb.append(1);
        sb.append("asd");
        System.out.println(sb);


     //   System.out.println("Scanner 보다 훨 빠름 : " + sb.append(st.nextToken()));
     //   System.out.println("StringBulider가 훨 빠름 : " + sb.append(st.nextToken()));
    }
}
