package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class cycle10451 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycle = Integer.parseInt(br.readLine());

        for(int i=0; i< cycle; i++) {
            int num = Integer.parseInt(br.readLine())+1;
            ArrayList<Integer>[] graph = new ArrayList[num];
            boolean[] check = new boolean[num];
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j< num; j++) {
                graph[j] = new ArrayList<>();
                graph[j].add(Integer.parseInt(st.nextToken()));
            }

            for(int j=1; j< num; j++) {
                if(!check[j]) {
                    dfs(check, graph, j);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
    static void dfs(boolean[] check, ArrayList<Integer>[] graph, int x) {
        check[x] = true;
        for(int num : graph[x]) {
            if(!check[num])
                dfs(check, graph, num);
        }
    }
}
