package baek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sortrefbw {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int count;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        count = Integer.parseInt(br.readLine());

        Point[] points = new Point[count];
        for(int i=0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(points);

        for(int i=0; i < count; i++) {
            bw.write(points[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

class Point implements Comparable<Point>{
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {
        return this.y < point.y ? -1 : (this.y > point.y ? 1 : (this.x < point.x ? -1 : 1));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}