import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class magicsequence {
    public static void main(String[] args) {
        int[][] s = new int[][]{{4,5,8},{2,4,1},{1,9,7}};
        int[] num = new int[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> tmp = new ArrayList<>();


        for(int i=0; i< s.length; i++) {
            Arrays.stream(s[i]).forEach(x->tmp.add(x));
        }

        tmp.sort(Comparator.comparing(Integer::valueOf));
        List<Integer> temp = new ArrayList<>();
        List<Integer> tempE = new ArrayList<>();

        tmp.stream().forEach(System.out::println);
        for(int i=1; i< tmp.size(); i++) {
            if(tmp.get(i) == tmp.get(i-1)) {
                temp.add(tmp.get(i));
            }
        }
        System.out.println("");
        for(int i=0; i< 9; i++) {
            if(!tmp.contains(num[i])) {
                tempE.add(num[i]);
            }
        }
        int result = 0;

        for(int i=0; i< tempE.size(); i++) {
            result += Math.abs(temp.get(i)-tempE.get(i));
        }

        System.out.println(result);
    }
}
