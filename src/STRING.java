import com.sun.xml.internal.fastinfoset.util.CharArray;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class STRING {
    public static void main(String[] args) {
        jadenCase();
        String a = "asda";
    }

    public static void jadenCase() {
        String s = "3people unFollowed Me";
        s = s.toLowerCase();
//        String[] strings =

        System.out.println(s);
    }

    public static void jadenCaseStringBuffer() {
        String s = "me E";
        String[] strings = s.split(" ");

        StringBuffer sb = new StringBuffer();

        for(int i=0; i< strings.length; i++) {
            StringBuffer temp = new StringBuffer(strings[i].toLowerCase());
            sb.append(temp.replace(0,1, String.valueOf(Character.toUpperCase(temp.charAt(0)))));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static void jadenCaseLambda() {
        String s = "3people unFollowed Me";
        String[] strings = s.split(" ");

        System.out.println(Arrays.stream(strings).map(String::toLowerCase).map(String::toCharArray).map(x->{
            x[0] = Character.toUpperCase(x[0]);
            return x;
        }).map(String::valueOf).collect(Collectors.joining(" ")));
    }

    public void replacee() {
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
