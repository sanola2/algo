package programmers;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kakaodart {
    public int solution(String dartResult) {
        String[] words = dartResult.split("");
        int[] points = new int[4];
        Pattern regex = Pattern.compile("(^[0-9]$)");
        Matcher matcher;

        int j=0;
        for(int i=0; i< words.length; i++) {
            matcher = regex.matcher(words[i]);
            if(matcher.find()) {
                if(words[i].equals("1")) {
                    if(words[i+1].equals("0")) {
                        points[j] = 10;
                        i++;
                    } else
                        points[j] = 1;
                } else
                    points[j] = Integer.parseInt(words[i]);
                j++;
            } else {
                if(words[i].equals("D")) {
                    points[j-1] = (int) Math.pow(points[j-1], 2);
                } else if(words[i].equals("T")) {
                    points[j-1] = (int) Math.pow(points[j-1], 3);
                } else if(words[i].equals("*")) {
                    points[j-1] *= 2;
                    if(j>= 2)
                        points[j-2] *= 2;
                } else if(words[i].equals("#")) {
                    points[j-1] *= -1;
                }
            }
        }
        int answer = Arrays.stream(points).sum();
        return answer;
    }

    public static void main(String[] args) {
        kakaodart a = new kakaodart();

        System.out.println(a.solution("10D10D10D"));
    }
}
