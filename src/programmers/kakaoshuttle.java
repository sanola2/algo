package programmers;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class kakaoshuttle {
    public String solution(int n, int t, int m, String[] timetable) {
        timetable = Arrays.stream(timetable).sorted(Comparator.naturalOrder()).toArray(String[]::new);
        LocalTime busArrivingTime = LocalTime.parse("09:00");
        LocalTime[] passengerTime = new LocalTime[timetable.length];

        for(int i=0; i< timetable.length; i++)
            passengerTime[i] = LocalTime.parse(timetable[i]);

        int idx = 0;
        int available = 0;
        for(int i=0; i< n; i++) {
            available = m;
            for(int j=0; j< m; j++) {
                if(passengerTime[idx].isBefore(busArrivingTime.plusMinutes(1))) {
                    available--;
                    if(idx >= timetable.length-1) {
                        if(available > 0)
                            return busArrivingTime.plusMinutes((n-i-1)*t).toString();
                        else if(available <= 0 && i != n-1)
                            return busArrivingTime.plusMinutes((n-i-1)*t).toString();
                        else
                            return passengerTime[idx].minusMinutes(1).toString();
                    }
                    idx++;
                }
            }
            busArrivingTime = busArrivingTime.plusMinutes(t);
        }
        if(idx-1 >= 0 && passengerTime[idx-1].isBefore(busArrivingTime) && available <= 0)
            return passengerTime[idx-1].minusMinutes(1).toString();
        return busArrivingTime.minusMinutes(t).toString();
    }
    public static void main(String[] args) {
        kakaoshuttle a = new kakaoshuttle();

        System.out.println(a.solution(1,1,1, new String[]{"00:01"}));
      //  System.out.println(a.solution(2,1,2, new String[]{"09:10", "07:00", "07:50", "08:00"}));
      //  System.out.println(a.solution(10,1,1, new String[]{"00:01","00:01","00:01","00:01","00:01"}));
    }
}
