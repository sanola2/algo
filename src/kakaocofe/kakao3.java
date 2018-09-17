package kakaocofe;

import java.util.Arrays;

public class kakao3 {
    public int solution(String[][] relation) {
        String[][] rowColums = new String[relation[0].length][relation.length];

        for(int i=0; i< rowColums.length; i++) {
            for(int j=0; j< rowColums[0].length; j++) {
                rowColums[i][j] = relation[j][i];
            }
        }

        System.out.println(rowColums[0][0]);
        System.out.println(rowColums[0][1]);
        System.out.println(rowColums[1][0]);
        System.out.println(rowColums[1][1]);
        System.out.println(rowColums[2][0]);
        System.out.println(rowColums[2][1]);
      //  System.out.println(Arrays.stream(relation[0]).distinct().count() != relation[0].length);
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        kakao3 a = new kakao3();

        System.out.println(a.solution(new String[][]
                {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"}, {"300", "tube", "computer", "3"}
                , {"400", "con", "computer", "4"}, {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}}));
    }
}
