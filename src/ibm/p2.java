package ibm;

import java.util.ArrayList;
import java.util.Collections;

public class p2 {
    public static void main(String[] args) {
        int n = 7;

        ArrayList<Long> array = new ArrayList();
        array.add((long)1);
        for(int i=2; i< n; i++) {
            for(int j=2; j< n; j++) {
                long num = (long)Math.pow(i, j);
                if(!array.contains(num))
                    array.add(num);
            }
        }

        Collections.sort(array);
        System.out.println(array.size());
        System.out.println(array.get(n-1));
    }
}
