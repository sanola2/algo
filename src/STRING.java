import java.util.Arrays;

public class STRING {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        StringBuffer sb = new StringBuffer(phone_number);

        for(int i=0; i< phone_number.length()-4; i++) {
            sb = sb.replace(i, i+1, "*");
        }

        System.out.println(sb.toString());

    }

    public void splittt() {
        String s = "-1 -2 -3 -4";

        String[] split = s.split(" ");

        int[] nums = Arrays.stream(split).mapToInt(Integer::valueOf).sorted().toArray();
        // split = Arrays.stream(split).mapToInt(Integer::valueOf).sorted().toArray(String[]::new);
        Arrays.stream(nums).forEach(System.out::println);
        String result = nums[0] + " " + nums[split.length-1];
        System.out.println(result);
    }
}
