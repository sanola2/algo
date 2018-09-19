package test;

import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();


        tree.add(1);
        tree.add(2);

        tree.add(4);
        tree.add(4);
        tree.add(5);
        tree.add(7);
        tree.add(3);
        System.out.println(tree.descendingSet());
        System.out.println(tree.descendingIterator().next());
        System.out.println(tree.descendingIterator().next());
        System.out.println(tree.descendingIterator().next());
    }
}
