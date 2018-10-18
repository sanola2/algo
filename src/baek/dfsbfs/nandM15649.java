package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class nandM15649 {
    static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[N + 1];
        LinkedList nums = new LinkedList();

        dfs(nums, check);
    }

    static void dfs(LinkedList<Integer> nums, boolean[] check) {
        if(nums.size() == M) {
            for(int i=M-1; i>= 0; i--)
                System.out.print(nums.get(i) + " ");
            System.out.println();
            return;
        }
        for(int i=1; i<= N; i++) {
            if(!check[i]) {
                check[i] = true;
                nums.push(i);
                dfs(nums, check);
                check[i] = false;
                nums.pop();
            }
        }
    }
}
