import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sort {
    public static void main(String[] args) {
        String[] a = new String[]{"kim", "jane"};


        System.out.println(a.length);
    }

    public static void sorting() {
        String[] strings = new String[] {"sun", "bed", "car"};
        int n = 1;
        String[] re = null;

        re = Arrays.stream(strings).sorted((o1, o2) -> {
            if(o1.charAt(n) == o2.charAt(n))
                return o1.compareTo(o2);
            return Integer.valueOf(o1.charAt(n)).compareTo(Integer.valueOf(o2.charAt(n)));
        }).toArray(String[]::new);
        System.out.println(re[0]);
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
    }
}
