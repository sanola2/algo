package fs;

import java.util.ArrayList;

public class pr2 {
    public static void main(String[] args) {
        int[] monster = {4,9,5,8};
        int S1 = 2;
        int S2 = 3;
        int S3 = 4;

        int total = 0;
        int noMonster = 0;
        ArrayList<Integer> mPosition = new ArrayList<>();

        for(int i=0; i< monster.length; i++) {
            mPosition.add(monster[i]-1);
        }

        for(int i=1; i<= S1; i++) {
            for(int j=1; j<= S2; j++) {
                for(int k=1; k<= S3; k++) {
                    int sum = i+j+k;

                    if (!mPosition.contains(sum)) {
                        System.out.println(sum);
                        noMonster++;
                    }
                    total++;
                }
            }
        }
        System.out.println((noMonster*1000)/total);
    }
}
