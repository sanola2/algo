package coup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cp1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new LinkedHashMap();

        boolean check = true;
        while (check) {
            String input = br.readLine();
            String[] words = input.split(" ");

            Pattern pattern = Pattern.compile("([a-zA-Z]+)");
            for (int i = 0; i < words.length; i++) {
                Matcher matcher = pattern.matcher(words[i]);

                if (matcher.find()) {
                    String lowerWord = matcher.group(1).toLowerCase();
                    String word = "" + lowerWord.charAt(0) + lowerWord.charAt(lowerWord.length() - 1);

                    if (map.containsKey(word))
                        map.put(word, map.get(word) + 1);
                    else
                        map.put(word, 1);
                }
            }
            check = isEOF(br);
        }

        Iterator key = sort(map).iterator();
        String keyString;
        StringBuilder sb = new StringBuilder();
        while (key.hasNext()) {
            keyString = (String) key.next();
            sb.append(keyString + " " + map.get(keyString));
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static boolean isEOF(BufferedReader br) {
        boolean result = true;

        try {
            result = br.ready();
        } catch (IOException e) {
        }
        return result;
    }

    public static List sort(Map map) {
        List<String> list = new ArrayList();
        list.addAll(map.keySet());

        Collections.sort(list, (o1, o2) -> {
            Object a = map.get(o1);
            Object b = map.get(o2);
            return ((Comparable) b).compareTo(a);
        });

        return list;
    }
}
