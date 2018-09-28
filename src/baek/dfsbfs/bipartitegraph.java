package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bipartitegraph {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ver = Integer.parseInt(st.nextToken());
            int graphs = Integer.parseInt(st.nextToken());
            boolean flag = false;
            ArrayList<Integer>[] array = new ArrayList[ver];
            int[] check = new int[ver];

            for(int j=0; j< ver; j++)
                array[j] = new ArrayList<>();

            for(int j=0; j< graphs; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken())-1;
                int b = Integer.parseInt(st.nextToken())-1;
                array[a].add(b);
                array[b].add(a);
            }

            for(int j=0; j< ver; j++) {
                if(check[j] == 0) {
                    dfs(check, array, j, 1);
                }
            }

            for(int j=0; j< ver; j++) {
                for(Object n : array[j]) {
                    if(check[j] == check[(int)n]) {
                        flag = true;
                    }
                }
            }
            if(flag)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }

    static void dfs(int[] check, ArrayList<Integer>[] array, int ver, int cc) {
        check[ver] = cc;

        for(int num : array[ver]) {
            if(check[num] == 0)
                dfs(check, array, num, 3-cc);
        }
    }
}
