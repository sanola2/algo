package line;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class line2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[][] array = new String[num+1][num+1];
        boolean[][] check = new boolean[num][num];

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j< num; j++) {
                array[i][j] = st.nextToken();
            }
        }
        getTresure(check, array, "B", 0, 0);
    }
    static void getTresure(boolean[][] check, String[][] array, String from, int x, int y) {
        if(check[x][y]) {
            System.out.println(y + " " + x);
            return;
        }
        check[x][y] = true;
        String now = array[x][y].substring(0,1);
        if(from.equals("F")) {
            if(now.equals("F")) {
                getTresure(check, array, "F", x - (Integer.parseInt(array[x][y].substring(1))), y);
            } else if(now.equals("R")) {
                getTresure(check, array, "R", x, y + (Integer.parseInt(array[x][y].substring(1))));
            } else if(now.equals("L")) {
                getTresure(check, array, "L", x, y - (Integer.parseInt(array[x][y].substring(1))));
            } else if(now.equals("B")) {
                getTresure(check, array, "B", x + (Integer.parseInt(array[x][y].substring(1))), y);
            }
        } else if(from.equals("R")) {
            if(now.equals("F")) {
                getTresure(check, array, "R", x, y + (Integer.parseInt(array[x][y].substring(1))));
            } else if(now.equals("R")) {
                getTresure(check, array, "B", x + (Integer.parseInt(array[x][y].substring(1))), y);
            } else if(now.equals("L")) {
                getTresure(check, array, "F", x - (Integer.parseInt(array[x][y].substring(1))), y);
            } else if(now.equals("B")) {
                getTresure(check, array, "L", x, y - (Integer.parseInt(array[x][y].substring(1))));
            }
        } else if(from.equals("L")) {
            if(now.equals("F")) {
                getTresure(check, array, "L", x, y - (Integer.parseInt(array[x][y].substring(1))));
            } else if(now.equals("R")) {
                getTresure(check, array, "F", x - (Integer.parseInt(array[x][y].substring(1))), y);
            } else if(now.equals("L")) {
                getTresure(check, array, "B", x + (Integer.parseInt(array[x][y].substring(1))), y);
            } else if(now.equals("B")) {
                getTresure(check, array, "R", x , y + (Integer.parseInt(array[x][y].substring(1))));
            }
        } else if(from.equals("B")) {
            if(now.equals("F")) {
                getTresure(check, array, "B", x + (Integer.parseInt(array[x][y].substring(1))), y);
            } else if(now.equals("R")) {
                getTresure(check, array, "L", x, y - (Integer.parseInt(array[x][y].substring(1))));
            } else if(now.equals("L")) {
                getTresure(check, array, "R", x, y + (Integer.parseInt(array[x][y].substring(1))));
            } else if(now.equals("B")) {
                getTresure(check, array, "F", x - (Integer.parseInt(array[x][y].substring(1))), y);
            }
        }
    }
}
