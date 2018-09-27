package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class list {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList();

        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.add(4);
        System.out.println("size : " + ll.size());
        System.out.println(ll.remove((Object)2));
        System.out.println("size : " + ll.size());
        System.out.println(ll.poll());
        System.out.println("size : " + ll.size());
        System.out.println(ll.poll());
        System.out.println("size : " + ll.size());
    }
}
