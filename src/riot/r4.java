package riot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class r4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> linkedList = new LinkedList();
        int index = 1;

        linkedList.add(0);
        linkedList.add(1);
        for(int i=2; i<= n; i++) {
            index += 2;
            int size = linkedList.size();
            if(index > size) {
                index = index%size;
            }
            linkedList.add(index, i);
        }

        int result;
        if(index == 0) {
            result = linkedList.get(index +1);
        } else if(index == linkedList.size()-1) {
            result = linkedList.get(index - 1);
        } else {
            result = linkedList.get(index-1) + linkedList.get(index+1);
        }

        System.out.println(result);
    }
}
