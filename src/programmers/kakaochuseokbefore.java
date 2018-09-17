package programmers;

import java.time.LocalTime;

public class kakaochuseokbefore {
    public int solution(String[] lines) {
        String[][] splits = new String[lines.length][3];
        LocalTime[] times = new LocalTime[lines.length];
        double[] seconds = new double[lines.length];
        int cnt = 1;
        int max = 0;

        for(int i=0; i< lines.length; i++) {
            splits[i] = lines[i].split(" ");
            times[i] = LocalTime.parse(splits[i][1]);
            seconds[i] = Double.parseDouble(splits[i][2].substring(0, splits[i][2].length()-1))*1000 - 1;
        }

        for(int i=0; i< lines.length; i++) {
            for(int j = i+1; j< lines.length; j++) {
                int equalOrAfter = times[i].compareTo(times[j]);
                int equalOrBefore = times[i].plusNanos((long) (999 * 1000000)).compareTo(times[j].minusNanos((long)(seconds[j] * 1000000)));
                if(equalOrAfter != 1 && equalOrBefore != -1 ) {
                    cnt++;
                }
            }
            if(cnt > max)
                max = cnt;
            cnt = 1;
        }

        return max;
    }

    public static void main(String[] args) {
        kakaochuseokbefore a = new kakaochuseokbefore();
       // System.out.println(a.solution(new String[]{"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"}));

        System.out.println(a.solution(new String[]{"2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"}));
    }
}
