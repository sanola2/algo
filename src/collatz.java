public class collatz {
    public static void main(String[] args) {
        int num = 626331;
        System.out.println(collatz(num));

    }
    public static int collatz(int num) {
        long lNum = (long)num;
        int cnt = 0;

        while (lNum != 1) {
            if(lNum%2 == 0) {
                lNum /= 2;
                ++cnt;
            } else {
                lNum = lNum*3 + 1;
                ++cnt;
            }
            if(cnt >=500)
                return -1;
        }

        return cnt;
    }
}
