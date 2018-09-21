package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class calendaar1924 {
    public static void main(String[] args) throws Exception {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = new String[]{"SUN", "MON", "TUE" ,"WED" , "THU", "FRI", "SAT"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int sum = 0;
        for(int i=0; i< month-1; i++) {
            sum += months[i];
        }
        sum += day;

        System.out.println(week[sum%7]);
    }
}
