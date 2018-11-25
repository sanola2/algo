package codility;


public class timecomp {
    public static void main(String[] args) {
      //  System.out.println(solution(new int[]{2,3,1,5}));
        System.out.println(solution2(10,85,30));
    }

    public static int solution(int[] A) {
        long num = A.length +1;
        long sum = (num * (num+1))/2;

        for(int i=0; i< num-1; i++) {
            sum -= A[i];
        }
        return (int)sum;
    }

    public static int solution2(int X, int Y, int D) {
        int left = Y-X;
        double answer = Math.ceil((double)left/D);
        return (int)answer;
    }

    public static int solution3(int[] A) {
        long sum = 0;
        for(int i=0; i< A.length; i++)
            sum += i;

        int i =0;
        while(sum > 0) {
            sum -= A[i]*2;
            i++;
        }
        if(Math.abs(sum) < Math.abs(sum + A[i]*2)) {
            return (int)sum;
        }
        else
            return (int)Math.abs(sum + A[i]*2);
    }
}
