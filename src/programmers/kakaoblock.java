package programmers;

import java.util.Arrays;

public class kakaoblock {
    public int solution(int m, int n, String[] board) {
        char[][] boardChars = new char[m][n];
        boolean changed = false;
        boolean flag = true;
        int answer = 0;

        for(int i=0; i< boardChars.length; i++) {
            boardChars[i] = board[i].toCharArray();
        }

        do {
            int[][] copy = new int[m][n];
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (boardChars[i][j] != '0' && boardChars[i][j] == boardChars[i][j + 1] && boardChars[i][j] == boardChars[i + 1][j + 1] && boardChars[i][j] == boardChars[i + 1][j]) {
                        copy[i][j] = 1;
                        copy[i + 1][j] = 1;
                        copy[i][j + 1] = 1;
                        copy[i + 1][j + 1] = 1;
                        changed = true;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (copy[i][j] == 1) {
                        boardChars[i][j] = '0';
                        answer++;
                    }
                }
            }

            for(int i=0; i< n; i++) {
                for(int j=m-1; j>= 0; j--) {
                    if(boardChars[j][i] == '0') {
                        for(int k=j-1; k>= 0; k--) {
                            if(boardChars[k][i] != '0') {
                                boardChars[j][i] = boardChars[k][i];
                                boardChars[k][i] = '0';
                            }
                        }
                    }
                }
            }
            if(!changed)
                flag = false;
            changed = false;
        } while(flag);


        return answer;
    }

    public static void main(String[] args) {
        kakaoblock a = new kakaoblock();

        System.out.println(a.solution(4, 5, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));
    }
}
