package kakaocofe;

import java.util.Scanner;

public class bounty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chalNum = sc.nextInt();
        int[][] numbers = new int[chalNum][2];
        int[] results = new int[chalNum];
        int[] money = {5000000, 3000000, 3000000, 2000000, 2000000, 2000000, 500000, 500000, 500000, 500000
        , 300000, 300000, 300000, 300000, 300000, 100000, 100000, 100000, 100000, 100000, 100000};
        int[] money2 = {5120000, 2560000, 2560000, 1280000, 1280000, 1280000, 1280000, 640000, 640000, 640000, 640000
                , 640000, 640000, 640000, 640000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000, 320000};

        for(int i=0; i < chalNum; i++) {
            numbers[i][0] = sc.nextInt();
            numbers[i][1] = sc.nextInt();
        }

        for(int i=0; i< chalNum; i++) {
            if(numbers[i][0] > 21) {
                results[i] += 0;
            } else {
                results[i] += money[numbers[i][0]-1];
            }

            if(numbers[i][1] > 31) {
                results[i] += 0;
            } else {
                results[i] += money2[numbers[i][1]-1];
            }
        }

        for(int i=0; i< chalNum; i++) {
            System.out.println(results[i]);
        }
    }
}
