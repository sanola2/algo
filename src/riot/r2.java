package riot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class r2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        long n = Long.parseLong(st.nextToken());
        long count = 0;
        int stringLength = s.length();

        if(n < stringLength) {
            for(int i=0; i< n; i++) {
                if('a' == s.charAt(i))
                    count++;
            }
        } else {
            for(int i=0; i< s.length(); i++) {
                if('a' == s.charAt(i))
                    count++;
            }
            count *= n / stringLength;

            long left =  n % stringLength;
            if(left != 0) {
                for(int i=0; i< left; i++) {
                    if('a' == s.charAt(i))
                        count++;
                }
            }
        }

        System.out.println(count);
    }
}
