import java.util.ArrayList;

public class dq {
    public static void main(String[] args) {
        System.out.println(fastestMaxSum(new int[]{-7,4,-3,6,3,-8,3,4}));
    }

    public static int fastestMaxSum(int[] A) {
        int N=A.length, ret =0, psum=0;

        for(int i=0; i< N; i++) {
            psum = Math.max(psum, 0) + A[i];
            ret = Math.max(psum, ret);
        }
        return ret;
    }
}
