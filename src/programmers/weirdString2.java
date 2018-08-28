package programmers;

public class weirdString2 {
    public static void main(String[] args) {
        String answer = "";
        String s = "  tryas hello world";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            System.out.println(ss);
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            System.out.println(cnt);
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
            System.out.println(answer);
        }

        System.out.println(answer);
    }
}
