package riot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class r3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList();

        for(int i=0; i< n; i++)
            queue.add(Integer.parseInt(st.nextToken()));

        for(int i=0; i< d; i++)
            queue.add(queue.poll());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< n; i++) {
            sb.append(((LinkedList<Integer>) queue).get(i));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
