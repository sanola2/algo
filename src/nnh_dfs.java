import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class nnh_dfs {
    static int area = 0;
    static int areaSize =0;
    static boolean[][] check;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] array = new int[num][num];
        check = new boolean[num][num];
        ArrayList<Integer> areas = new ArrayList();

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j< num; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i< num; i++) {
            for(int j=0; j< num; j++) {
                if(!check[i][j] && array[i][j] == 1) {
                    dfs(array, i, j);
                    area++;
                    areas.add(areaSize);
                    areaSize = 0;
                }
            }
        }

        System.out.println(area);
        areas.sort(Comparator.naturalOrder());
        for(int i=0; i< areas.size(); i++)
            System.out.print(areas.get(i) + " ");
    }
    public static void dfs(int[][] array, int x, int y) {
        areaSize++;
        check[x][y] = true;
        if (x+1 < array.length && !check[x + 1][y] && array[x + 1][y] == 1)
            dfs(array, x + 1, y);
        if (y+1 < array.length && !check[x][y + 1] && array[x][y + 1] == 1)
            dfs(array, x, y + 1);
    }
}
