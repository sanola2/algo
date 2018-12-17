package riot;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rr5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder polymer = new StringBuilder(br.readLine());
        int removeCharNum;

        int i = 0;
        while (i < polymer.length()-1) {
            int left = i;
            int right = i+1;
            removeCharNum = 0;
            while (left>= 0 && right < polymer.length()) {
                if (Character.isUpperCase(polymer.charAt(left))) {
                    if (polymer.charAt(left) != (char) (polymer.charAt(right) - 32))
                        break;
                } else {
                    if (polymer.charAt(left) != (char) (polymer.charAt(right) + 32))
                        break;
                }
                removeCharNum += 2;
                left--;
                right++;
            }
            left++;
            polymer.delete(left, right);
            int next = removeCharNum /2;
            i += 1 - next;
        }

        System.out.println(polymer.length());
    }
}
