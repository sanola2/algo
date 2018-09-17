package kakaocofe;

public class kakao2 {
    public int[] solution(int N, int[] stages) {
        int[] reachedUsers = new int[N+2];
        int[] notComUsers = new int[N];
        double[] failureRate = new double[N];

        for(int i=0; i< stages.length; i++) {
            reachedUsers[stages[i]]++;
        }
        notComUsers[N-1] = reachedUsers[N+1] + reachedUsers[N];
        for(int i=N-2; i>= 0; i--) {
            notComUsers[i] = notComUsers[i+1] + reachedUsers[i+1];
        }
        for(int i=0; i< N; i++) {
            if(notComUsers[i] == 0)
                failureRate[i] = 0;
            else {
                    failureRate[i] = (reachedUsers[i+1] / (double) notComUsers[i]);
            }
        }

        return sort(failureRate);
    }

    public int[] sort(double[] nums) {
        int[] ret = new int[nums.length];
        for(int i=0; i< nums.length; i++)
            ret[i] = i+1;

        for(int i=nums.length; i>0; i--) {
            for(int j=0; j< i-1; j++) {
                if (nums[j] < nums[j+1]) {
                    double temp1 = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp1;

                    int temp = ret[j];
                    ret[j] = ret[j+1];
                    ret[j+1] = temp;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        kakao2 a = new kakao2();

        System.out.println(a.solution(	5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
      //  System.out.println(a.solution(	4, new int[]{4,4,4,4}));
        //System.out.println(a.solution(	9, new int[]{1,1,1,2,3,3,4,5,6,7,8,8}));
    }
}
