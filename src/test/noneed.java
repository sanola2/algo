package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class noneed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        int P = Integer.valueOf(st.nextToken());
        LinkedList res = new LinkedList();
        res.add(Integer.valueOf(A));
        int sum;

        while (true) {
            sum = 0;
            String[] numbers = A.split("");
            for(int i=0; i< numbers.length; i++)
                sum += Math.pow(Integer.valueOf(numbers[i]), P);

            A = String.valueOf(sum);

            if(res.contains(sum)) {
                System.out.println(res.indexOf(sum));
                return;
            }
            res.add(sum);
        }
    }
}