package coup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cp3 {
    static int charNum;
    static int cipher;
    static LinkedList<String> linkedList;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] words = input.split(",");
        charNum = words.length;
        linkedList = new LinkedList<>();

        Pattern pattern = Pattern.compile("'(.*?)'");
        for(int i=0; i< words.length; i++) {
            Matcher matcher = pattern.matcher(words[i]);

            if(matcher.find())
                words[i] = matcher.group(1);
        }

        for(int i=1; i<= charNum; i++) {
            cipher = i;
            dfs(words, 0);
        }
    }

    static void dfs(String[] words, int n) {
        if(linkedList.size() == cipher) {
            for (int i = cipher - 1; i >= 0; i--)
                System.out.print(linkedList.get(i));
            System.out.println();
            return;
        }

        for(int i=n; i< charNum; i++) {
            linkedList.push(words[i]);
            dfs(words, i+1);
            linkedList.pop();
        }
    }
}
