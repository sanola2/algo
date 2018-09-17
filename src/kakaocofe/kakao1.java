package kakaocofe;

public class kakao1 {
    public String[] solution(String[] record) {
        String[][] logs = new String[record.length][3];
        String[][] temp = new String[record.length][3];
        int cnt = 0;

        for(int i=0; i< record.length; i++) {
            temp[i] = record[i].split(" ");
            logs[i][0] = temp[i][0];
            logs[i][1] = temp[i][1];
            if(temp[i].length < 3)
                logs[i][2] = "";
            else
                logs[i][2] = temp[i][2];
        }

        for(int i=0; i< record.length; i++) {
            if(logs[i][0].equals("Change")) {
                for(int j=0; j< i; j++) {
                    if(logs[i][1].equals(logs[j][1])) {
                        logs[j][2] = logs[i][2];
                    }
                }
                cnt++;
            } else if(logs[i][0].equals("Enter")) {
                for(int j=0; j< i; j++) {
                    if(logs[i][1].equals(logs[j][1])) {
                        logs[j][2] = logs[i][2];
                    }
                }
            }
        }

        String[] answer = new String[record.length - cnt];
        System.out.println(answer.length);
        for(int i=0; i< record.length; i++) {
            if(logs[i][0].equals("Enter")) {
               // System.out.println(logs[i][2] + "님이 들어왔습니다.");
                answer[i] = logs[i][2] + "님이 들어왔습니다.";

            } else if(logs[i][0].equals("Leave")) {
              //  System.out.println(logs[i][2] + "님이 나갔습니다.");
                answer[i] = logs[i][2] + "님이 나갔습니다.";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        kakao1 a = new kakao1();

        System.out.println(a.solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan", "Change uid4567 Ryan"}));
    }
}
