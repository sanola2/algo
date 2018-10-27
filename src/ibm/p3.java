package ibm;

import java.util.ArrayList;

public class p3 {
    static int cnt = 0;
    static ArrayList cyc = new ArrayList();
    public static void main(String[] args) {
        int num = 932857618;
       // int[] next = {1,2,3,1};
        //int[] next = {1,2,3,4,5,3}; //12
        int[] next = {1, 0}; //12

        boolean[] check = new boolean[next.length];
        boolean[] fin = new boolean[next.length];

        if(num > next.length) {
            for (int i = 0; i < next.length; i++) {
                if (!check[i])
                    dfs(check, fin, next, i);
            }
            cyc.add(cyc.get(0));
            System.out.println("cnt : " + cnt);
            System.out.println("size : " + (cyc.size() -1));
            System.out.println("?? ; " + ((num - cnt)% (cyc.size()-1)));

            System.out.println(cyc.get(((num - cnt)% (cyc.size()-1))));
        }
            int j =0;
            for (int i = 0; i < num; i++) {
                j = next[j];
            }
            System.out.println("막한거 : " + j);

    }

    static void dfs(boolean[] check, boolean[] fin, int[] next, int idx) {
        check[idx] = true;
        int nextIdx = next[idx];

        if(!check[nextIdx]) {
            dfs(check, fin, next, nextIdx);
        } else {
            if(!fin[nextIdx]) {
                cnt = nextIdx;
           //     System.out.println(" 싸이클: " + next[idx]);
                checkCycle(next, idx, nextIdx);
            }
        }
        fin[idx] = true;
    }

    static void checkCycle(int[] next, int u, int v) {
        cyc.add(v);
    //    System.out.println(" 싸이클: " + next[v]);
        if(u == v) return;
        checkCycle(next, u, next[v]);
    }
}
