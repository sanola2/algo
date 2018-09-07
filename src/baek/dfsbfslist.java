package baek;

import java.util.*;

public class dfsbfslist {
    public static boolean[] check;

    public void dfs(ArrayList[] matrix, int n) {
        if(check[n])
            return;
        check[n] = true;
        System.out.print(n+1 + " ");
        for(Object a : matrix[n]) {
            if(!check[(int)a])
                dfs(matrix, (int)a);
        }
    }

    public void bfs(ArrayList[] matrix, int n) {
        LinkedList queue = new LinkedList();
        check[n] = true;
        queue.add(n);

        while (!queue.isEmpty()) {
            for(Object a : matrix[(int)queue.peek()]) {
                if (!check[(int)a]) {
                    check[(int)a] = true;
                    queue.add(a);
                }
            }
            System.out.print((int)queue.remove()+1 + " ");
        }
    }

    public static void main(String[] args) {
        dfsbfslist a = new dfsbfslist();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        check = new boolean[n];
        ArrayList<Integer>[] adjacencyMatrix = new ArrayList[n];
        for(int i=0; i< n; i++)
            adjacencyMatrix[i] = new ArrayList();

        for(int i=0; i< m; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            adjacencyMatrix[x].add(y);
            adjacencyMatrix[y].add(x);
        }
        
        for(int i=0; i< n; i++) {
           // Collections.sort(adjacencyMatrix[i]);
            adjacencyMatrix[i].sort(Comparator.naturalOrder());
        }

        a.dfs(adjacencyMatrix, v-1);
        System.out.println();
        check = new boolean[n];
        a.bfs(adjacencyMatrix, v-1);
    }
}
