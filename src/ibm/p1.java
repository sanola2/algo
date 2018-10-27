package ibm;

import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) throws Exception {
        int[] gift_cards = {4,5,3,2,1};
        int[] wants = {2,4,4,5,1};
        int answer = 0;

        ArrayList cards = new ArrayList();
        for(int i=0; i< gift_cards.length; i++) {
            cards.add(gift_cards[i]);
        }

        for(int i=0; i< wants.length; i++) {
            if(cards.contains(wants[i])) {
                cards.remove((Object)wants[i]);
            } else {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
