package fs;

public class pr1 {
    public static void main(String[] args) {
        int[] fence = {1, 1};
        int answer = 0;
        int answer2 = 0;

        for (int i = 0; i < fence.length; i += 2) {
            if (fence[i] != 0) {
                answer++;
            } else {
                answer2++;
            }
        }
        for (int i = 1; i < fence.length; i += 2) {
            if (fence[i] != 1) {
                answer++;
            } else {
                answer2++;
            }
        }
        if(answer < answer2) {
            System.out.println(answer);
        } else {
            System.out.println(answer2);
        }
    }
}
