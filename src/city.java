public class city {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,5},{2,3},{3,3}}));
    }

    public static int solution(int[][] cities) {
        int num = cities.length;
        int[] sum = new int[cities.length];
        int result = 0;

        for(int i=0; i< num; i++) {
            for(int j=0; j< num; j++) {
                sum[i] += Math.abs(cities[j][0] - cities[i][0]) * cities[j][1];
            }
        }

        int temp = sum[0];
        for(int i=1; i< sum.length; i++) {
            if(temp < sum[i]) {
                temp = sum[i];
                result = i;
            }
        }

        return result;
    }
}
