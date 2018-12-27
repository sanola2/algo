package coup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class cp4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] words = input.split(", ");
        int num = words.length;
        List<String> check = new ArrayList();
        PairData[] pairs = new PairData[num];
        int target = 0;

        for(int i=0; i< num; i++) {
            pairs[i] = new PairData();
        }

        for(int i=0; i< num; i++) {
            if(!check.contains(words[i])) {
                check.add(words[i]);
                pairs[i].setPairData(words[i], i);
            } else {
                for(int j=0; j< num; j++) {
                    if(words[i].equals(pairs[j].getKey())) {
                        pairs[j].addIdx(i);
                        target = j;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        List targetList = pairs[target].getIdx();
        sb.append(targetList.get(0));
        for(int i=1; i< targetList.size(); i++) {
            sb.append(", ");
            sb.append(targetList.get(i));
        }

        System.out.println(sb);
    }
}

class PairData {
    String key;
    List<Integer> idx = new ArrayList();

    public void setPairData(String key, int idx) {
        this.key = key;
        this.idx.add(idx);
    }

    public String getKey() {
        return key;
    }

    public void addIdx(int idx) {
        this.idx.add(idx);
    }

    public List getIdx() {
        return idx;
    }
}