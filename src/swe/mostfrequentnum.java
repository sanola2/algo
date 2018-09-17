package swe;

import java.util.Arrays;
import java.util.Scanner;

public class mostfrequentnum {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        int[] points = new int[1000];

        for(int i=0; i< num; ++i) {
            int caseNum = a.nextInt();
            for(int j=0; j< 1000; ++j) {
                points[j] = a.nextInt();
            }
            System.out.println("#" + caseNum + " " + getAnswer(points));
        }
    }
    public static int getAnswer(int[] points) {
        int cnt = 0;
        int max = 0;
        int answer = 0;

        Arrays.sort(points);
        for(int i=0; i< points.length-1; i++) {
            if(points[i] == points[i+1])
                ++cnt;
            else {
                if(max <= cnt) {
                    max = cnt;
                    answer = points[i];
                }
                cnt = 0;
            }
        }
        return answer;
    }
}
