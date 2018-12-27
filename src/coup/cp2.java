package coup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class cp2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int wordsNum = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new LinkedHashMap();

        for(int i=0; i< wordsNum; i++) {
            String[] words = br.readLine().split(",");
            map.put(words[0], Integer.parseInt(words[1]));
        }

        int synNum = Integer.parseInt(br.readLine());
        String[][] synWords = new String[synNum][2];
        for(int i=0; i< synNum; i++) {
            synWords[i] = br.readLine().split(",");
        }

        List[] duplicatedWords = new LinkedList[wordsNum - synNum];
        for(int i=0; i< wordsNum - synNum; i++) {
            duplicatedWords[i] = new LinkedList();
        }

        for(int i=0; i< synNum; i++) {
            for(int j=0; j< duplicatedWords.length; j++) {
                if(duplicatedWords[j].contains(synWords[0])) {
                    duplicatedWords[j].add(synWords[1]);
                }

            }
        }
        //todo
    }
}
