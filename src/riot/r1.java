package riot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class r1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> frequencyChanges = new ArrayList();
        long result = 0;

        while (st.hasMoreTokens()) {
            frequencyChanges.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=0; i< frequencyChanges.size(); i++)
            result += frequencyChanges.get(i);

        System.out.println(result);
    }
}
