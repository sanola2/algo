package programmers;

import java.util.LinkedList;

public class kakaocache {
    public int solution(int cacheSize, String[] cities) {
        LinkedList cache = new LinkedList();
        int answer = 0;

        if(cacheSize == 0)
            return 5*cities.length;

        for(String city : cities) {
            city = city.toLowerCase();
            if(cache.contains(city)) {
                answer += 1;
                cache.remove(cache.indexOf(city));
                cache.add(city);
            } else {
                answer += 5;
                if(cache.size() < cacheSize)
                    cache.add(city);
                else {
                    cache.removeFirst();
                    cache.add(city);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        kakaocache a = new kakaocache();

        System.out.println(a.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}));
    }
}
