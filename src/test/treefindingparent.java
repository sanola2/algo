package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class treefindingparent {
    static int[] parent;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()) + 1;
        LinkedList[] tree = new LinkedList[num];
        boolean[] check = new boolean[num];
        parent = new int[num];

        for(int i=1; i< num; i++)
            tree[i] = new LinkedList();

        for(int i=1; i< num-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree[a].add(b);
            tree[b].add(a);
        }
        bfs(tree, check, 1);
        for(int i=2; i< num; i++)
            System.out.println(parent[i]);
    }

    static void bfs(LinkedList<Integer>[] tree, boolean[] check, int root) {
        Queue<Integer> queue = new LinkedList();
        check[root] = true;
        queue.offer(root);

        while(!queue.isEmpty()) {
            int x = queue.poll();
            for(int num : tree[x]) {
                if(!check[num]) {
                    check[num] = true;
                    parent[num] = x;
                    queue.add(num);
                }
            }
        }
    }
}
