import java.util.Arrays;

public class STRING {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";

        String[] split = s.split(" ");

        int[] nums = Arrays.stream(split).mapToInt(Integer::valueOf).sorted().toArray();
       // split = Arrays.stream(split).mapToInt(Integer::valueOf).sorted().toArray(String[]::new);
        Arrays.stream(nums).forEach(System.out::println);
        String result = nums[0] + " " + nums[split.length-1];
        System.out.println(result);
    }
}
