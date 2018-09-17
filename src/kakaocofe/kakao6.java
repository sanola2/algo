package kakaocofe;

public class kakao6 {
    public int solution(String word, String[] pages) {
        int n = pages.length;
        int[] basicPoint = new int[n];
        int[] linkNum = new int[n];
        String[] url = new String[n];
        double[] answer = new double[n];

        for(int i=0; i< n; i++) {
            pages[i] = pages[i].toLowerCase();
        }

        for(int i=0; i< n; i++) {
          //  basicPoint[i] = pages[i].split("^[0-9" + word.toLowerCase() + ).length -1;
            basicPoint[i] = pages[i].split(word.toLowerCase()).length -1;
            linkNum[i] = (pages[i].split("a href=").length -1);
            url[i] = pages[i].substring(pages[i].indexOf("content=")+9, pages[i].indexOf("\"/>", pages[i].indexOf("content=")));
            System.out.println(basicPoint[i]);
            System.out.println(linkNum[i]);
            System.out.println(url[i]);
        }

        for(int i=0; i< n; i++) {
            answer[i] = basicPoint[i];
            for(int j=0; j< n; j++) {
                if(i != j) {
                    if(pages[j].contains(url[i])) {
                        answer[i] += basicPoint[j] / (double)linkNum[j];
                    }
                }
            }
        }

        int result = sort(answer);
        return result;
    }

    public int sort(double[] nums) {
        int[] ret = new int[nums.length];
        for(int i=0; i< nums.length; i++)
            ret[i] = i;

        for(int i=nums.length; i>0; i--) {
            for(int j=0; j< i-1; j++) {
                if (nums[j] < nums[j+1]) {
                    double temp1 = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp1;

                    int temp = ret[j];
                    ret[j] = ret[j+1];
                    ret[j+1] = temp;
                }
            }
        }

        return ret[0];
    }

    public static void main(String[] args) {
        kakao6 a = new kakao6();

      //  System.out.println(a.solution("blind", new String[]{"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://a.com\"/>\n</head>  \n<body>\nBlind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n<a href=\"https://b.com\"> Link to b </a>\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://b.com\"/>\n</head>  \n<body>\nSuspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n<a href=\"https://a.com\"> Link to a </a>\nblind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n<a href=\"https://c.com\"> Link to c </a>\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://c.com\"/>\n</head>  \n<body>\nUt condimentum urna at felis sodales rutrum. Sed dapibus cursus diam, non interdum nulla tempor nec. Phasellus rutrum enim at orci consectetu blind\n<a href=\"https://a.com\"> Link to a </a>\n</body>\n</html>"}));
        System.out.println(a.solution("Muzi", new String[]{"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\"/>\n</head>  \n<body>\n<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://www.kakaocorp.com\"/>\n</head>  \n<body>\ncon%\tmuzI92apeach&2<a href=\"https://hashcode.co.kr/tos\"></a>\n\n\t^\n</body>\n</html>"}));
    }
}
