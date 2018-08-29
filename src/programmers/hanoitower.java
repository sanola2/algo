package programmers;

public class hanoitower {
    int[][] result;
    int cnt;
    public hanoitower(int n) {
        result = new int[(int)Math.pow(2, n)-1][2];
        cnt = 0;
    }
    public void hanoi(int n, int from, int by, int to) {
        if(n == 1) {
            result[cnt++] = printMove(n, from, to);
        } else {
            hanoi(n-1, from, to, by);
            result[cnt++] = printMove(n, from, to);
            hanoi(n-1, by, from, to);
        }
    }
    public int[][] getResult() {
        return result;
    }

    public int[] printMove(int n, int from, int to) {
        //System.out.println("n : " + n + " ["+from+", "+ to+ "]");
        return new int[]{from, to};
    }

    public static void main(String[] args) {
        int n = 3;
        hanoitower a = new hanoitower(n);
        a.hanoi(n, 1,2,3);
        int[][] aa = a.getResult();
        for(int i=0; i< aa.length; i++) {
            System.out.println(aa[i][0] + ", " + aa[i][1]);
        }
    }
}
