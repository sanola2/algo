package baek;

import java.util.LinkedList;
import java.util.Scanner;

public class dfsbfsarray {
    public static boolean[] check;

    public void dfs(int[][] matrix, int n) {
        check[n] = true;
        System.out.print(n+1 + " ");
        for(int i=0; i< matrix.length; i++) {
            if(matrix[n][i] == 1 && !check[i]) {
                dfs(matrix, i);
            }
        }
    }

    public void bfs(int[][] matrix, int n) {
        LinkedList queue = new LinkedList();
        check[n] = true;
        queue.add(n);
        while (!queue.isEmpty()) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[(int)queue.peek()][i] == 1 && !check[i]) {
                    check[i] = true;
                    queue.add(i);
                }
            }
            System.out.print((int)queue.remove()+1 + " ");
        }
    }

    public static void main(String[] args) {
        dfsbfsarray a = new dfsbfsarray();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        check = new boolean[n];
        int[][] adjacencyMatrix = new int[n][n];

        for(int i=0; i< m; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            adjacencyMatrix[x][y] = 1;
            adjacencyMatrix[y][x] = 1;
        }

        a.dfs(adjacencyMatrix, v-1);
        System.out.println();
        check = new boolean[n];
        a.bfs(adjacencyMatrix, v-1);
        System.out.println();
    }
}
