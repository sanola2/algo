import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}
