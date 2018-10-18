package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class treetraversal {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        LinkedList[] tree = new LinkedList[num];

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = st.nextToken().charAt(0) - 'A';
            String l = st.nextToken();
            String r = st.nextToken();
            tree[p] = new LinkedList();
            if(l.equals("."))
                tree[p].add(-1);
            else
                tree[p].add((int)l.charAt(0));

            if(r.equals("."))
                tree[p].add(-1);
            else
                tree[p].add((int)r.charAt(0));
        }
        pre(tree, 0);
        System.out.println();
        in(tree, 0);
        System.out.println();
        post(tree, 0);
    }
    static void pre(LinkedList<Integer>[] tree, int x) {
        if(x <0)
            return;
        System.out.print((char)(x + 'A'));
        pre(tree, tree[x].getFirst() - 'A');
        pre(tree, tree[x].getLast() - 'A');
    }
    static void in(LinkedList<Integer>[] tree, int x) {
        if(x <0)
            return;
        in(tree, tree[x].getFirst() - 'A');
        System.out.print((char)(x + 'A'));
        in(tree, tree[x].getLast() - 'A');
    }
    static void post(LinkedList<Integer>[] tree, int x) {
        if(x <0)
            return;
        post(tree, tree[x].getFirst() - 'A');
        post(tree, tree[x].getLast() - 'A');
        System.out.print((char)(x + 'A'));
    }
}