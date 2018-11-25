package codility;


public class timecomp {
    public static void main(String[] args) {
      //  System.out.println(solution(new int[]{2,3,1,5}));
      //  System.out.println(solution2(10,85,30));
        System.out.println(solution3(new int[]{3,1,2,4,3}));
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
        long min = Integer.MAX_VALUE;

        for(int i=0; i< A.length; i++)
            sum += A[i];

        for(int i=1; i< A.length; i++) {
            sum -= A[i-1] *2;
            if(min > Math.abs(sum))
                min = Math.abs(sum);
        }

        return (int)min;
    }
}
