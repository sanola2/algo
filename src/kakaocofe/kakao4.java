package kakaocofe;

public class kakao4 {
    public int solution(int[] food_times, long k) {
        int j = 0;
        for(int i=0; i< k; i++) {
            if(j == food_times.length)
                j = 0;
            if(food_times[j] == 0) {
                j++;
                i--;
            }
            food_times[j] -= 1;
            j++;
        }
        System.out.println(j);
        while(true) {
            if(j == food_times.length)
                j = 0;
            if(food_times[j] == 0) {
                j++;
            } else
                return j+1;
        }
    }

    public static void main(String[] args) {
        kakao4 a = new kakao4();

        System.out.println(a.solution(new int[]{3,1,2}, 5));
    }
}
