package riot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class r5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String polymer = br.readLine();
        LinkedList<Character> linkedList = new LinkedList();

        for(int i=0; i< polymer.length(); i++)
            linkedList.add(polymer.charAt(i));

        int i = 0;
        while (i < linkedList.size()-1) {
            if(Character.isUpperCase(linkedList.get(i))) {
                if(linkedList.get(i) == (char)(linkedList.get(i+1) - 32)) {
                    linkedList.remove(i+1);
                    linkedList.remove(i);
                    i-=2;
                }
            } else {
                if(linkedList.get(i) == (char)(linkedList.get(i+1) + 32)) {
                    linkedList.remove(i+1);
                    linkedList.remove(i);
                    i-=2;
                }
            }
            i++;
        }

        System.out.println(linkedList.size());
    }
}
