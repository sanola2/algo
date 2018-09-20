package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class brtest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        System.out.println("Scanner 보다 훨 빠름 : " + sb.append(st.nextToken()));
        System.out.println("StringBulider가 훨 빠름 : " + sb.append(st.nextToken()));
    }
}
