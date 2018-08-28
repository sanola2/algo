package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Test> pq = new PriorityQueue();
        PriorityQueue<Integer> pq2 = new PriorityQueue();
        PriorityQueue<Integer> rpq2 = new PriorityQueue<>(Collections.reverseOrder());


        Test a = new Test(1);
        Test b = new Test(10);
        Test c = new Test(3);

        pq.offer(a);
        pq.offer(b);
        pq.offer(c);

        rpq2.add(1);
        rpq2.add(10);
        rpq2.add(3);




        //Arrays.stream(pq.toArray()).forEach(System.out::println);
       //// Arrays.stream(pq2.toArray()).forEach(System.out::println);
        Arrays.stream(rpq2.toArray()).forEach(System.out::println);
        System.out.println(rpq2.poll());
        System.out.println(rpq2.poll());
        System.out.println(rpq2.poll());
       // System.out.println(pq2.poll());
       // System.out.println(pq2.poll());
    }
    static class Test implements Comparable<Test> {
        int num;

        public Test(int num) {
            this.num = num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        @Override
        public int compareTo(Test o) {
            if(num > o.num)
                return -1;
            else if(num < o.num)
                return 1;
            return 0;
        }
    }
}
