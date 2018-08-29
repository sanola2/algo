package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class overwork {
    public static void main(String[] args) {
        int n = 4;
        int[] works = {4,3,3};

        PriorityQueue<Integer> rpq = new PriorityQueue(Collections.reverseOrder());
      //  if(Arrays.stream(works).sum() <= n)
      //      return 0;

        for(int num : works)
            rpq.add(num);

        for(int i=0; i< n; i++) {
            int t = rpq.poll();
            if(t == 0) break;
            rpq.add(--t);
        }
        int sum =0;
        while(!rpq.isEmpty()) {
            int num = rpq.poll();
            sum += num*num;
        }
        System.out.println(sum);
        Arrays.stream(rpq.toArray()).mapToInt(x->(int)x*(int)x).sum();
       /* Arrays.sort(works);
        for(int i=0; i< n; i++) {
            if(works[works.length-1] < works[works.length-2])
                Arrays.sort(works);
            if(works[works.length-1] == 0)
                break;

            works[works.length-1] -= 1;
        }*/

       // System.out.println(Arrays.stream(works).map(x -> x*x).sum());

    }
    public static int getMaxIndex(int[] num) {
        int result = num[0];
        int index = 0;
        for(int i=1; i< num.length; i++) {
            if(result < num[i])
                index = i;
        }

        return index;
    }
}
