package kakaocofe;

import java.util.HashMap;
import java.util.Map;

public class kakao1 {
    public String[] solution(String[] record) {
        String[][] logs = new String[record.length][3];
        Map<String, String> userId = new HashMap<>();
        int cnt = 0;

        for(int i=0; i< record.length; i++) {
            logs[i] = record[i].split(" ");
            if(logs[i][0].equals("Enter") || logs[i][0].equals("Change")) {
                userId.put(logs[i][1], logs[i][2]);
            }
            if(logs[i][0].equals("Enter") || logs[i][0].equals("Leave"))
                cnt++;
        }

        String[] answer = new String[cnt];
        int j=0;
        for(int i=0; i< record.length; i++) {
            if(logs[i][0].equals("Enter")) {
                answer[j] = userId.get(logs[i][1]) + "님이 들어왔습니다.";
                j++;
            } else if (logs[i][0].equals("Leave")) {
                answer[j] = userId.get(logs[i][1]) + "님이 나갔습니다.";
                j++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        kakao1 a = new kakao1();

        System.out.println(a.solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan", "Change uid4567 Ryan"}));
    }
}
