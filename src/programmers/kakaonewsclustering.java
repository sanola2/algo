package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class kakaonewsclustering {
    public int solution(String str1, String str2) {
        List list1 = getList(str1);
        List list2 = getList(str2);
        double cnt = 0;

        if(list1.size() == 0 && list2.size() == 0)
            return 65536;

        for(int i=0; i< list2.size(); i++) {
            if(list1.contains(list2.get(i))) {
                list1.remove(list2.get(i));
                list2.remove(list2.get(i));
                i--;
                cnt++;
            }
         }

        int answer = (int)((cnt/(cnt + list1.size() + list2.size())) * 65536);
        return answer;
    }

    public List getList(String str) {
        String[] words = new String[str.length()-1];
        char[] chars = str.toLowerCase().toCharArray();

        for(int i=0; i< words.length; i++) {
            words[i] = "" + chars[i] + chars[i + 1];
        }

        return Arrays.stream(words).filter(x -> x.matches("^[a-zA-Z]+")).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        kakaonewsclustering a = new kakaonewsclustering();

        System.out.println(a.solution(	"handshake", "shake hands"));
    }
}
