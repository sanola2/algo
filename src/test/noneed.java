package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class noneed {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        NameAge[] array = new NameAge[num];

        for(int i=0; i< num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i] = new NameAge(Integer.valueOf(st.nextToken()), st.nextToken());
        }
        Arrays.sort(array);
        for(int i=0; i< num; i++) {
            System.out.println(array[i]);
        }
    }
}
class NameAge implements Comparable<NameAge> {
    int age;
    String name;

    public NameAge(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(NameAge o) {
        if(this.age > o.age)
            return 1;
        else if (this.age == o.age)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }
}