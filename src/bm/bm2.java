package bm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bm2 {
    public static void main(String[] args) {
        System.out.println(solution("photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
                "john.png, London, 2015-06-20 15:13:22\n" +
                "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
                "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
                "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
                "BOB.jpg, London, 2015-08-05 00:02:03\n" +
                "notredame.png, Paris, 2015-09-01 12:00:00\n" +
                "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
                "a.png, Warsaw, 2016-02-13 13:33:50\n" +
                "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
                "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
                "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
                "e.png, Warsaw, 2016-01-02 09:49:09\n" +
                "f.png, Warsaw, 2016-01-02 10:55:32\n" +
                "g.jpg, Warsaw, 2016-02-29 22:13:11"));

    }

    public static String solution(String S) {
        String[] array = S.split("\n");
        String[][] photoDatas = new String[array.length][3];
        List<String> dates = new ArrayList();

        for(int i=0; i< photoDatas.length; i++) {
            photoDatas[i] = array[i].split(", ");

            if(!dates.contains(photoDatas[i][1])) {
                dates.add(photoDatas[i][1]);
            }
        }

        int numOfDatas = photoDatas.length;

        // 도시 수만큼 PairData 객체 할당
        PairData[] cityDates = new PairData[dates.size()];
        for(int i=0; i< dates.size(); i++) {
            cityDates[i] = new PairData(dates.get(i));
        }

        int numOfCities = cityDates.length;

        //도시별로 날짜 할당
        for(int i=0; i< numOfDatas; i++) {
            for (int j=0; j< numOfCities; j++) {
                if(photoDatas[i][1].equals(cityDates[j].getCity())) {
                    cityDates[j].setDates(photoDatas[i][2]);
                }
            }
        }

        //날짜 소팅
        for(int i=0; i< numOfCities; i++)
            Collections.sort(cityDates[i].getDates());

        //소팅된 날짜랑 photoDates의 날짜랑 매칭하며 index할당
        for(int i=0; i< numOfCities; i++) {
            int cityDateSize = cityDates[i].getDates().size();
            String cityName = cityDates[i].getCity();
            int numPos = (int)(Math.log10(cityDateSize)+1);

            for(int j=0; j< cityDateSize; j++) {
                String sortedDate = cityDates[i].getDates().get(j);

                for(int k=0; k< numOfDatas; k++) {
                    if(cityName.equals(photoDatas[k][1]) && sortedDate.equals(photoDatas[k][2])) {
                        photoDatas[k][2] = String.format("%0" + numPos + "d", j+1);
                    }
                }
            }
        }

        for(int i=0; i< numOfDatas; i++) {
            String splitDot = photoDatas[i][0].substring(photoDatas[i][0].length()-4, photoDatas[i][0].length());
            photoDatas[i][0] = splitDot;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< numOfDatas; i++) {
            sb.append(photoDatas[i][1] + photoDatas[i][2] + photoDatas[i][0]);
            sb.append("\n");
        }

        return sb.toString();
    }
}

class PairData {
    private String city;
    private List<String> dates;

    public PairData(String city) {
        this.city = city;
        dates = new ArrayList();
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(String date) {
        this.dates.add(date);
    }

    public String getCity() {
        return city;
    }
}