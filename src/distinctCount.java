import java.util.Arrays;
import java.util.List;

public class distinctCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // 중복된 요소가 있는지 확인.
        System.out.println(list.stream().distinct().count() != list.size());
    }
}
