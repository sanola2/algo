import java.util.Arrays;
import java.util.stream.Collectors;

public class STRING {
    public static void main(String[] args) {
        caesar2();
    }

    public static void caesar2() {
        String s = "xXyYzZ";
        int n = 3;
        char[] ab = s.toCharArray();

        for(int i = 0; i < ab.length; i++) {
            if(ab[i] <= 90 && ab[i]+n > 90)
                ab[i] = (char) (65 + ab[i]+n - 91);
            else if(ab[i] >= 97 && ab[i]+n >122)
                ab[i] = (char) (97 + ab[i]+n - 123);
            else if( ab[i] == 32)
                continue;
            else
                ab[i] = (char) (ab[i] + n);
        }
        String an = new String(ab);

        System.out.println(an);
    }

    public static void caesar() {
        String s = "Z";
        int n = 1;
        Object[] ab = s.chars().mapToObj(x -> {
            if(x == 90)
                return (char) (65 + 90 - x+n - 1);
            else if(x == 122)
                return (char) (97 + 122 - x+n - 1);
            else if( x == 32)
                return (char) x;
            else
                return (char) (x + n);
        }).toArray();
        char[] b = new char[ab.length];
        for(int i = 0; i< ab.length; i++) {
            System.out.println(ab[i]);
            b[i] = (char)ab[i];
        }
        String an = new String(b);


        System.out.println(an);
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
