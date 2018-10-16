package baek.dfsbfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class graph9466 {
    static int[] answer;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine());

        for(int i=0; i< num; i++) {
            int studentNum = Integer.valueOf(br.readLine());
            int[] students = new int[studentNum];
            answer = new int[studentNum];
            int[] checkNum = new int[studentNum];
            int result = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j< studentNum; j++)
                students[j] = Integer.valueOf(st.nextToken())-1;

            for(int j=0; j< studentNum; j++) {
                if(answer[j] == 0)
                    result += dfs(checkNum, students, j, j, 1);
            }
            System.out.println(studentNum - result);
        }
    }
    static int dfs(int[] checkNum, int[] students, int start, int end, int cnt) {
        if(answer[start] != 0) {
            if (checkNum[start] != end)
                return 0;
            return cnt - answer[start];
        }
        answer[start] = cnt;
        checkNum[start] = end;
        return dfs(checkNum, students, students[start], end, cnt+1);
    }
}
