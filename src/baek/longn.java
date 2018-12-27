package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class longn {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] nums = new long[n];

        for(int i=0; i< n; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(nums);

        long result = nums[0];
        int maxCnt = 0;
        int cnt = 1;
        for(int i=0; i< n-1; i++) {
            if(nums[i] == nums[i+1]) {
                cnt++;
            } else {
                if(maxCnt < cnt) {
                    maxCnt = cnt;
                    result = nums[i];
                }
                cnt = 1;
            }
        }
        StringBuilder sb = new StringBuilder("ASdf");
        sb.reverse();
        if(cnt != 1) {
            if(maxCnt < cnt) {
                result = nums[n-1];
            }
        }
        System.out.println(result);
    }
}
