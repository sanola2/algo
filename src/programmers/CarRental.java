package programmers;

import java.text.SimpleDateFormat;
import java.util.*;

public class CarRental {
    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
        Map<Date, Integer> timeline = new TreeMap<>();

        for (RentalTime time : rentalTimes) {
            timeline.put(time.getStart(), timeline.getOrDefault(time.getStart(), 0) + 1);
            timeline.put(time.getEnd(), timeline.getOrDefault(time.getEnd(), 0) - 1);
        }

        int ongoing = 0;
        for (int count : timeline.values()) {
            ongoing += count;
            if (ongoing > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));
    }
}

class RentalTime {
    private Date start, end;

    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}