import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class toCollection {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        int min = Arrays.stream(arr).sorted().findFirst().getAsInt();
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

        list.remove((Object)min);
        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(result.length);
    }
}
