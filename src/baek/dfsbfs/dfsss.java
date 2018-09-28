package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class dfsss {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int graph = Integer.parseInt(st.nextToken());
        int cnt = 0;
        ArrayList<Integer>[] gr = new ArrayList[vertex];
        boolean[] check = new boolean[vertex];

        for(int i=0; i< vertex; i++)
            gr[i] = new ArrayList<>();

        for(int i=0; i< graph; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            gr[a].add(b);
            gr[b].add(a);
        }

        for(int i=0; i< vertex; i++) {
            if(!check[i]) {
                dfs(check, gr, i);
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    static void dfs(boolean[] check, ArrayList[] array, int ver) {
        if(check[ver])
            return;
        check[ver] = true;

        for(Object a : array[ver]) {
            if(!check[(int)a])
                dfs(check, array, (int)a);
        }
    }
}
