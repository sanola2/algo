package programmers;

public class threexn2 {
    public static void main(String[] args) {
        int n = 40;

        if (n % 2 == 1) System.out.println(0);
        n /= 2;
        long[] numTiles = new long[2500];
        numTiles[0] = 1;
        numTiles[1] = 3;
        long sumNumTiles = 4;

        for (int i = 2; i <= n; i++) {
            numTiles[i] = numTiles[i - 1] + 2 * sumNumTiles;
            sumNumTiles += numTiles[i];
            numTiles[i] %= 1000000007;
            sumNumTiles %= 1000000007;
        }

        System.out.println(numTiles[n]);
    }
}
