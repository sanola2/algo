package kakaocofe;

import java.util.Arrays;
import java.util.Scanner;

public class aver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[k];

        for(int i=0; i< k; i++) {
            nums[i] = sc.nextInt();
        }

        int temp = 0;
        double ave = 0;
        double bunsan = 0;
        double[] result = new double[k-n+1];
        for(int i=0; i< k-n+1; i++) {
            for(int j=0; j< n; j++) {
                temp += nums[i+j];
            }
            ave = (double)temp / n;
            for(int j=0; j< n; j++) {
                bunsan += Math.pow(nums[i+j] - ave, 2);
            }
            result[i] = Math.sqrt(bunsan / n);
            temp = 0;
            ave = 0;
            bunsan = 0;
        }

        System.out.println(Arrays.stream(result).min().getAsDouble());
    }
}
