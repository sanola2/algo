package programmers;

import java.util.Arrays;

public class weirdString {
    public static void main(String args[]) {
        String s = "   try hello world    strys   ";
        s+= 'a';
        String[] words = s.split(" ");
        String answer = "";
        System.out.println(words.length);
        Arrays.stream(words).forEach(System.out::println);

        for(int i=0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            for(int j=0; j< words[i].length(); j+=2) {
                temp[j] = Character.toUpperCase(temp[j]);
            }
            for(int k=1; k< words[i].length(); k+=2) {
                temp[k] = Character.toLowerCase(temp[k]);
            }
            answer += String.valueOf(temp) + " ";
        }
        answer = answer.substring(0, answer.length()-2);

        System.out.println(answer);
    }
}
